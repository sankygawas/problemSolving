import java.util.Scanner;

/* IMPORTANT: Multiple classes and nested static classes are supported */

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7/description/
	
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Zoo {
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
        String name = s.nextLine();                 // Reading input from STDIN
        
        char[] arr = name.toCharArray();
        
        int i = 0;
        while(arr[i] == 'z')
            i++;
            
        if(i == 0) System.out.println("No");
        
        int zCounter = i;
        int oCounter = 0;
        boolean flag = false;
        while(i < arr.length){
           
            if(arr[i++] == 'o')
            {
                oCounter++;
            }
            else
            {
                System.out.println("No");
                flag = true;
                break;
            }
        }
        
         if(!flag){
              if(zCounter * 2 == oCounter){
               System.out.println("Yes");
            }
            else
                System.out.println("No");
         }
       
        
    }
}
