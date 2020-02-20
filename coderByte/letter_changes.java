import java.util.*; 
import java.io.*;
import java.util.*; 
import java.io.*;

class Main {  
  public static String LetterChanges(String str) { 
  
  StringBuffer buffer = new StringBuffer();
  int temp;
   for(int i=0;i<str.length();i++){
       temp = str.charAt(i);
       if((temp>=97 && temp<=122)||(temp>=65 && temp<=90)){
       temp++;
       }
       if((char)temp == 'a' || (char)temp == 'e' || (char)temp == 'i' || (char)temp == 'o' || (char)temp == 'u')
       temp-=32;
       
       buffer.append((char)temp);
      
   }
       
    return buffer.toString();
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}