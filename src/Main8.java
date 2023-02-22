import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {

        Solution8 solution8 = new Solution8();

        String[][] strlist = { {"We", "are", "the", "world!"}, {"I", "Love", "Programmers."} };
        for (String[] list : strlist) {
            int[] solution = solution8.solution(list);
            Arrays.stream(solution).forEach(a -> System.out.print(a+ ","));
            System.out.println();
        }

    }
}
