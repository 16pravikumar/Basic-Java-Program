package basic;
/*Use of clone()
*/
import java.util.*;
import java.io.*;

 public class javamain{
	 String name;
     String email;
     javamain(javamain o){
    name=o.name;
    email=o.email;
  }
     javamain(String str1,String str2)
  {
    name=str1;
    email=str2;
  }
	 public static void main(String[] args) throws CloneNotSupportedException  {
		 javamain obj=new javamain("Praveen","pk113@gmail.com");
		 javamain s=new javamain(obj);
	        System.out.println(obj.name+" "+obj.email);
	        System.out.println(s.name+" "+s.email);
  } 
}
/*Output:
 Praveen pk113@gmail.com
 Praveen pk113@gmail.com

*/
