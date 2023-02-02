import java.util.*;

public class Panagram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> s = new HashSet<Character>();
        for(int i=0;i < sentence.length(); i++){
            s.add(sentence.charAt(i));
        }
        if(s.size() ==26)
            return true;
        return false;
    }
}
