//Descending Order
import java.util.*;
class sort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pass number");
        int num=sc.nextInt();
        int i,k,temp=0;
        int[] arr=new int[num];
        for( i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<num;i++)
        {
            for(k=i+1;k<num;k++){
                if(arr[i]<arr[k])
                {
                    temp=arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;
                }
            }
        }
        System.out.println("Sort array");
        for(int res:arr){
            System.out.println(res);
            
        }
    }
}