

package com.equals3.algorithms.strings;

import java.util.Stack;

public class BracesPatternMatcher {
	public static void main(String[] args) {

		String test_good = "(((((((((";
		Stack<Character> stackChar  = new Stack<>();
		for(int i=0;i<test_good.length();i++){
			char ch = test_good.charAt(i);
			if(ch == '(' || ch == '{' || ch =='['){
				stackChar.push(ch);
			}
			else if(ch ==')'){
				if(stackChar.isEmpty()|| stackChar.pop() !='('){
					System.out.println("not1");
				}
			}
			else if(ch =='}'){
				if(stackChar.isEmpty()|| stackChar.pop() !='{'){
					System.out.println("not2");
				}
			}else if(ch ==']'){
				if(stackChar.isEmpty()|| stackChar.pop() !='['){
					System.out.println("not3");
				}
			}
			
		}
		if(stackChar.size()!=0){
			System.out.println("oop");
		}
	}
}
