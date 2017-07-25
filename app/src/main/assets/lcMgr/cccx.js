var ccData={
    "id": 2,
    "housenum": "2",
    "dept": "仓储科",
    "goodsnum": 1,
    "floornum": "2",
    "user": "李刚",
    "housespace": 6000000,
    "housetype": "平房仓",
    "delivery": {
        "date": 4,
        "day": 2,
        "hours": 0,
        "minutes": 0,
        "month": 3,
        "seconds": 0,
        "time": 1491235200000,
        "timezoneOffset": -480,
        "year": 117
    },
    "walllength": 50,
    "housenumber": 4,
    "wall": "",
    "wallwide": 24,
    "househeight": 5.33,
    "roof": "",
    "housewide": 3.65,
    "roomframe": "",
    "fluetype": "地上笼",
    "ground": "混凝土",
    "ventilatenum": 8,
    "axialflowfannum": 8,
    "checkcapacity": 6000000,
    "chambervolume": 6170.88,
    "heatinsulation": "保温材料",
    "stutas": "未装粮",
    "graintproperty": "省级储备粮",
    "grainttype": "小麦",
    "graintcount": 5000000,
    "grade": "二等",
    "grainyear": "2014",
    "owner": "省储",
    "inBeginTime": {
        "date": 12,
        "day": 1,
        "hours": 16,
        "minutes": 36,
        "month": 5,
        "seconds": 41,
        "time": 1497256601000,
        "timezoneOffset": -480,
        "year": 117
    },
    "storeBeginTime": {
        "date": 5,
        "day": 3,
        "hours": 16,
        "minutes": 50,
        "month": 6,
        "seconds": 6,
        "time": 1499244606000,
        "timezoneOffset": -480,
        "year": 117
    },
    "houseStoreID": "201706012"
}

function init(ccData) {
	//var ccData = parseData(dataStr);
	$("#housenum").val(ccData.housenum);
	$("#dept").val(ccData.dept);
	$("#goodsnum").val(ccData.goodsnum);
	//$("#floornum").val(ccData.floornum);
	$("#user").val(ccData.user);	
	$("#housespace").val(ccData.housespace);
	$("#housetype").val(ccData.housetype);
	$("#delivery").val(ccData.delivery);
	$("#walllength").val(ccData.walllength);
	$("#housenumber").val(ccData.housenumber);	
	$("#wall").val(ccData.wall);
	$("#wallwide").val(ccData.wallwide);
	$("#househeight").val(ccData.househeight);
	$("#roof").val(ccData.roof);
	$("#eavesheight").val(ccData.eavesheight);	
	$("#housewide").val(ccData.housewide);
	$("#roomframe").val(ccData.roomframe);
	$("#topheight").val(ccData.topheight);
	$("#fluetype").val(ccData.fluetype);
	$("#ground").val(ccData.ground);
	
	$("#silood").val(ccData.silood);
	$("#ventilatenum").val(ccData.ventilatenum);
	$("#designcapacity").val(ccData.designcapacity);
	$("#siloinnerdiameter").val(ccData.siloinnerdiameter);
	$("#axialflowfannum").val(ccData.axialflowfannum);	
	$("#checkcapacity").val(ccData.checkcapacity);
	$("#wallthickness").val(ccData.wallthickness);
	$("#shortpositionwgd").val(ccData.shortpositionwgd);
	$("#pilegrainlinehigh").val(ccData.pilegrainlinehigh);
	$("#chambervolume").val(ccData.chambervolume);	
	$("#heatinsulation").val(ccData.heatinsulation);
	$("#stutas").val(ccData.stutas);
	$("#graintproperty").val(ccData.graintproperty);
	$("#grainttype").val(ccData.grainttype);
	$("#graintcount").val(ccData.graintcount);	
	$("#grade").val(ccData.grade);
	$("#grainyear").val(ccData.grainyear);
	$("#owner").val(ccData.owner);
	$("#inBeginTime").val(ccData.inBeginTime);
	$("#storeBeginTime").val(ccData.storeBeginTime);
}

