import java.util.*;

public class FirstOccurenceOfString {
        public char repeatedCharacter(String str) {
            Set<Character> s = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (s.contains(c)) {
                    return c;
                }
                
                s.add(c);
            }
            
            return ' ';
        }
}
