import java.util.Hashtable;

public class romanToInt {

    // first solution
    public int romanToInt(String s){
        int number = 0;
        Hashtable<Character, Integer> romanNumberMap = new Hashtable<>();
        romanNumberMap.put('I', 1);
        romanNumberMap.put('V',5);
        romanNumberMap.put('X',10);
        romanNumberMap.put('L', 50);
        romanNumberMap.put('C', 100);
        romanNumberMap.put('D', 500);
        romanNumberMap.put('M', 1000);
        for(int i = 0; i < s.length(); i ++){
             if(i < s.length() - 1 && romanNumberMap.get(s.charAt(i)) < romanNumberMap.get(s.charAt(i + 1))){ // if it's a special case
                 number += romanNumberMap.get(s.charAt(i + 1)) - romanNumberMap.get(s.charAt(i));
                 i++;
            }else{
                number += romanNumberMap.get(s.charAt(i));
            }
        }
        return number;
    }
    // second solution
    private int mapToInt(char c){
        int value = -1;
        switch(c){
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
        }
        return value;
    }
    public int romanToInt2(String s){
        int number = 0;
        for(int i = 0; i < s.length(); i ++){
            if(i == s.length() - 1){
                number += mapToInt(s.charAt(i));
            }else{
                int current = mapToInt(s.charAt(i));
                int next = mapToInt(s.charAt(i + 1));
                if(current < next){
                    number += next - current;
                    i ++;
                }else{
                    number += current;
                }
            }
        }
        return number;
    }
}