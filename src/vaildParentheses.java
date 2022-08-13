import java.util.Stack;

public class vaildParentheses {
    public boolean vaildParentheses(String s){
        boolean result = false;
        if(s.length() % 2 == 0){
            Stack<Character> ps = new Stack<>();
            boolean keepLoop = true;
            for(int i = 0; i < s.length() && keepLoop; i++){
                char c = s.charAt(i);
                if(isClose(c)){
                    if(ps.isEmpty()){
                        result = false;
                    }else{
                        result = checkMatch(ps.pop(),c);
                    }
                    keepLoop = result;
                }else{
                    ps.push(s.charAt(i));
                }
            }
            if(keepLoop) result = ps.isEmpty();
        }
        return result;
    }

    private boolean isClose(char input) {return input == ')' || input == '}' || input == ']';}
    private boolean checkMatch(char open, char close){
        boolean result = false;
        if(open == '('){
            result = close == ')';
        }else if(open == '{'){
            result = close == '}';
        }else{
            result = close == ']';
        }
        return result;
    }
}
