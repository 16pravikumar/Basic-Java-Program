import java.util.*;
public class fib{
    public static void main(String args[]){
        System.out.println("Please enter the number to number fibonacci series");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int m1=0;
        int m2=1;
        System.out.println(m1);
        System.out.println(m2);
        for(int i=1;i<=num;i++){
            int m3=m1+m2;
            int temp=m2;
            m2=m3;
            m1=temp;
            System.out.println(m3);
        }
    }
}