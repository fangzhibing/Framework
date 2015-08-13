package com.elephant.framework.controller;

import com.breadtrip.framework.R;
import com.elephant.framework.model.IModel.PoiModelCallback;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity implements IUiController,
		PoiModelCallback<Object> {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public void onResult(Object result, int requestCode) {

	}

	@Override
	public void onError(int errorCode, String errorMsg, int requestCode) {

	}

	@Override
	public void onBackClicked() {

	}

	@Override
	public void onLoadMore() {

	}

	@Override
	public void onSaveClicked() {

	}
}
