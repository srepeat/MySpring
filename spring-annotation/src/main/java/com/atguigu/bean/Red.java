package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Red {
	
	private String car;

	public String getCar() {
		return car;
	}

	@Autowired
	public void setCar(String car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Red [car=" + car + "]";
	}
	

}
