import org.junit.jupiter.api.*;
public class mainClass {
    @Test
    public void test(){
        vaildParentheses demo = new vaildParentheses();
        Assertions.assertTrue(demo.vaildParentheses("()"));
        Assertions.assertTrue(demo.vaildParentheses("(){}[]"));
        Assertions.assertFalse(demo.vaildParentheses("{[}]"));
        Assertions.assertFalse(demo.vaildParentheses("())("));
        Assertions.assertFalse(demo.vaildParentheses("({{{{}}}))"));
        Assertions.assertFalse(demo.vaildParentheses("[[]"));
    }
    public static void main(String[] args){

    }
}
