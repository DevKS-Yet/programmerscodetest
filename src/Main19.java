public class Main19 {

    public static void main(String[] args) {

        Solution19 solution19 = new Solution19();

        int[] slices = {7, 4, 2, 5, 10};
        int[] ns = {10, 12, 2, 2, 100};

        for (int i=0; i<slices.length; i++) {
            System.out.println(solution19.solution(slices[i], ns[i]));
        }

    }

}
