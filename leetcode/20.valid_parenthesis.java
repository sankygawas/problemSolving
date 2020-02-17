class Solution {
    public boolean isValid(String s) {
        if(s.equals("")) return true;
        
        Map<String,String> map = new HashMap<String,String>();
        map.put("(",")");
        map.put("{","}");
        map.put("[","]");
        String[] arr = s.split("");
        Stack<String> stack = new Stack<String>();
        for(String character: arr){ 
            if(character.equals("(") || character.equals("{") || character.equals("["))
                stack.push(character);
            else{
                if(!stack.isEmpty()){
                    String popped = stack.pop();
                    if(!map.get(popped).equals(character))
                        return false;
                } 
                else return false;
            }
        }
        return stack.isEmpty();
    }
}