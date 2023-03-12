import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set1 = new HashSet<String>(Arrays.asList(s1));
        Set<String> set2 = new HashSet<String>(Arrays.asList(s2));
        set1.retainAll(set2);
        int answer = set1.size();
        return answer;
    }
}