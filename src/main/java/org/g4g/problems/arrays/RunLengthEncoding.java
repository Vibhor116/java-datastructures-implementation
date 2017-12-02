package org.g4g.problems.arrays;

public class RunLengthEncoding {

	public static void main(String[] args) {
	
		String a  = "aabbbbcccddddeefffa";
		runLengthEncoding(a);
	}

	private static void runLengthEncoding(String a) {
		StringBuilder sb = new StringBuilder();
		int count =0;
		for(int i=0;i<a.length();i++){
			if((i+1)<a.length() &&a.charAt(i)==a.charAt(i+1) ){
				count=count+1;
			}
			else{
				sb.append(a.charAt(i));
				sb.append(count+1);
				count=0;

			}
		}
		
		System.out.println(sb);
	}
}
