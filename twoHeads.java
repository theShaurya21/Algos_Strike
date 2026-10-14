package Recursion;

import java.util.Scanner;

public class twoHeads {
    public static void main(String[] args) {
        int n=3;
        possible(n,"");


    }
    public static void possible(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            possible(n-1,ans+"H");

        }
        possible(n-1,ans+"T");


    }
}
