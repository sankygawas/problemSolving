/* IMPORTANT: Multiple classes and nested static classes are supported */

https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cipher-1/

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        
        int key = Integer.parseInt(s.nextLine());
        StringBuilder builder = new StringBuilder();
        
        char[] arr = str.toCharArray();
        for(char c:arr){
            
            if(( c >= 97 && c <=122 )){
                 char character = (char)(((c+key)- 97) % 26 + 97);
                builder.append(character);
            }else if(c >= 65 && c <=90 ){
                char character = (char)(((c+key) - 65)%26 + 65);
                builder.append(character);
                
            }else if(c >= 48 && c <=57 ){
                char character = (char)(((c+key) - 48)%10 + 48);
                builder.append(character);
            }
            else
             builder.append(c);
            
        }
        
       System.out.println(builder.toString());

    }
}
