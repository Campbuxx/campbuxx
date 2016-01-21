package com.campbuxx.util;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Timer  {

	// 执行参数
	private String para ;
	// 执行方法
	public void run() {
		// 定义输出的格式化日期，以便于区分调用
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("the para is : " + para + " ! Time is :" + format.format(new Date()));
	}	
	public String getPara() {
		return para;
	}	
	public void setPara(String para) {
		this.para = para;
	}	

}
