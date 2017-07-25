package com.nfcproject.page;


import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.MifareClassic;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.nfcproject.AlertTip;
import com.nfcproject.R;
import com.nfcproject.ServerMain;
import com.nfcproject.entity.StoreDebuction;
import com.nfcproject.entity.StoreHouse;
import com.nfcproject.entity.StoreInfo;
import com.nfcproject.utils.CommUtil;
import com.nfcproject.utils.Contents;
import com.nfcproject.utils.SharePreferenceUtil1;

import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * NFC扫码界面
 */
public class NFCScannerActivity extends AppCompatActivity {
    private NFCScannerActivity mContext;
    private NfcAdapter nfcAdapter;
//    private  TextView tip;
    static NFCScannerActivity instance=null;
    private  String RFID_NUM="";
    private View main_view;
    private View bottom;
    private List<StoreDebuction> debuctionList;
    private LayoutInflater inflater = null;
    private PopupWindow menuWindow;
    private ListView listView;
    private ListView storehouse_listview;
    private View type;
    private TextView type_value;
    private EditText modify;
    private Button modify_sure;
    private TextView store_house;
    private TextView store_house2;
    private View modify_btn;
    private TextView varicty;
    private TextView price;
    private TextView car_num;
    private TextView cus_name;
    private TextView work_type;
    private TextView link;
    private TextView grossweight;

    private List<StoreHouse> houseList = null;
    private StoreInfo storeInfo=null;
    private Map<String ,String> finshMap=null;
    private Map<String ,String> againMap=null;
    private RadioGroup storehouse_type;
    private RadioButton  normal;
    private RadioButton  abnormal;
    private int storeHouseType=0;
    private String houseId=null;
    private String stopoffway=null;
    private EditText input;
    private TextView again;
    private TextView finish;
    private TextView title;

    @Bind(R.id.img_nfc)
    ImageView mImgNFC;
    @Bind(R.id.back)
    LinearLayout mBack;
    @Bind(R.id.toolbar)
    LinearLayout toolbar;

    SharePreferenceUtil1 share;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfc_scanner);
        mContext = this ;
        share = new SharePreferenceUtil1(mContext, "lk_data", 0);
        ButterKnife.bind(this);

        //FIXME 测试数据
//        RFID_NUM= Contents.TEST_DATA;


        String mUserId = share.getString(Contents.ID);
        String mOpttype  =share.getString(Contents.OPTTYPE);
        if(CommUtil.isNullOrBlank(mUserId)) {
            startActivity(new Intent(mContext,LKLoginActivity.class));
            finish();
        }else {
            if (!(mOpttype != null && mOpttype.equals("7"))) {
                Toast.makeText(getApplicationContext(), "请使用值仓员账号登录", Toast.LENGTH_LONG).show();
                startActivity(new Intent(mContext, LKHomeActivity.class));
                finish();
            }
            if (NFCScannerActivity.instance != null) {
                try {
                    NFCScannerActivity.instance.finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            instance = this;
            inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
            init();

            // 获取默认的NFC控制器
            nfcAdapter = NfcAdapter.getDefaultAdapter(this);
            if (nfcAdapter == null) {
//                tip.setText("设备不支持NFC");
                CommUtil.showAlert("设备不支持NFC",mContext);
                //Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();
                // finish();
                //return;
            } else {
                if (!nfcAdapter.isEnabled()) {
//                    tip.setText("请在系统设置中先启用NFC功能");
                    CommUtil.showAlert("请在系统设置中先启用NFC功能",mContext);
                    //Toast.makeText(getApplicationContext(),"请在系统设置中先启用NFC功能",Toast.LENGTH_LONG).show();
                    //finish();
                    //return;
                }
            }

        }
    }

    /**
     * 返回
     * @param view
     */
    @OnClick(R.id.back)
    public void onBack(View view){
        startActivity(new Intent(mContext, LKHomeActivity.class));
        finish();
    }

    public void init(){
        main_view=findViewById(R.id.main_view);
        bottom=findViewById(R.id.bottom);
        type=findViewById(R.id.type);
        type_value=(TextView) findViewById(R.id.type_value);
        type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(debuctionList!=null&&debuctionList.size()>0) {
                    showPopwindow(ShowView());
                }
            }
        });

        input=(EditText) findViewById(R.id.input);
        store_house=(TextView) findViewById(R.id.store_house);
        store_house2=(TextView) findViewById(R.id.store_house2);
        modify_btn= findViewById(R.id.modify_btn);
        modify_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(houseList!=null&&houseList.size()>0) {
                    showPopwindow(ShowStoreHouseView());
                }
            }
        });

        title=(TextView) findViewById(R.id.title);
        finish=(TextView) findViewById(R.id.finish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeHouseFinish();
            }
        });

        again=(TextView) findViewById(R.id.again);
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeHouseAgain();
            }
        });

        varicty=(TextView) findViewById(R.id.varicty);
        price=(TextView) findViewById(R.id.price);
        car_num=(TextView) findViewById(R.id.car_num);
        cus_name=(TextView) findViewById(R.id.cus_name);
        work_type=(TextView) findViewById(R.id.work_type);
        link=(TextView) findViewById(R.id.link);
        grossweight=(TextView) findViewById(R.id.grossweight);

        storehouse_type=(RadioGroup)findViewById(R.id.storehouse_type);
        normal=(RadioButton) findViewById(R.id.normal);
        abnormal=(RadioButton) findViewById(R.id.abnormal);
        storehouse_type.setOnCheckedChangeListener(new OnCheckedChangeListenerImp());

