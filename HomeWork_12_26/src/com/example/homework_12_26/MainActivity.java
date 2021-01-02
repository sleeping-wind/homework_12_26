package com.example.homework_12_26;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button b1;
	private Button b2;
	private Button b3;
	private int sum = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		// 按钮绑定id
		b1 = (Button) findViewById(R.id.bt_jia);
		// 设置点击事件监听器
		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// 页面跳转
				Intent intent = new Intent(MainActivity.this, B.class);
				String s = Integer.toString(sum);
				// 向B页面传值（sum）
				intent.putExtra("data", s);
				startActivity(intent);
			}
		});
		b2 = (Button) findViewById(R.id.bt_yi);
		b2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// 点击一次，sum值加一
				sum++;
				// 输出日志信息
				String s = Integer.toString(sum);
				Log.d("MainActivity", s);
			}
		});
		b3 = (Button) findViewById(R.id.bt_duo);
		b3.setOnClickListener(new OnClickListener() {
		long[] mHits = new long[5]; //需要监听几次点击事件数组的长度就为几
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//将mHints数组内的所有元素左移一个位置
                System.arraycopy(mHits,1,mHits,0,mHits.length - 1);
                //获得当前系统已经启动的时间
                mHits[mHits.length - 1] = SystemClock.uptimeMillis();
                //点击的时间差小于500毫秒就认 为是连续点击
                if (mHits[0] >= (SystemClock.uptimeMillis() - 1000)){
                    startActivity(new Intent(MainActivity.this,Hello.class));
                }
			}
		});
	}
}
