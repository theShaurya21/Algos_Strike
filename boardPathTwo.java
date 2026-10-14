package Recursion;


    public class boardPathTwo {
        public static void main(String[] args) {
            int n=3;
            int m=3;
            path(0,0,n-1,m-1,"");

        }
        public static void path(int cr,int cc,int er,int ec,String ans){
            if(er==cr && cc==ec){
                System.out.println(ans);
                return;
            }
            if(cr>er || cc>ec){
                return;
            }
            path(cr+1,cc,er,ec,ans+"H");
            path(cr,cc+1,er,ec,ans+"V");

        }

    }

