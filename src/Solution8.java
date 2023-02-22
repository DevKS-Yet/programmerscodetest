import java.util.ArrayList;
import java.util.Arrays;

class Solution8 {
    public int[] solution(String[] strlist) {
        int[] answer;
        ArrayList<Integer> tmp = new ArrayList();
        Arrays.stream(strlist).forEach(a -> tmp.add(a.length()));
        answer = tmp.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}