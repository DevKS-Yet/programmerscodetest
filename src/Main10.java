public class Main10 {

    public static void main(String[] args) {

        Solution10 solution10 = new Solution10();

        String[] my_string = {"abcdef", "BCBdbe"};
        String[] letter = {"f", "B"};

        for (int i=0; i<my_string.length; i++) {
            String solution = solution10.solution(my_string[i], letter[i]);
            System.out.println(solution);
        }

    }

}
