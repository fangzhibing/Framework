package com.elephant.framework.model;

import java.util.HashMap;

public class Model implements IModel {

	@Override
	public void requestPoiList(HashMap<Double, Double> map,
			PoiModelCallback<Object> callback, int requestCode) {

	}

	@Override
	public void requestSearch(String keyword, int category, double latitude,
			double longitude, int start, int count,
			PoiModelCallback<Object> callback, int requestCode) {

	}

}
