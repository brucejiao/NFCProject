
/**
* @method 初始化层，渲染所有的层
* @param {String} selector  选择器(用于将生成的html填充到该选择器对应的元素)
* @param {Array} data 用于生成层的二维数组
* @param {Number} max 最大值
* @param {Number} min 最小值
* @return {undefined} 无返回值
**/
function initFloor(selector, data, max, min){
	
	var floorFragments 	= [],
		data 			= data,
		len 			= data.length,
		i 				= 0,
		distance 		= dealDistance(len);

	for(; i < len; i = i+1){
		floorFragments.push( renderFloor(data[i], i, distance, len, max, min) );
	}

	$(selector).html( floorFragments.join("") );
	//或document.querySelector("#wrapper").innerHTML = floorFragments.join("");
}

/**
* @method 两层之间的间距
* @param {Number} len  总楼层数
* @return {Number} 间距数
* @warn 最多处理了7层
**/
function dealDistance(len){
	var distance = Math.floor( 14 / len );

	if(len < 4){
		distance = Math.floor( 14 / (len+1) );
	}

	return distance;
}
/**
* @method 渲染一层的结构
* @param {Array} dataArr 用于生成层的二维数组
* @param {Number} index  当前层的索引值
* @param {Number} distance 两层之间的间隔,即共分成几层(以背景图上的线的间隔为参考)
* @param {Number} floorTotals 总楼层数
* @param {Number} max 最大值
* @param {Number} min 最小值
* @return {String HtmlString} 返回生成的层的HTML
**/
function renderFloor(dataArr, index, distance, floorTotals, max, min){
	var floorHtml 	= '',
		i 			= 0,
		len 		= dataArr.length,
		//max			= Math.max.apply(null, dataArr.join(",").split(",")), //可用于计算每一层中的最大值
		spacing 	= 42,  //两层直接的间距(背景图片上面两条线之间的间距)
		bottom 		= spacing * (index+1) * distance;
		//bottom 		= spacing * index * distance + spacing;
		//bottom 		= spacing * index * distance*2; 7
		//7层特殊处理
		if(floorTotals == 5){
			bottom 		= spacing * index * (distance+1);
		}
		if(floorTotals >= 7){
			bottom 		= spacing * index * distance;
		}

	var sum = 0,
		cnt = 0;
	floorHtml += '<div class="floor" data-index="'+index+'" style="bottom: '+bottom+'px;">';
	for(; i < len; i++){
		floorHtml += renderRow( dataArr[i],{max: max, min: min});

		for(var j = 0, l = dataArr[i].length; j < l; j++) {
			sum += dataArr[i][j];
			cnt++;
		}
	}
	floorHtml += '<span class="floor-result skew-reverse">' + (sum / cnt).toFixed(1) + '℃</span>';
	floorHtml += '</div>';

	return floorHtml;
}

/**
* @method 生成一层中一行的结构
* @param {Array} data 用于生成行的数组
* @param {Json} specialMap 包含最大、最小值,如{max: 26, min: 5},可根据具体情况做优化
* @return {String HtmlString} 返回生成的层的HTML
**/
function renderRow(data, specialMap){
	var wrapperWidth= document.getElementById('wrapper').clientWidth;
		fragments 	= ['<div class="floor-row clear">'],
		colSize 	= data.length,
		i 			= 0,
		width 		= wrapperWidth / colSize,
		lineWidth 	= width * (colSize - 1),
		className 	= '';		
		//width 		= (wrapperWidth-4) / (colSize-1) + 'px';

	for(; i < colSize; i++){
		
		if(i == colSize-1){ width = '1px';}
		//如果当前值>=最大值 => 颜色红色
		if(data[i] >= specialMap.max){ className = 'text-red'; }

		//如果当前值<=最大值 => 颜色蓝色
		if(data[i] <= specialMap.min){ className = 'text-blue'; }

		fragments.push(
			'<div class="floor-col" style="width:'+width+'px;">'
				+'<span class="text skew-reverse '+className+'">'+data[i]+'</span>'
			+'</div>'
			);
		className = '';
	}
	fragments.push('<div class="line" style="width: '+lineWidth+'px;"></div>');
	fragments.push('</div>');
	return fragments.join("");
}



/**
* @method 生成右侧指示器楼层列表
* @param {Number} nums 楼层数
* @return {undefined} 无返回值
**/
function initHierarchyMenu(nums){
	var listHtml 	= [],
		len 	 	= nums,
		i 			= 0;
	for(; i < len; i++){
		listHtml.push('<li data-index="'+i+'">第'+(i+1)+'层<input type="checkbox" name="floor" checked="true" value="'+i+'" /></li>');
	}

	$("#container").find(".hierarchy-menu-list").html(listHtml.join(""));
}


/**
* @method 初始化右侧指示器中的特殊值(最高、最低、平均值)
* @param {Json} specialMap 包含最大、最小值,如{max: 26, min: 5, average: 15},可根据具体情况做优化
* @return {undefined} 无返回值
**/
//初始化特殊值
function initHierarchySpecial(specialMap){
	$("#container").find(".maxTemperature").text(specialMap.max);
	$("#container").find(".minTemperature").text(specialMap.min);
	$("#container").find(".averageTemperature").text(specialMap.average);
}

function parseData(dataStr) {
	var res  = typeof dataStr == 'string' ? JSON.parse(dataStr) : dataStr,
		br   = res.barnRsvtemp,
		bp   = res.barnPointrtemp,
		data = {};

	data['series']  = [];
	data['max']     = br.maxtemp || 0;
	data['min']     = br.mintemp || 0;
	data['average'] = br.averagetemp || 0;

	// 解析数据并转换格式
	if (bp && bp.length > 0){
		var layer,
			layerIdx,
			row;
		for (var i = 0, len = bp.length; i < len; i++) {
			layer    = bp[i];
			layerIdx = layer.layer - 1;

			if (!data['series'][layerIdx]) {
				data['series'][layerIdx] = [];
			}

			row = [];
			for(var p in layer) {
				if (layer.hasOwnProperty(p) && p.match(/^point\d+$/)) {
					row[Number(p.match(/\d+/)[0]) - 1] = layer[p];
				}
			}
			data['series'][layerIdx].push(row);
		}
	}

	return data;
}

function init(dataStr) {
	var modalData = parseData(dataStr);

	//初始化图层
	initFloor("#wrapper", modalData.series, modalData.max, modalData.min);

	//初始化指示图层数
	initHierarchyMenu(modalData.series.length);

	//初始化最高、最低、平均值
	initHierarchySpecial({
		max: modalData.max,
		min: modalData.min,
		average: modalData.average
	});
}

$(document).ready(function(){

	//指示图(隐藏/显示)切换
	$("#switchAction").click(function(){
		var $hierarchyMenu = $("#container").find(".hierarchy-menu");
		$hierarchyMenu.toggleClass('hide');
	});

	//点击指示器相应的楼层，切换相应层的状态(隐藏/显示)
	$("#container").on("click", ".hierarchy-menu-list > li",function(e){

		var $checkbox 	= $(this).children("input[name='floor']");
		var index = this.getAttribute("data-index");
		var $floorTarget = $("#wrapper").find(".floor[data-index="+index+"]");
		
		if($checkbox.prop('checked')){
			$checkbox.prop('checked', false)
			$floorTarget.addClass('visible-hidden');
		}else{
			$checkbox.prop('checked',true);
			$floorTarget.removeClass('visible-hidden');
		}

		return false;
	});

});
