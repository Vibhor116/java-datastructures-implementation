package com.equals3.algorithms.linkedlists;

public class Mult {
	public static void main(String[] args) {
		int n = 500;int m = 51000;

		int val= recarsiveMul(n,m,0);
		System.out.println(val);
		int mul =0;
		for(int i =1;i<=n;i++ ){
			 mul = mul+m;
		}
		System.out.println(mul);
		int base = 2;int pow=10;
		int f =1;
		for(int i=1;i<=pow;i++){
			f=f*base;
		}
		System.out.println(f+"---"+Math.pow(base, pow));
		int d=recarsivePower(base, pow, 1);
		System.out.println(d);
	}

	private static int recarsivePower(int base, int pow, int result) {
		result=result*base;
		if(pow==1){
			return result;
		}
		pow--;
		return recarsivePower(base, pow, result);
		
	}

	private static int recarsiveMul(int n, int m,int mul) {
		mul=mul+m;
        if(n==1){
        	return mul;
        }

		n--;
		return recarsiveMul(n--, m,mul);

	}
}
