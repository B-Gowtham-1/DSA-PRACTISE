package com.java_dsa;
import java.util.*;
public class CountDigits {
    static int Count(int num,int target){
        int count=0;
        while(num>0){
            int rem=num%10;
            if(target==rem){
                count++;
            }
            num=num/10;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int target=ob.nextInt();
        System.out.println(CountDigits.Count(n,target));
    }
}
