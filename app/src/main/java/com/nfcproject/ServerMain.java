package com.nfcproject;

import android.util.Log;

import com.nfcproject.entity.StoreDebuction;
import com.nfcproject.entity.StoreHouse;
import com.nfcproject.entity.StoreInfo;

import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServerMain {

    //登录
    public static Map login(String path, List<BasicNameValuePair> paramList) throws Exception {
        Map<String,String> map = null;
        JSONObject object= PostUtil.doPost(path,paramList);
        if(object!=null){
            map=new HashMap<>();
            try{
                map.put("status",String.valueOf(object.getString("status")));
                map.put("msg",String.valueOf(object.getString("msg")));
                JSONObject data=object.getJSONObject("data");
                map.put("emplyno",String.valueOf(data.getString("emplyno")));
                map.put("optype",String.valueOf(data.getString("optype")));
                map.put("grainName",String.valueOf(data.getString("grainName")));
                Log.i("zscdasdasds",map.toString());
            }catch (Exception e){
                e.printStackTrace();
                return map;
            }
        }
        return map;
    }

    //获取值仓仓库列表
    public static List<StoreHouse> getHouseList(String path, List<BasicNameValuePair> paramList, String selectedId) throws Exception {
        List<StoreHouse> list = null;
        JSONObject object= PostUtil.doPost(path,paramList);
        if(object!=null){
            try{
                if(String.valueOf(object.getString("status")).equals("200")){
                    list=new ArrayList<>();
                    JSONArray array=object.getJSONArray("data");
                    for(int i=0;i<array.length();i++){
                        try {
                            JSONObject data = array.getJSONObject(i);
                            StoreHouse house=new StoreHouse();
                            house.setHouseNum(String.valueOf(data.getString("houseNum")));
                            house.setHouseID(String.valueOf(data.getString("houseID")));
                            house.setSelected(false);
                            if(String.valueOf(data.getString("houseID")).equals(selectedId==null?"":selectedId)){
                                house.setSelected(true);
                            }
                            list.add(house);
                        }catch (Exception e){
                            e.printStackTrace();
                            continue;
                        }
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
                return list;
            }
        }
        return list;
    }

    //获取值仓加扣方式列表
    public static List<StoreDebuction>  getDebuctionList(String path, List<BasicNameValuePair> paramList) throws Exception {
        List<StoreDebuction> list = null;
        JSONObject object= PostUtil.doPost(path,paramList);
        if(object!=null){

            try{
                if(String.valueOf(object.getString("status")).equals("200")){
                    list=new ArrayList<>();
                    JSONArray array=object.getJSONArray("data");
                    for(int i=0;i<array.length();i++){
                        try {
                            JSONObject data = array.getJSONObject(i);
                            StoreDebuction storeDebuction=new StoreDebuction();
                            storeDebuction.setSd_key(String.valueOf(data.getString("sd_key")));
                            storeDebuction.setSd_value(String.valueOf(data.getString("sd_value")));
                            storeDebuction.setSelected(false);
                            if(String.valueOf(data.getString("sd_key")).equals("千克扣量")){
                                storeDebuction.setSelected(true);
                            }
                            list.add(storeDebuction);
                        }catch (Exception e){
                            e.printStackTrace();
                            continue;
                        }
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
               return list;
            }
        }
        return list;
    }



    //获取值仓信息
    public static StoreInfo getStoreInfo(String path, List<BasicNameValuePair> paramList) throws Exception {
        StoreInfo storeInfo = null;
        JSONObject object= PostUtil.doPost(path,paramList);
        if(object!=null){
            try{
                if(String.valueOf(object.getString("status")).equals("200")){
                    storeInfo=new StoreInfo();
                    JSONObject data=object.getJSONObject("data");
                    storeInfo.setStoreHouseID(data.getString("storeHouseID"));
                    storeInfo.setPrice(data.getString("price"));
                    storeInfo.setCarNum(data.getString("carNum"));
                    storeInfo.setLink(data.getString("link"));
                    storeInfo.setWorkType(data.getString("workType"));
                    storeInfo.setCusName(data.getString("cusName"));
                    storeInfo.setVaricty(data.getString("variety"));
                    storeInfo.setGrossweight(data.getString("grossWeight"));

                }
            }catch (Exception e){
                e.printStackTrace();
                return storeInfo;
            }
        }
        return storeInfo;
    }




    //值仓完成
    public static Map finish(String path, List<BasicNameValuePair> paramList) throws Exception {
        Map<String,String> map = null;
        JSONObject object=  PostUtil.doPost(path,paramList);
        if(object!=null){
            map=new HashMap<>();
            try{
                map.put("status",String.valueOf(object.getString("status")));
                map.put("msg",String.valueOf(object.getString("msg")));
            }catch (Exception e){
                e.printStackTrace();
                return map;
            }
        }
        Log.i("sdfsfsdfdasfds",map.toString());
        return map;
    }


    //重新化验
    public static Map again(String path, List<BasicNameValuePair> paramList) throws Exception {
        Map<String,String> map = null;
        JSONObject object= PostUtil.doPost(path,paramList);
        if(object!=null){
            map=new HashMap<>();
            try{
                map.put("status",String.valueOf(object.getString("status")));
                map.put("msg",String.valueOf(object.getString("msg")));
            }catch (Exception e){
                e.printStackTrace();
                return map;
            }
        }
        Log.i("sdfsfsdfdasfds",map.toString());
        return map;
    }


    //=========================================================================================
    //仓储查询
    public static String getHouseInfo(String path, List<BasicNameValuePair> paramList) throws Exception {
        String result = "";
        JSONObject object= PostUtil.doPost(path,paramList);
        if(object!=null){
            try{
                result = object.toString();
            }catch (Exception e){
                e.printStackTrace();
                return result;
            }
        }
        return result;
    }

    //粮情查询
    public static String showBarnRsvtempList(String path, List<BasicNameValuePair> paramList) throws Exception {
        String result = "";
        JSONArray object= PostUtil.doPostList(path,paramList);
        if(object!=null){
            try{
                result = object.toString();
            }catch (Exception e){
                e.printStackTrace();
                return result;
            }
        }
        return result;
    }

    //show3D
    public static String getShow3D(String path, List<BasicNameValuePair> paramList) throws Exception {
        String result = "";
        JSONObject object= PostUtil.doPost(path,paramList);
        if(object!=null){
            try{
                result = object.toString();
            }catch (Exception e){
                e.printStackTrace();
                return result;
            }
        }
        return result;
    }

}
