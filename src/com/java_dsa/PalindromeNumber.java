package com.java_dsa;
import java.util.*;
public class PalindromeNumber {
    boolean Rev(int n) {
        int rev = 0;
        int temp=n;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if(temp==rev){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        PalindromeNumber obj =new PalindromeNumber();
        int n=ob.nextInt();
        System.out.println(obj.Rev(n));
    }
}
