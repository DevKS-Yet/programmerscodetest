public class Main16 {

    public static void main(String[] args) {

        Solution16 solution16 = new Solution16();

//        int[][] num_lists = { {1, 2,3 ,4 ,5}, {1, 1, 1, 1, 1, 2}, {1, 0, 1, 1, 1, 3, 5} };
//
//        for (int[] num_list : num_lists) {
//            int[] results = solution16.solution(num_list);
//            for (int result : results) System.out.print(result + ", ");
//            System.out.println();
//        }

        int[] num_list1 = new int[1000000000];
        for (int i=0; i<num_list1.length; i++) {
            num_list1[i] = (int) (Math.random()*1000) + 1;
        }
        System.out.println(System.currentTimeMillis());
        solution16.solution(num_list1);
        System.out.println(System.currentTimeMillis());

    }
}
