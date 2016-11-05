package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
      String rawVersion = System.getProperty("java.version");
      String[] splitVersion = rawVersion.split("\\.");
      String version = splitVersion[0] + "." + splitVersion[1];
      System.out.println(version);
      return Double.parseDouble(version);
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
    }
}
