package com.amap.map3d.demo.overlay;

import android.view.View;

import com.amap.api.maps.model.Marker;

/**
 * 类描述:
 * 创建人:   tangchao
 * 创建时间:  2018/1/4 17:16
 * 联系方式:419704299@qq.com
 * 修改人:    tangchao
 * 修改时间: 2018/1/4 17:16
 * 修改备注:  [说明本次修改内容]
 */
public interface InfoWindowAdapter {
    View getInfoWindow(Marker marker);
    View getInfoContents(Marker marker);
}
