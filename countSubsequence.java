package Recursion;

public class countSubsequence {
    public static void main(String[] args) {
        String ques="abc";
        //print(ques,"");
        //System.out.println("\n"+count);
        System.out.println("\n"+print(ques,""));

    }
   // static int count=0;
    public static int print(String ques, String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return 1;
        }
        char ch=ques.charAt(0);
        int a1=print(ques.substring(1),ans);
        int a2=print(ques.substring(1),ans+ch);
        return a1+a2;

    }
}
