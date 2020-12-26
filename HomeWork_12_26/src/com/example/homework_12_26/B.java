package com.example.homework_12_26;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class B extends Activity {
	private Button b1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		// 接收第一个页面的值
		final String string = getIntent().getStringExtra("data");
		b1 = (Button) findViewById(R.id.bt_bing);
		b1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// 向 C页面跳转
				Intent intent = new Intent(B.this, C.class);
				// 向C页面传值
				intent.putExtra("da", string);
				startActivity(intent);
				// 打印B页面的日志信息
				Log.d("B", "hello");
			}
		});
	}
}
