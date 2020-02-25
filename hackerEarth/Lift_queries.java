/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

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
        int cases = s.nextInt();
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("A",0);
        map.put("B",7);
        
        for(int i=0;i<cases;i++){
            
            int floor = s.nextInt();
            
            if((floor - map.get("A")) <= (floor - map.get("B")))
            {
                System.out.println("A");
                map.put("A",floor);
            }else{
                System.out.println("B");
                map.put("B",floor);
            }
            
            
        }
        

    }
}
