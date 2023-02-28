import java.util.Arrays;

public class Main18 {

    public static void main(String[] args) {

        Solution18 solution18 = new Solution18();
        int[][] num_lists = { {1, 2,3 ,4 ,5}, {1, 3, 5, 7} };

        for (int[] num_list : num_lists) {
            int[] results = solution18.solution(num_list);
            for (int result : results) System.out.print(result + ", ");
            System.out.println();
        }

    }

}
