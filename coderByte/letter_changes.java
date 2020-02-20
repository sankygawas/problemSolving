import java.util.*; 
import java.io.*;

class Main {

  public static String LetterChanges(String str) {
    // code goes here  
    StringBuilder builder = new StringBuilder();
    for(int i=0;i<str.length();i++){

      if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
      char character = (char)((str.charAt(i) % 122)+1);
      if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
        builder.append((character + "").toString().toUpperCase());
      }
      else
        builder.append(character);
    }
    else
      builder.append(str.charAt(i));
    }
    return builder.toString();
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }

}