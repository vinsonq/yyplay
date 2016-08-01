package com.tgb.interview.sohu;

/**
 * Created by yangyu on 16/8/1.
 */
public class A extends B{
	public int a = 100;
	public A(){
		super();
		System.out.println("A:"+a);
		a = 200;
	}
	static {
		System.out.println("static part");
	}
	public static void main(String args[]){
		System.out.println("A:"+new A().a);
	}
}

class B{
	public B(){
		System.out.println("B:"+((A)this).a);
	}
}
