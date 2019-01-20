import java.util.Map;
import java.util.HashMap;


public class BracketMatch{
    private Map<Character, Character> pair = null; 
    public BracketMatch(){
        pair = new HashMap<Character, Character>();
        pair.put('(',')');
        pair.put('[',']');
        pair.put('{','}');
    }
    public boolean isMatch(String s){
       StackBasedLinkedList linkedStack = new StackBasedLinkedList();
       System.out.println("-----");
       for(int i = 0; i < s.length(); i++){
            Character ch = s.charAt(i);
            if(pair.containsKey(ch)){
                linkedStack.push(ch);
                System.out.println("add ele");
            //只判断括号之间的匹配,其他字符可以忽略
            }else if(pair.containsValue(ch)){
                if(linkedStack.isEmpty()){
                    System.out.println("is empty");
                    return false;
                }else{

                    if (pair.get(linkedStack.peek()) == ch){
                       linkedStack.pop();
                       System.out.println("match");
                    }else{
                        System.out.println("not match");
                        return false;
                    }

                }
            }
       }
      return linkedStack.isEmpty()?true:false;
    }
    public static void main(String[]args){
        BracketMatch match = new BracketMatch ();
        System.out.println(match.isMatch("(]")); //true
        System.out.println(match.isMatch("(++)")); //true
        System.out.println(match.isMatch("(***)-[{-------}]")); //true
        System.out.println(match.isMatch("(2+4)*a[5]")); //true
        System.out.println(match.isMatch("({}[]]])")); //false
        System.out.println(match.isMatch("())))")); //false

    }
}
