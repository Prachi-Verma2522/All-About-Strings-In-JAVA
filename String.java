/*****************************************************************************
IT IS THE COLLECTION OF CHARACTERS
IMMUTABLE STRINGS IN JAVA
MUTABLE: STRINGBUFFER AND STRINGBUILDER
CAN BE CREATED IN TWO WAYS: LITERALS AND USING NEW KEYWORD(OBJECT)
*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	//	String s = "The Chainsmokers Halsey";// literal 
	                        // 01234567891011121314151617181920212223 // index of s
     	String s = new String("The Chainsmokers Halsey"); // both ways are vaild; this is the object creation
		System.out.println(s.length()); // 23
		System.out.println(s.charAt(10)); // m
		System.out.println(s.substring(5)); // hainsmokers Halsey
		System.out.println(s.substring(5,15)); // hainsmoker
	    System.out.println(s.toUpperCase()); //THE CHAINSMOKERS HALSEY
	    System.out.println(s.toLowerCase());// the chainsmokers halsey
	    System.out.println(s.replace('e', 'A'));// ThA ChainsmokArs HalsAy
	    System.out.println(s+ " Closer"); // The Chainsmokers Halsey Closer
	    System.out.println(s.isEmpty());// false
	    System.out.println(s.indexOf("Halsey")); //17
	    System.out.println(s.indexOf("C", 3)); //4
	    System.out.println(s.lastIndexOf("e"));//21
	    System.out.println(s.equals("Chainsmokers"));//false
	    System.out.println(s.equalsIgnoreCase("THE CHAINSMOKERS HALSEY"));//true
	    System.out.println(s.contains("Chain"));//true
	    System.out.println("The Chainsmokers Halsey".contentEquals(s));//true
	    String s1= "The";
	    System.out.println(s1.compareTo(s));//-20 = 3-23; The=3
	    CharSequence c = s.subSequence(2,10);
	    System.out.println(c);//e Chains
	    System.out.println(s.endsWith("sey"));// true
	    System.out.println(s.startsWith("the"));// false because of sensitive case
	    char[] arr = s.toCharArray();
	    for(char i:arr){
	        System.out.println(i+" ");
	    }
	    String[] str = s.split("e", 4);// Th  ; where e is present it will remove it and break into 4 parts
	    for(String str2: str){         // Chainsmok
	        System.out.println(str2);  // rs Hals
	    }                             // y
	 
	}
}
