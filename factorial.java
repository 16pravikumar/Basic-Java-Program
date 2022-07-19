import java.util.*;
public class factorial{
    public static int fact(int n){
        if(n>1)
        {
            return n*fact(n-1);
        } else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println("Please enter the number to number factorial");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
       int res=fact(num);
            System.out.println(res);
        }
        
    }