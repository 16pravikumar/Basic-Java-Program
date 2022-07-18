import java.util.*;
public class reverse{
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //int len=num.length;
        int cout=0;
        while(num>0){
            int res=num%10;
            System.out.print(res);
            num=num/10;
        }
    }
}