package com.example.homework_12_26;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class C extends Activity {
	private TextView tv1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third);
		tv1 = (TextView) findViewById(R.id.text);
		// 接收值
		String string = getIntent().getStringExtra("da");
		// 日志
		Log.d("C", string);
		// 写入third页面的TextView
		tv1.setText(string);
	}
}
