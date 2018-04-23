package com.imagegrafia.howto;

public class OverrideHashcode {
	String user;
	int age;
	String phone;
	
	public OverrideHashcode(String user,int age,String phone) {
		// TODO Auto-generated constructor stub
		this.user=user;
		this.age=age;
		this.phone=phone;
	}

	//how to generate our own hashcode add primitive as it is as Object only have hashCode()
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result=17;
		result=31*result+user.hashCode();
		result=31*result+age;
		result=31*result+phone.hashCode();
		return result;
	}

	/**
	 * in order to remove duplicate object creation override equals method
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==this) return true;
		
		if(!(obj instanceof OverrideHashcode)) {
			return false;
		}
		OverrideHashcode ovh=(OverrideHashcode)obj;
		return false;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	public static void main(String[] args) {
		OverrideHashcode oh=new OverrideHashcode("Ashish", 26, "8599894881");
		OverrideHashcode oh1=new OverrideHashcode("Ashish", 26, "8599894881");//both will generate same hashCode as their values are same
		OverrideHashcode oh2=new OverrideHashcode("Ashish", 16, "8599894881"); //different hashCode value changes
		System.out.println("User Defined HashCode generated");
		System.out.println(oh.hashCode());  //1216558584
		System.out.println(oh1.hashCode());  //1216558584
		System.out.println(oh2.hashCode());  //1216558274
		System.out.println(oh.equals(oh));// FALSE before implementation equals method it will return false
															
	}
}
