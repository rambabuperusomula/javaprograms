package com.javaprograms;

public class Palindrom {

	public static void main(String[] args) {

		String s="madamm",rev="",re_org=s;
		int len=s.length();
        for(int i=len-1;i>=0;i--)
        {
        	rev=rev+s.charAt(i);
        }
		System.out.println(rev);
		if(re_org.equalsIgnoreCase(rev))
		{
			System.out.println("it is a palindrom:"+re_org);
		}
		else {
			System.out.println("it is not a palindrom:"+re_org);

		}
	}

}
