package com.example.homework_12_26;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button b1;
	private Button b2;
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

	}
}
