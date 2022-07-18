import java.util.*;
public class prime{
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,j;
        int arr[]=new int[100];
        for(i=1;i<=20;i++){
            int c=0;

            for(j=1;j<=20;j++)
            {
                if(i%j==0 && j%1==0)
                {
                    c++;
                }
            }
            if(c==2)
            System.out.println(i);
                
           
        }
    }
}