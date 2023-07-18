package com.app;

public class Reverse_letters {
	
	
	public static void main(String[] args) {
		 String str= "Infoway Technologies", str1="";
	        char ch;
	       
	    
	      System.out.println("Infoway Technologies"); //Example word
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        str1= ch+str1; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed string: "+ str1);
	}

}
