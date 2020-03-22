//https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0) return new int[0];
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<nums1.length;i++)
            map.put(nums1[i],1 + map.getOrDefault(nums1[i], 0));
            
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i]) - 1);
                if(map.get(nums2[i]) < 1)
                    map.remove(nums2[i]);
            }
        }
        int result[] = new int[list.size()];
        for(int i = 0;i<list.size();i++)
            result[i] = list.get(i);
        
        return result;
    }
}