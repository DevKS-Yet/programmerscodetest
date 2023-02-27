import java.util.Arrays;

public class Main15 {

    public static void main(String[] args) {

        Solution15 solution15 = new Solution15();

        int[][] numbersArr = { {1,2,3,4,5}, {1,2,100,-99,1,2,3} };

        for (int[] numbers : numbersArr) {
            int[] answers = solution15.solution(numbers);
            Arrays.stream(answers).forEach(a -> System.out.print(a + ", "));
            System.out.println();
        }

    }

}
