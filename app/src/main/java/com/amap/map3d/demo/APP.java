package com.amap.map3d.demo;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.CsvFormatStrategy;
import com.orhanobut.logger.DiskLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;


/**
 * 类描述:
 * 创建人:   tangchao
 * 创建时间: 2018/3/12 9:56
 * 联系方式: 419704299@qq.com
 * 修改人:   tangchao
 * 修改时间: 2018/3/12 9:56
 * 修改备注:  [说明本次修改内容]
 */
public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OpenLogMethod();
    }
    /**
     * 方法描述: 开启日志记录方法
     * 创建人:  tangchao
     * 创建时间: 2017/10/23 12:37
     * 联系方式:419704299@qq.com
     */
    private void OpenLogMethod() {
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)  // (Optional) Whether to show thread info or not. Default true
                .methodCount(0)         // (Optional) How many method line to show. Default 2
                .methodOffset(3)        // (Optional) Skips some method invokes in stack trace. Default 5
//        .logStrategy(customLog) // (Optional) Changes the log strategy to print out. Default LogCat
                .tag("map")   // (Optional) Custom tag for each log. Default PRETTY_LOGGER
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));

        FormatStrategy formatStrategyLocation = CsvFormatStrategy.newBuilder()
                .tag("map")
                .build();
        Logger.addLogAdapter(new DiskLogAdapter(formatStrategyLocation));
    }
}
