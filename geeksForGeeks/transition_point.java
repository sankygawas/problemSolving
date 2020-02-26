// { Driver Code Starts
   /**
    * 
    https://practice.geeksforgeeks.org/problems/find-transition-point/1
    */
   
    import java.util.*;

    class Sorted_Array {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                GfG obj = new GfG();
                System.out.println(obj.transitionPoint(arr, n));
                T--;
            }
        }
    }// } Driver Code Ends
    
    class GfG {
        int transitionPoint(int arr[], int n) {
            // code here
            int i=0;
            int j= arr.length-1;
            if(arr[j] == 0) return -1;
            for(;i<=j && j>=i;){
                if(arr[i] == 0) i++;
                else return i;
                
                if(arr[j] == 1) j--;
                else return j+1;
                
            }
            return i;
        }
    }