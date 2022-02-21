package com.week2;

public class Pandigital {

	public Pandigital() {
		// TODO Auto-generated constructor stub
		super();
	}
	public static String pandigital(int n)
	{
		String out="";
		int i = 1;
		while(out.length()<9)
		{
			String prod = String.valueOf(i * n);
			out += prod;
			i++;
		}
			
		if(out.length()==9 && n>2)
		{
			return out;
		}
		else
		{
			return "";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result="x";
		int i = 1;
		while(i<1000000000)
		{
			result=pandigital(i);
			if(result!="")
			{
				System.out.println(i+" - "+ result);
			}
			i++;
		}
	
	}

}
