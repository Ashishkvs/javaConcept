package com.imagegrafia.lambdaexpression;

public interface FunctionalInterfaceDemo {
	
	void message();
	
	default String showinfo() {
		return this.getClass().toString()+" : by Ashish";
	};

}
