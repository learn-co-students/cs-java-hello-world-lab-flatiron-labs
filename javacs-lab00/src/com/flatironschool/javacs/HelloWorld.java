package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
      // I won't work!
      System.out.println(System.getProperty("version"));
      return Double.parseDouble(System.getProperty("version"));

    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
      getVersion();
    }
}
