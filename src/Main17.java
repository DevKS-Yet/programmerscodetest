public class Main17 {

    public static void main(String[] args) {

        Solution17 solution17 = new Solution17();

        int[][] arrays = { {149, 180, 192, 170}, {180, 120, 140} };
        int[] height = {167, 190};

        for (int i=0; i<height.length; i++) {
            System.out.println(solution17.solution(arrays[i], height[i]));
        }

    }

}
