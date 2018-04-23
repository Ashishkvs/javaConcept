package com.imagegrafia;

import java.util.StringTokenizer;

public class SentenceInReverse {
	//reverse string
	public String reverseOfString(String str) {
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp+=str.charAt(i);
		}
		return temp;
	}
	//reverse Sentence
	public String reverseOfSentence(String str) {
		String reverseSentence="";
		StringTokenizer st=new StringTokenizer(str, " ");//string and del
		
	while(st.hasMoreTokens()) {
		String temp =st.nextToken();
		reverseSentence+=reverseOfString(temp)+" ";
	}
		return reverseSentence;
	}
	
	public static void main(String[] args) {
		
		SentenceInReverse sir=new SentenceInReverse();
		System.out.println(sir.reverseOfString("Ashish"));
	System.out.println(sir.reverseOfSentence("hello world this is india"));
	}

}
