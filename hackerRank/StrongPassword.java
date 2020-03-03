/**
 * https://www.hackerrank.com/challenges/strong-password/problem
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong

        if(n < 6) return 6-n;

       // System.out.println(Pattern.matches("/[A-Z]/", password));
       int count = 0;
          
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher= pattern.matcher(password);
        
        if(matcher.find())
            count++;
        
        pattern = Pattern.compile("[a-z]");
        matcher= pattern.matcher(password);
        
        if(matcher.find())
            count++;
        
        pattern = Pattern.compile("[0-9]");
        matcher= pattern.matcher(password);
        
        if(matcher.find())
            count++;
        
        pattern = Pattern.compile("[!@#$%^&*()-+]");
        matcher= pattern.matcher(password);
        
        if(matcher.find())
            count++;
        
        
       // System.out.println(4 - count);

        return 4 - count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        System.out.println(answer);
        scanner.close();
    }
}
