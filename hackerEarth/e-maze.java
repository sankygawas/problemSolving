/* IMPORTANT: Multiple classes and nested static classes are supported */

https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/e-maze-in-1aa4e2ac/

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
public class TestClass {
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
         Map<String,Integer> map = new HashMap<String,Integer>();
         map.put("L",-1);
         map.put("R",1);
         map.put("U",1);
         map.put("D",-1);
         
         
         String[] arr = name.split("");
         StringBuilder builder = new StringBuilder();
         int x_axis = 0;int y_axis = 0;
         for(int i=0;i<arr.length;i++){
             
             if(arr[i].equals("L") || arr[i].equals("R"))
                x_axis = x_axis + map.get(arr[i]);
             else
                y_axis = y_axis + map.get(arr[i]);
             
         
         }
         
         System.out.println(x_axis + " " + y_axis);

    }
}
