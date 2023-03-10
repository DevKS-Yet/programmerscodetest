import java.util.Arrays;
import java.util.stream.IntStream;

class Solution23 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }
}