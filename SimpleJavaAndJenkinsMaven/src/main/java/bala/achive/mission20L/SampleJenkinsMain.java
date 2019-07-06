package bala.achive.mission20L;

import bala.achive.mission20L.functional.SampleFunctionalInterface;

public class SampleJenkinsMain {

	public static void main(String[] args) {

		System.out.println("Hello Jenkins Application...");
		printName(name -> System.out.println("From Lambda expression -> Hello "+name+"!!"));
	}
	
	public static void printName(SampleFunctionalInterface sfi) {
		sfi.sampleFucntion("Balakrishna");
	}

}
