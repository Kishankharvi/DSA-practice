import java.util.Scanner;
public class Palindrome
{

  public static void main(String []args){
  
   Scanner sc=new Scanner(System.in);
   System.out.println("ENter  ip");
   String s= sc.nextLine();


   String cleaned=s.replace(".","");

   String rev= new StringBuilder(cleaned).reverse().toString();
  if(cleaned.equals(rev)){
    System.out.println("palindrome");
  }
  else{
    System.out.println("not a palindrome");
  }
  sc.close();
  }
}
