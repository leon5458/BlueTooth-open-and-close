package com.hly.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private BluetoothAdapter mBluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        findViewById(R.id.open).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBluetoothAdapter == null) {
                    Toast.makeText(MainActivity.this, "暂无蓝牙功能", Toast.LENGTH_SHORT).show();
                    return;
                }
                mBluetoothAdapter.enable();
            }
        });
        findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBluetoothAdapter == null) {
                    Toast.makeText(MainActivity.this, "暂无蓝牙功能", Toast.LENGTH_SHORT).show();
                    return;
                }
                mBluetoothAdapter.disable();
                if (mBluetoothAdapter.disable()) {
                    Toast.makeText(MainActivity.this, "关闭成功", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
