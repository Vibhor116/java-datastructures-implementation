package com.equals3.algorithms.recursion;

public class Anagram {
	static char arrChar[] = new char[10];
	static int count=0;
	private static int size;
	public static void main(String[] args) {
		String word="abc";
		size = word.length();
		for(int i =0 ;i<size;i++){
			arrChar[i]= word.charAt(i);
		}
		doAnagram(size); 
	}
	private static void doAnagram(int length) {
		if(length==1){
			return ;
		}
		else{
			for(int j =0 ;j<length;j++){
				doAnagram(length-1); 
				if(length==2){
					displayWord();
				}
				//rotate(length); 
				break;
			}
		}

	}
	public static void rotate(int newSize)
	{
		int j;
		int position = size - newSize;
		char temp = arrChar[position]; // save first letter
		for(j=position+1; j<size; j++) // shift others left
			arrChar[j-1] = arrChar[j];
		arrChar[j-1] = temp; // put first on right
	}
	private static void displayWord() {
		//System.out.print(++count + "");
		for(int j=0; j<size; j++)
			System.out.print( arrChar[j]+" " );

	}
}
