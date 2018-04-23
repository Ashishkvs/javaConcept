package com.imagegrafia.legacy;

public class ObjectPredefinedMethod {

	static int x=10;
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return x++;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public static void main(String[] args) {
		ObjectPredefinedMethod obj=new ObjectPredefinedMethod();
		System.out.println(obj.hashCode());
		
		System.out.println(System.identityHashCode(obj));
		Object obj1=new Object();
		System.out.println(obj);
		System.out.println(obj1);
		
	}
}
