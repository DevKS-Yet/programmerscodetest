import java.util.Arrays;

class Solution9 {
    public int solution(int[] sides) {
        int answer = 2;

        int[] sorted = Arrays.stream(sides).sorted().toArray();
        if (sorted[2] < sorted[1]+sorted[0]) answer = 1;

        return answer;
    }
}