package com.elephant.framework.view;

import com.elephant.framework.bean.Data;

public interface IUi {

	/**
	 * 填充数据
	 * 
	 */
	public void setSpotData(Data spots);

	/** 加载动画 */
	public void loading();

	/** 刷新数据 */
	public void notifySpotDataChanged();

	/**
	 * 设置能否上拉加载
	 * 
	 * @param enable
	 */
	public void setPullLoadEnable(boolean enable);
}
