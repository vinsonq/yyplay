package com.tgb.jvm.classloader;

/**
 * Created by yangyu on 16/8/1.
 */
public class NotInitialization {
	public static void main(String args[]){
		//one
		//System.out.println(SubClass.value);
		//two
		//SuperClass[] sca = new SuperClass[10];
		//three
		//System.out.println(ConstClass.HELLOWORLD);
	}
}

class SuperClass {
	static {
		System.out.printf("SuperClass init!!!");
	}
	public static int value = 123;
	public SuperClass(){
		System.out.println("SuperClass Construction init!!!");
	}
}

class SubClass extends  SuperClass{
	static {
		System.out.println("SubClass init!!!");
	}
	public SubClass(){
		System.out.println("SubClass Construction init!!!");
	}
}

class ConstClass {
	static {
		System.out.println("ConstClass init!!!");
	}
	public static final String HELLOWORLD = "hello world";
}

