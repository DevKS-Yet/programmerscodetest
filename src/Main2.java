import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

        Solution2 sol = new Solution2();

        int[][] board = { {0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1} };
        int moves[] = {1, 5, 3, 5, 1, 2, 1, 4};

        int solution = sol.solution(board, moves);
        System.out.println(solution);

    }

}
