import java.util.*;
public class large{
    public static void main(String args[]){
        System.out.println("Enter the 5 number");
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        int i;
        for(i=0;i<5;i++)
         num[i]=sc.nextInt();
         int temp=num[0];
         int large=0;
         for(i=0;i<5;i++)
         {
            if(num[i]>large)
            large=num[i];
         }
       System.out.println("Large Number is:-  "+large);
    }
}