import java.util.Scanner;
class VCheck{
  public static void main(String args[]) {
     
     Scanner input=new Scanner(System.in);
     char y=input.next().charAt(0);
     
 if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
            || y == 'u' || y == 'A' || y == 'E' || y == 'I'
            || y == 'O' || y == 'U') {
            System.out.println("It is a Vowel."); 
            }

        else
            System.out.println("It is a Consonant."); 
    }  
 }