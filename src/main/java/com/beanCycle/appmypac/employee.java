package com.beanCycle.appmypac;

public class employee {
	
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public employee(String name) {
		super();
		this.name = name;
	}
	
	
	
	
	@Override
	public String toString() {
		return "employee [name=" + name + "]";
	}

	public void init() {
		System.out.println("Init method");
	}
	
	public void destroy() {
		System.out.println("Destroy method");
	}

}
