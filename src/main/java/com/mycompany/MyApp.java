package com.mycompany;

public class MyApp {
	
	public MyApp() {
		System.out.println("Working dir: "+System.getProperty("working.dir"));
	}

	public static void main(String[] args) {
		new MyApp();
	}
}
