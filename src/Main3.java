public class Main3 {

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();

//        int[] ingredient1 = new int[10000];
//        for (int i=0; i<ingredient1.length; i++) {
//            int tmp = (int) (Math.random() * 3)+1;
//            ingredient1[i] = tmp;
//        }
//        int solution1 = solution3.solution(ingredient1);
//        System.out.println(solution1);

        int[][] ingredients = { {2, 1, 1, 2, 3, 1, 2, 3, 1}, {1, 3, 2, 1, 2, 1, 3, 1, 2} };

        for (int[] ingredient : ingredients) {
            int solution = solution3.solution(ingredient);
            System.out.println(solution);
        }

    }
}
