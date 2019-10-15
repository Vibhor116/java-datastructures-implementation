//https://leetcode.com/problems/additive-number/

package com.equals3.classicinterviewquestions.solvemefirst.arrays.searching;

import java.math.BigInteger;

public class AddativeNumber{

    public static void main(String[] args) {
        
    }

    public boolean isAdditiveNumber(String num){
        if(num.length()<3){
            return false;
        }
        for(int i=0;i<=num.length()/2;i++){

            if(num.charAt(i)=='0' && i>0){
                break;
            }
            BigInteger x1 = new BigInteger(num.substring(0, i + 1));
        }
    }
}