public class Main9 {

    public static void main(String[] args) {

        Solution9 solution9 = new Solution9();

        int[][] sides = { {1, 2, 3}, {3, 6, 2}, {199, 72, 222} };

        for (int[] side : sides) {
            int solution = solution9.solution(side);
            System.out.println(solution);
        }

    }

}
