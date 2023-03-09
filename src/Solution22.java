import java.util.Arrays;

class Solution22 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int arrays : array) if (arrays==n) answer++;
        return answer;
    }
}