import java.util.*;
// 3. Longest Substring Without Repeating Characters
public class LongestSubstringwithoutRepeatedChars {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for(int i=0,j=0;i<=j && j<s.length();){
            if(m.containsKey(s.charAt(j)) && m.get(s.charAt(j))!=0){
                while(s.charAt(i) != s.charAt(j)){
                    m.put(s.charAt(i),m.get(s.charAt(i))-1);
                    i++;
                }
                i++;
            } else m.put(s.charAt(j),1);
            if(max < j-i +1)
            max = j-i+1;
            j++;
        }
        return max;
    }
}
