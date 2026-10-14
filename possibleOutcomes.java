package Recursion;

import java.util.Scanner;

public class possibleOutcomes {
    public static void main(String[] args) {
       int n=4;
       possible(n,"");


    }
    public static void possible(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        possible(n-1,ans+"H");
        possible(n-1,ans+"T");


    }
}