//        tip = (TextView) findViewById(tip);

        String mUsername = share.getString(Contents.USERNAME);
        finish.setText(mUsername+"值仓");
        title.setText(mUsername);
    }


    private class OnCheckedChangeListenerImp implements RadioGroup.OnCheckedChangeListener {
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (normal.getId() == checkedId) {
                storeHouseType=1;
            } else if (abnormal.getId() == checkedId) {
                storeHouseType=2;
            }
        }
    }





    @Override
    protected void onResume() {
        super.onResume();
        String mUserId = share.getString(Contents.ID);
        String mOpttype  =share.getString(Contents.OPTTYPE);
        String mUsername = share.getString(Contents.USERNAME);
        if(mUserId!=null&&mUserId.length()>0) {

            //得到是否检测到ACTION_TECH_DISCOVERED触发
            if (NfcAdapter.ACTION_TECH_DISCOVERED.equals(getIntent().getAction())) {
                //处理该intent
                processIntent(getIntent());
                if(RFID_NUM!=null&&RFID_NUM.length()>0){
                    System.out.println(RFID_NUM);
                    getHouseInfo(RFID_NUM);
                    //FIXME =============================================================测试数据==================================
//                    testData();
                }else{
                    Toast.makeText(getApplicationContext(),"读取失败,请重新读取",Toast.LENGTH_LONG).show();
                }

            }
        }else{
            startActivity(new Intent(mContext,LKLoginActivity.class));
            finish();
        }
    }
    //字符序列转换为16进制字符串
    private String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        char[] buffer = new char[2];
        for (int i = 0; i < src.length; i++) {
            buffer[0] = Character.forDigit((src[i] >>> 4) & 0x0F, 16);
            buffer[1] = Character.forDigit(src[i] & 0x0F, 16);
            if(String.valueOf(buffer[0]).equals("3")){
                stringBuilder.append(buffer[1]);
            }
            System.out.println(buffer);
        }
        return stringBuilder.toString();
    }

    private void processIntent(Intent intent) {
        //取出封装在intent中的TAG
        Tag tagFromIntent = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG);
        boolean auth = false;
        //读取TAG
        MifareClassic mfc = MifareClassic.get(tagFromIntent);
        try {
            mfc.connect();
            int sectorCount = mfc.getSectorCount();//获取TAG中包含的扇区数
            for (int j = 0; j < sectorCount; j++) {
                auth = mfc.authenticateSectorWithKeyA(j,MifareClassic.KEY_DEFAULT);
                int bCount;
                int bIndex;
                if (auth) {
                    // 读取扇区中的块
                    bCount = mfc.getBlockCountInSector(j);
                    bIndex = mfc.sectorToBlock(j);
                    for (int i = 0; i < bCount; i++) {
                        if(bIndex==4||bIndex==5){
                            byte[] data = mfc.readBlock(bIndex);
                            RFID_NUM += bytesToHexString(data);
                        }
                        bIndex++;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void setView(){
        if(RFID_NUM!=null&&RFID_NUM.length()>0){
//            tip.setVisibility(View.GONE);
            mImgNFC.setVisibility(View.GONE);
            toolbar.setVisibility(View.VISIBLE);
            main_view.setVisibility(View.VISIBLE);
            bottom.setVisibility(View.VISIBLE);
        }else{
            Toast.makeText(getApplicationContext(),"读取失败,请重新读取",Toast.LENGTH_LONG).show();
        }
    }

    private void getHouseList() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String mUserId = share.getString(Contents.ID);
                    List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
                    list.add(new BasicNameValuePair("emplyno", mUserId));
                    houseList= ServerMain.getHouseList(getResources().getString(R.string.path)+getResources().getString(R.string.getHouseList),list,storeInfo.getStoreHouseID());
                    houseListHandler.sendMessage(new Message());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    Handler houseListHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(houseList!=null&&houseList.size()>0){
                boolean noHouse=false;
                for(int i=0;i<houseList.size();i++){
                    if(houseList.get(i).isSelected()){
                        noHouse=true;
                        houseId=houseList.get(i).getHouseID();
                        store_house.setText(houseList.get(i).getHouseNum());
                        store_house2.setText(houseList.get(i).getHouseNum());
                    }
                }
                if(!noHouse){
                    showTip();
                }
            }else{
                Toast.makeText(getApplicationContext(),"该员工无保管仓房！",Toast.LENGTH_LONG).show();
            }
        }
    };



    private void showTip() {
        final AlertTip delDialog = new AlertTip(mContext, "温馨提示","该车非本仓卸粮，是否继续？", "取消", "确认");
        delDialog.setCancelable(false);
        delDialog.show();
        delDialog.setClicklistener(new AlertTip.ClickListenerInterface() {
                                       public void doLeft() {
                                           delDialog.dismiss();
                                           finish();
                                       }
                                       public void doRight() {
                                           delDialog.dismiss();
                                       }
                                   }
        );
    }

    private void getDebuctionList() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String mUserId = share.getString(Contents.ID);
                    List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
                    list.add(new BasicNameValuePair("emplyno",mUserId));
                    debuctionList= ServerMain.getDebuctionList(getResources().getString(R.string.path)+getResources().getString(R.string.getDebuctionList),list);
                    debuctionListHandler.sendMessage(new Message());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    Handler debuctionListHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(debuctionList!=null&&debuctionList.size()>0){
                for(int i=0;i<debuctionList.size();i++){
                    if(debuctionList.get(i).isSelected()){
                        type_value.setText(debuctionList.get(i).getSd_key());
                        stopoffway=debuctionList.get(i).getSd_value();
                    }
                }

            }else{
                Toast.makeText(getApplicationContext(),"该员工无保管仓房！",Toast.LENGTH_LONG).show();
            }

        }
    };


    private void getHouseInfo(final String businessNum) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String mUserId = share.getString(Contents.ID);
                    List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
                    list.add(new BasicNameValuePair("businessNum", businessNum));
                    list.add(new BasicNameValuePair("emplyno", mUserId));
                    storeInfo= ServerMain.getStoreInfo(getResources().getString(R.string.path)+getResources().getString(R.string.getStoreInfo),list);
                    houseInfoHandler.sendMessage(new Message());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    Handler houseInfoHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(storeInfo!=null){
                setView();
                varicty.setText(storeInfo.getVaricty());
                price.setText(storeInfo.getPrice());
                car_num.setText(storeInfo.getCarNum());
                cus_name.setText(storeInfo.getCusName());
                grossweight.setText(storeInfo.getGrossweight());

                if(storeInfo.getWorkType().equals("1")){
                    work_type.setText("入库");
                }else if(storeInfo.getWorkType().equals("2")){
                    work_type.setText("出库");
                }
                if(storeInfo.getLink().equals("3")){
                    link.setText("已称毛");
                }else if(storeInfo.getLink().equals("5")){
                    link.setText("已称皮");
                }

                getHouseList();
                getDebuctionList();

            }else{
                Toast.makeText(getApplicationContext(),"没有该业务单号对应的登记信息",Toast.LENGTH_LONG).show();
            }
        }
    };


    void setStoreHouse(int position){
        List<StoreHouse> data = new ArrayList<StoreHouse>();
        for(int i=0;i<houseList.size();i++){
            StoreHouse type=houseList.get(i);
            type.setSelected(false);
            if(position==i){
                houseId=type.getHouseID();
                type.setSelected(true);
            }
            data.add(type);
        }
        houseList=data;
    }

    void set(int position){
        List<StoreDebuction> data = new ArrayList<StoreDebuction>();
        for(int i=0;i<debuctionList.size();i++){
            StoreDebuction type=debuctionList.get(i);
            type.setSelected(false);
            if(position==i){
                stopoffway=type.getSd_value();
                type.setSelected(true);
            }
            data.add(type);
        }
        debuctionList=data;
    }

    private View ShowView() {
        final View view = inflater.inflate(R.layout.type_list, null);
        listView=(ListView) view.findViewById(R.id.list_view);
        listView.setAdapter(new Adapter());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                type_value.setText(debuctionList.get(position).getSd_key());
                set(position);
                menuWindow.dismiss();
            }
        });
        return view;
    }


    private View ShowStoreHouseView() {
        final View view = inflater.inflate(R.layout.storehouse_list, null);
        storehouse_listview=(ListView) view.findViewById(R.id.storehouse_listview);
        storehouse_listview.setAdapter(new StoreHouseAdapter());
        storehouse_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                store_house.setText(houseList.get(position).getHouseNum());
                store_house2.setText(houseList.get(position).getHouseNum());
                setStoreHouse(position);
                menuWindow.dismiss();
            }
        });
        return view;
    }



    private View ModifyView() {
        final View view = inflater.inflate(R.layout.modify, null);
        modify=(EditText) view.findViewById(R.id.modify);
        modify_sure=(Button) view.findViewById(R.id.modify_sure);
        modify.setText(store_house.getText().toString());
        modify.setSelection(store_house.getText().toString().length());
        modify_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(modify.getText().toString().trim().length()>0){
                    store_house.setText(modify.getText().toString().trim());
                    store_house2.setText(modify.getText().toString().trim());
                    menuWindow.dismiss();
                }else{
                    Toast.makeText(mContext,"请输入值仓仓库",Toast.LENGTH_LONG).show();
                }
            }
        });
        return view;
    }


    public class StoreHouseAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return houseList.size();
        }

        @Override
        public Object getItem(int i) {
            return houseList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(final int i, View view, ViewGroup viewGroup) {
            View v  = View.inflate(mContext, R.layout.adapter, null);
            TextView type=(TextView)v.findViewById(R.id.type);

            ImageView selected=(ImageView)v.findViewById(R.id.selected);
            type.setText(houseList.get(i).getHouseNum());
            if(houseList.get(i).isSelected()){
                selected.setImageResource(R.mipmap.selected);
            }else{
                selected.setImageResource(R.mipmap.select);
            }
            return v;
        }
    }

    public class Adapter extends BaseAdapter {

        @Override
        public int getCount() {
            return debuctionList.size();
        }

        @Override
        public Object getItem(int i) {
            return debuctionList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(final int i, View view, ViewGroup viewGroup) {
            View v  = View.inflate(mContext, R.layout.adapter, null);
            TextView type=(TextView)v.findViewById(R.id.type);

            ImageView selected=(ImageView)v.findViewById(R.id.selected);
            type.setText(debuctionList.get(i).getSd_key());
            if(debuctionList.get(i).isSelected()){
                selected.setImageResource(R.mipmap.selected);
            }else{
                selected.setImageResource(R.mipmap.select);
            }
            return v;
        }
    }

    private void  showPopwindow(View view) {
        menuWindow = new PopupWindow(view, ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        menuWindow.setFocusable(true);
        menuWindow.setBackgroundDrawable(new BitmapDrawable());
        menuWindow.showAtLocation(view, Gravity.CENTER_HORIZONTAL, 0, 0);
        menuWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                menuWindow = null;
            }
        });
    }




    public void storeHouseFinish() {
        String mUserId = share.getString(Contents.ID);
        if(!empty(RFID_NUM)){
            Toast.makeText(mContext,"业务单号错误",Toast.LENGTH_LONG).show();
            return;
        }
        if(!empty(mUserId)){
            startActivity(new Intent(mContext,LKLoginActivity.class));
            finish();
            return;
        }
        if(!empty(houseId)){
            Toast.makeText(mContext,"请选择值仓仓库",Toast.LENGTH_LONG).show();
            return;
        }

        if(!(storeHouseType==1||storeHouseType==2)){
            Toast.makeText(mContext,"请选择值仓状况",Toast.LENGTH_LONG).show();
            return;
        }

        if(!empty(stopoffway)){
            Toast.makeText(mContext,"请选择加扣方式",Toast.LENGTH_LONG).show();
            return;
        }
        if(input.getText().toString().trim().length()<=0){
            Toast.makeText(mContext,"请输入扣量值",Toast.LENGTH_LONG).show();
            return;
        }



        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String mUserId = share.getString(Contents.ID);
                    List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
                    list.add(new BasicNameValuePair("businessNum", RFID_NUM));
                    list.add(new BasicNameValuePair("emplyno", mUserId));
                    list.add(new BasicNameValuePair("houseId", houseId));
                    list.add(new BasicNameValuePair("stopoffway", stopoffway));
                    list.add(new BasicNameValuePair("stooffother", input.getText().toString().trim()));
                    list.add(new BasicNameValuePair("flag2", String.valueOf(storeHouseType))); //正常值仓就1，需换仓就2
                    finshMap= ServerMain.finish(getResources().getString(R.string.path)+getResources().getString(R.string.finish),list);
                    finshHandler.sendMessage(new Message());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    Handler finshHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(finshMap!=null){
                if(finshMap.get("status").equals("200")){
                    Toast.makeText(getApplicationContext(),"值仓成功",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(),NFCScannerActivity.class));
                    finish();
                }else if(finshMap.get("status").equals("400")){
                    Toast.makeText(getApplicationContext(),finshMap.get("msg"),Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"提交失败",Toast.LENGTH_LONG).show();
                }
            }else{
                Toast.makeText(getApplicationContext(),"提交失败",Toast.LENGTH_LONG).show();
            }
        }
    };



    public void storeHouseAgain() {
        String mUserId = share.getString(Contents.ID);
        if(!empty(RFID_NUM)){
            Toast.makeText(mContext,"业务单号错误",Toast.LENGTH_LONG).show();
            return;
        }
        if(!empty(mUserId)){
            startActivity(new Intent(mContext,LKLoginActivity.class));
            finish();
            return;
        }
        if(!empty(houseId)){
            Toast.makeText(mContext,"请选择值仓仓库",Toast.LENGTH_LONG).show();
            return;
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String mUserId = share.getString(Contents.ID);
                    List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
                    list.add(new BasicNameValuePair("businessNum", RFID_NUM));
                    list.add(new BasicNameValuePair("emplyno", mUserId));
                    list.add(new BasicNameValuePair("houseId", houseId));
                    list.add(new BasicNameValuePair("flag", "2"));
                    againMap= ServerMain.again(getResources().getString(R.string.path)+getResources().getString(R.string.finish),list);
                    againHandler.sendMessage(new Message());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    Handler againHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(againMap!=null){
                if(againMap.get("status").equals("200")){
                    Toast.makeText(getApplicationContext(),againMap.get("msg"),Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(),NFCScannerActivity.class));
                    finish();
                }else if(againMap.get("status").equals("400")){
                    Toast.makeText(getApplicationContext(),againMap.get("msg"),Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"提交失败",Toast.LENGTH_LONG).show();
                }
            }else{
                Toast.makeText(getApplicationContext(),"提交失败",Toast.LENGTH_LONG).show();
            }
        }
    };
    public boolean empty(String value){
        if(value==null){
            return false;
        }
        if(value.length()<=0){
            return false;
        }

        return true;
    }

    //FIXME ==============================测试数据=================================
    private void testData(){
            setView();
        mImgNFC.setVisibility(View.GONE);
            varicty.setText("1111");
            price.setText("10元");
            car_num.setText("88");
            cus_name.setText("jiao");
            grossweight.setText("12");
             work_type.setText("入库");
            link.setText("已称毛");
//            getHouseList();
//            getDebuctionList();


    }
}