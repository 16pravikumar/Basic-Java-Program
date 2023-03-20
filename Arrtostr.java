package basic;
/*
 * Find the String from Character
 * 
*/
 public class javamain{

	 public static void main(String[] args) {
	       char arr[]={'p','r','a','v','e','e','n'}; //Character array to convert to string
	        String s=new String(arr);
	        System.out.println(s); 
	        s="";
	      for (int i = 0; i < arr.length; i++) {
	            s=s+arr[i];
	       }
	        // TODO code application logic here
	        System.out.println(s);
	    }
	
}
/*Output:
 * praveen
   praveen
*/
