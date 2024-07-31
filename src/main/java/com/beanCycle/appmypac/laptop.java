package com.beanCycle.appmypac;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class laptop implements InitializingBean, DisposableBean{
	
	public double price ;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public laptop(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "laptop [price=" + price + "]";
	}

	public laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Method of laptop");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing method of laptop");
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
