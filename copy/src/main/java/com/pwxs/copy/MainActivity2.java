package com.pwxs.copy;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;

/**
 * 类描述:
 * 创建人:   tangchao
 * 创建时间: 2018/3/12 17:18
 * 联系方式: 419704299@qq.com
 * 修改人:   tangchao
 * 修改时间: 2018/3/12 17:18
 * 修改备注:  [说明本次修改内容]
 */
public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String path = "aaa/a1.txt";
        AssetsCopyTOSDcard assetsCopyTOSDcard = new AssetsCopyTOSDcard(getApplicationContext());
        assetsCopyTOSDcard.AssetToSD(path, Environment.getExternalStorageDirectory().toString() + "/" + path);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }
}
