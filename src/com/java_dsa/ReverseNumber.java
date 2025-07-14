package com.java_dsa;
import java.util.*;
public class ReverseNumber {
    int Rev(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner ob= new Scanner(System.in);
        ReverseNumber obj = new ReverseNumber();
        int n=ob.nextInt();
        System.out.println(obj.Rev(n));
    }
}
