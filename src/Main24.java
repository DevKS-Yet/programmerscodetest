import java.util.Arrays;

public class Main24 {

    public static void main(String[] args) {

        Solution24 solution24 = new Solution24();
        int[][] numberz = { {1, 2, 3, 4, 5}, {1, 3, 5} };
        int[] num1 = {1, 1};
        int[] num2 = {3, 2};

        for (int i=0; i<numberz.length; i++) {
            Arrays.stream(solution24.solution(numberz[i], num1[i], num2[i])).forEach(System.out::println);
        }

    }

}
