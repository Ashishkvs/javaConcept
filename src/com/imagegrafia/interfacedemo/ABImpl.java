package com.imagegrafia.interfacedemo;
/**
 * 
 * @author ashish
 *
 *The question is : Can a java class implement 
 *Two interfaces with same methods having same signature but different return types??
No, its an error
If two interfaces contains a method with same signature 
but different return types, then it is
 impossible to implement both the interface simultaneously.
 */
public class ABImpl implements A,B {

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		System.out.println("Abimpl class method implemented");
	}
	
	
	public static void main(String[] args) {
		//If only once override how to call from both Interface
		//both can  called same implementation
		A a=new ABImpl();
		a.foo();
		B b=new ABImpl();
		b.foo();
		
		//explicit define and call to Interface A
		A a1=()->{
			System.out.println("A interface foo() called");
		}; 
		a1.foo();
		
		//explicit define and call to interface B
		B b1=()->{
			System.out.println("B interface foo() called");
		};
		b1.foo();
		
		
		
	}

}
