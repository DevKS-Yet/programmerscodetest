import java.util.Arrays;

class Solution18 {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};

//        for (int num : num_list) if (num % 2 == 0) answer[0]++; else answer[1]++;
        Arrays.stream(num_list).forEach(a -> {
            if (a % 2 == 0) answer[0]++;
            else answer[1]++;
        });

        return answer;
    }
}