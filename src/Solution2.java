import java.util.ArrayList;

class Solution2 {
    public int solution(int[][] board, int[] moves) {

        ArrayList<Integer> got = new ArrayList<>(0);
        int answer = 0;

        for (int move : moves) {
            for (int[] boards : board) {
                if (boards[move-1] != 0) {
                    if (!got.isEmpty()) {
                        if (got.get(got.size()-1) == boards[move-1]) {
                            got.remove(got.size()-1);
                            answer+= 2;
                            removeNumber(move, boards);
                            break;
                        }
                    }
                    addNumber(got, move, boards);
                    removeNumber(move, boards);
                    break;
                }
            }
        }
        return answer;
    }

    private static void addNumber(ArrayList<Integer> got, int move, int[] boards) {
        got.add(boards[move -1]);
    }

    private static void removeNumber(int move, int[] boards) {
        boards[move -1] = 0;
    }
}