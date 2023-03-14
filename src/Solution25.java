import java.util.Arrays;

class Solution25 {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
//        answer = array[(int) Math.ceil(array.length/2)];
        answer = array[array.length/2];
        return answer;
    }
}