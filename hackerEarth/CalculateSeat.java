/* IMPORTANT: Multiple classes and nested static classes are supported */

https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seating-arrangement-1/description/


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
class CalculateSeat {
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
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"WS");
        map.put(2,"MS");
        map.put(3,"AS");
        map.put(4,"AS");
        map.put(5,"MS");
        map.put(6,"WS");
        map.put(7,"WS");
        map.put(8,"MS");
        map.put(9,"AS");
        map.put(10,"AS");
        map.put(11,"MS");
        map.put(12,"WS");
        
        Scanner s = new Scanner(System.in);
        Integer[] seats = new Integer[s.nextInt()];
        
        for(int i=0;i<seats.length;i++){
            seats[i] = s.nextInt();
        }
        
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<seats.length;i++){
            int remainder = seats[i]%12;
            if(remainder == 0) remainder = 12;
            int oppositeSeatNo = seats[i] - 2*remainder + 13;
            builder.append(oppositeSeatNo + " " + map.get(remainder) + "\n");
            
        }
        
        
        System.out.println(builder.toString());
        
        

    }
}
