//Descending Order
import java.util.*;
class addnumber{
    public static int add(int num){
        int res=0;
        if(num>0)
        {
            return num+add(num-1);
        }else{
            return 0;
        }
    }
    public static void main(String args[]){
        
        int res=add(10);
        System.out.println(res);    
        }
    

}