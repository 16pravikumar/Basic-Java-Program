/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrtostr;

/**
 *
 * @author 016pr
 */
public class Arrtostr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char arr[]={'p','r','a','v','e','e','n'}; //Character array to convert to string
        String s=new String(arr);
        System.out.println(s); 
        s="";
        int num[]={1,2,3,4,5};
       for (int i = 0; i < arr.length; i++) {
            s=s+arr[i];
       }
        // TODO code application logic here
        System.out.println(s);
    }
    
}
