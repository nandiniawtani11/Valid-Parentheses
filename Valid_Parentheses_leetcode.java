class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char c='a';
        if(s.length()==1)
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c=='(' || c=='{' ||c=='[')
            {
                stack.push(c);
            }
           else if(c==')' || c=='}' || c==']')
            {
               if(stack.isEmpty())
               {
                   return false;
               }
               
                if((stack.peek()=='(' && c!=')') ||(stack.peek()=='{' && c!='}') || (stack.peek()=='[' && c!=']'))
                {
                       return false;                                                                    
                }
                else
                 {
                        stack.pop();                                                                   
                 }
                                                                                       
            }
            else{
                return false;
            }
                                                                                       
        }
        if(!stack.isEmpty())
        {
            return false;
        }
         return true;
    }
}
