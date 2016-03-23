package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        return Double.parseDouble(System.getProperty("java.specification.version"));
    }

    public static void main(String[] args) {
	    String version = System.getProperty("java.specification.version");
      System.out.println(version);
    }
}
