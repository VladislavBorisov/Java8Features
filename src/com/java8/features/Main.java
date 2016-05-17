package com.java8.features;

public class Main implements Debuggable {
	  int a = 666;
	  String b = "Sherybedrock";
	  
	  public static void main(String[] args) {
	    Main m = new Main();
	    System.out.println(m.debug());
	  }
	}