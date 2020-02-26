// { Driver Code Starts
    import java.util.Scanner;
    import java.util.*;
    
    class Max_Dis_Between_Same_Element
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t =sc.nextInt();
            while(t>0)
            {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i=0;i<n;i++)
                    arr[i] = sc.nextInt();
                GfG g = new GfG();
                System.out.println(g.maxDistance(arr,n));
            
            t--;
            }
        }
    }// } Driver Code Ends
    // your task is to complete this function
    class GfG
    {
        int maxDistance(int arr[], int n)
        {
        // Your code here
            int ans = 0;
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i=0;i<arr.length;i++){
             
             if(map.containsKey(arr[i])){
                 //map.put(arr[i],i - map.get(arr[i]));
                 if(ans < i - map.get(arr[i]))
                    ans = i - map.get(arr[i]);
             }  
             else{
                 map.put(arr[i],i);
             }
                
                
            }
            
            return ans;
        
        }
    }
    