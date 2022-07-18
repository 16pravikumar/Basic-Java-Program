import java.util.*;
public class revadd{
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //int len=num.length;
        int cout=0;
        int fin=0;
        while(num>0){
            int res=num%10;
            fin=fin+res;
            num=num/10;
        }System.out.print(fin);
    }
}