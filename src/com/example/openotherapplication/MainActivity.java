package com.example.openotherapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	Button open_app1,open_app2;
	TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		open_app1=(Button)findViewById(R.id.open_app1);
		open_app2=(Button)findViewById(R.id.open_app2);
		textView=(TextView)findViewById(R.id.textViewId);
		open_app1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent =new Intent();
				/*
				 * new CompometName()�еĵ�һ������Ϊ�Ѿ���װ���ֻ������Ӧ�õİ������ڶ�������Ϊ���Ӧ�õ���Activity
				 * */
				intent.setComponent(new ComponentName("com.example.volleydemo01",
						"com.example.volleydemo01.MainActivity"));
				startActivity(intent);
				
			}
		});
		open_app2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent =new Intent();
				/*
				 * 
				 * ������ϵͳ�Դ���Ӧ�õİ�������Activity��Ҳ���Գ���������
				 * */
				intent.setComponent(new ComponentName("com.android.calendar", "com.android.calendar.LaunchActivity"));
				startActivity(intent);
				
			}
		});
	}

	
}
