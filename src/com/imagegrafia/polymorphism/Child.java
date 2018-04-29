package com.imagegrafia.polymorphism;

public class Child  extends Parent {
	public int a=15;
	@Override
	public void display () {
		System.out.println("I am from child");
	}
	public static void main(String[] args) {
		// 1.
		Parent p=new Parent();
		System.out.println(p.a); //10 from parent class
		p.display();//I am from parent
		// 2.
		/**
		 * Polymorphism applied only on instance method not on instance variable
		 * parent having ref of child i.e will give preference to child class instance method 1st
		 * but not instance var
		 */
		Parent par=new Child();
		System.out.println(par.a);//10 from parent class
		par.display(); //I am from child
		
		// 3.
		//if method is not available in child then it will invoke parent method
		Parent pt=new Parent();
		//assume display method is not available in thic child class then it ll invoke parent method
		pt.display();
		// 4.
		/**
		 * to invoke child class member var or instance var either use this || create explicitly obj of child
		 */
	}

}
