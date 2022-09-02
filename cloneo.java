//clone object through the constructor and clone()
public class cloneo{
     String name;
     String email;
  access(cloneo o){
    name=o.name;
    email=o.email;
  }
  access(String str1,String str2)
  {
    name=str1;
    email=str2;
  }
    public static void main(String args[]){
        cloneo obj=new cloneo("Praveen","pk113@gmail.com");
        cloneo s=new cloneo(obj);
        System.out.println(obj.name+" "+obj.email);
        System.out.println(s.name+" "+s.email);
    }
}
/* Output:-
-Praveen pk113@gmail.com
Praveen pk113@gmail.com
*/
