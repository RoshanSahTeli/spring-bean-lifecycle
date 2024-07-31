package com.beanCycle.appmypac;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class pepsi {
	
public long price;

public long getPrice() {
	return price;
}

public void setPrice(long price) {
	System.out.println("setting price ...........");
	this.price = price;
}

public pepsi(long price) {
	super();
	this.price = price;
}

public pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "pepsi [price=" + price + "]";
}

@PostConstruct
public void post() {
	System.out.println("Initialization method");
}

@PreDestroy
public void pre() {
	System.out.println("destroy");
}
}
