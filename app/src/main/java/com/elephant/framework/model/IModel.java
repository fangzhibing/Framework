package com.elephant.framework.model;

import java.util.HashMap;

import android.support.annotation.NonNull;

public interface IModel {
	public static final int ERROR_NO_NET = 1;// 没有网络
	public static final int ERROR_PARSE = 2;// 解析异常
	public static final int ERROR_SERVER_STATUS = 3;// 服务器status错误

	public static final int REQUEST_CODE_POI_DATA = 0;// 请求poi数据
	public static final int REQUEST_CODE_SEARCH = 1;// 搜索

	/**
	 * 获取poi数据
	 * 
	 * @param map
	 *            经纬度点集
	 * @param callback
	 *            结果回调
	 * @param requestCode
	 *            请求什么数据 REQUEST_CODE_POI_DATA, REQUEST_CODE_SEARCH
	 */
	public void requestPoiList(HashMap<Double, Double> map,
			PoiModelCallback<Object> callback, int requestCode);

	public interface PoiModelCallback<T> {
		/**
		 * 请求数据结果返回
		 * 
		 * @param result
		 * @param requestCode
		 */
		public void onResult(@NonNull T result, int requestCode);

		/**
		 * 请求数据失败回调 errorCode 取值为ERROR_NO_NET, ERROR_PARSE, ERROR_SERVER_STATUS
		 * 
		 * @param errorCode
		 * @param errorMsg
		 * @param requestCode
		 */
		public void onError(int errorCode, String errorMsg, int requestCode);
	}

	/**
	 * 搜索poi
	 * 
	 * @param text
	 * @param category
	 * @param latitude
	 * @param longitude
	 * @param step
	 * @param callback
	 * @param requestCode
	 */
	public void requestSearch(String keyword, int category, double latitude,
			double longitude, int start, int count,
			PoiModelCallback<Object> callback, int requestCode);

}
