package com.gems.codingtrain.collections;

public class methids {
	
	public static int printnumber(int n) {
		int u=0;
		for(int i=1;i<=n;i++) {
			
		u=i;
		}
		return u;
		
	}

	
	public static String variables(int a,int b,int c,int d) {
		String s="";
		if(a+b>c+d) {
			s="greater";
		}
		else {
			s="lesser";
		}
		return s;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=printnumber(5);
		
				
				String result1=variables(10,20,30,40);	
				System.out.println(result1);

	}

}
