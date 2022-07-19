import java.util.*;
public class wrapper{
    public static void main(String args[]){
       int i=5;

       Integer ii=new Integer(); //Boxing
       Integer jj=i; // Autoboxing


       int j=jj.intValue(); //Unboxing
       int k=jj;  //AutoUnboxing

       Arraylist<Integer> values=new Arraylist<Integer>();
       values.add(5);
       values.add(7);
    }
}