import java.util.Arrays;

public class Main27 {

    public static void main(String[] args) {

        Solution27 solution27 = new Solution27();

        int[] ns = {10, 15, 16};

        for (int n : ns) Arrays.stream(solution27.solution(n)).forEach(System.out::println);

    }

}
