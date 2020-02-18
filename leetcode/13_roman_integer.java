class Solution {
    public int romanToInt(String s) {
        
        Map<String,String> map = new HashMap<String,String>();
        map.put("V","I");
        map.put("X","I");
        map.put("L","X");
        map.put("C","X");
        map.put("D","C");
        map.put("M","C");
        
        
        Map<String,Integer> valueMap = new HashMap<String,Integer>();
        valueMap.put("I",1);
        valueMap.put("X",10);
        valueMap.put("V",5);
        valueMap.put("C",100);
        valueMap.put("L",50);
        valueMap.put("D",500);
        valueMap.put("M",1000);
        
        
        String[] arr = s.split("");
        int temp = 0, sum = 0;
        String previous = "";
        for(String character:arr){
                
            if(previous.equals(map.get(character))){
                sum+=valueMap.get(character) - temp;
                temp = 0;
            }
            else if (character.equals("I") || character.equals("X")  || character.equals("C") ){
                if(!previous.equals("") && valueMap.get(previous) > valueMap.get(character))
            	{
            		sum+=temp;
            		temp=0;
            	}
                temp+= valueMap.get(character);
            }
            else{
                sum+=valueMap.get(character);
                sum+=temp;
                temp = 0;
            }
                
            previous = character;
            
            
        }
        
        if(temp!=0)
            sum+=temp;
        
        return sum;
        
        // M = 1000, D = 500, C3 = 300, L=50, X3=30, IV = 4
        
        
    }
}