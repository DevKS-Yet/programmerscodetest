public class Main22 {

    public static void main(String[] args) {

        Solution22 solution22 = new Solution22();

        int[][] arrays = { {1, 1, 2, 3, 4, 5}, {0, 2, 3, 4} };
        int[] ns = {1, 1};

        for (int i=0; i<arrays.length; i++) {
            System.out.println(solution22.solution(arrays[i], ns[i]));
        }

    }

}
