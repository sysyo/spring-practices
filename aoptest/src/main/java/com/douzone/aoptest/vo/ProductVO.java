package com.douzone.aoptest.vo;

public class ProductVO {
	private String name;
	
	public ProductVO(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProductVO [name=" + name + "]";
	}
	
	
}
