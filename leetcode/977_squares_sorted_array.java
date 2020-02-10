/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */

class Solution {
    public int[] sortedSquares(int[] A) {
        int positivePointer = 0;
        for(positivePointer=0;positivePointer<A.length-1;positivePointer++){
            if(0 <= A[positivePointer])
                break;
        }
        int negativePointer = positivePointer-1;
        int arr[] = new int[A.length];
        int counter = 0;
        while(negativePointer >=0 && positivePointer <= A.length-1){
            
            int a = A[positivePointer] * A[positivePointer];
            int b = A[negativePointer] * A[negativePointer];
            if(a < b){
                arr[counter++] = a;
                positivePointer++;
            }
            else{
                  arr[counter++] = b;
                  negativePointer--;
            }
           
        }
        
        while(negativePointer >=0){
            int a = A[negativePointer] * A[negativePointer--];
            arr[counter++] = a;
        }
        while(positivePointer  <= A.length-1){
            int a = A[positivePointer] * A[positivePointer++];
            arr[counter++] = a;
        }
        
        return arr;
            
        
    }
}