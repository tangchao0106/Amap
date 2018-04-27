package com.amap.map3d.demo;

import android.app.Activity;
import android.os.Bundle;


import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;
import com.amap.api.maps.MapsInitializer;
import com.amap.map3d.demo.util.OffLineMapUtils;
import com.orhanobut.logger.Logger;

/**
 * 类描述:
 * 创建人:   tangchao
 * 创建时间: 2018/3/18 16:34
 * 联系方式: 419704299@qq.com
 * 修改人:   tangchao
 * 修改时间: 2018/3/18 16:34
 * 修改备注:  [说明本次修改内容]
 */
public class TestAmap extends Activity {
    MapView mapView;
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
//        super.onCreate(savedInstanceState, persistentState);
//
////        MapsInitializer.sdcardDir = OffLineMapUtils.getSdCacheDir(this);
//        setContentView(R.layout.amap_layout);
////        mapView = (MapView) findViewById(R.id.map);
////        mapView.onCreate(savedInstanceState);// 此方法必须重写
////        AMap aMap = mapView.getMap();
////        Logger.d("TestAmap===onCreate:aMap= "+aMap);
//    }

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amap_layout);
        	    /*
         * 设置离线地图存储目录，在下载离线地图或初始化地图设置;
         * 使用过程中可自行设置, 若自行设置了离线地图存储的路径，
         * 则需要在离线地图下载和使用地图页面都进行路径设置
         * */
        //Demo中为了其他界面可以使用下载的离线地图，使用默认位置存储，屏蔽了自定义设置
        MapsInitializer.sdcardDir = OffLineMapUtils.getSdCacheDir(this);

        Logger.d("BasicMapActivity===onCreate: "+MapsInitializer.getVersion());
        Logger.d("BasicMapActivity===onCreate: "+OffLineMapUtils.getSdCacheDir(this));

        mapView = (MapView) findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);// 此方法必须重写
                AMap aMap = mapView.getMap();
        Logger.d("TestAmap===onCreate:aMap= "+aMap);
    }
}
