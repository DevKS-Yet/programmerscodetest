public class Main28 {

    public static void main(String[] args) {

        Solution28 solution28 = new Solution28();

        String[][] s1z = { {"a", "b", "c"} , {"n", "omg"} };
        String[][] s2z = { {"com", "b", "d", "p", "c"}, {"m", "dot"} };

        for (int i=0; i< s1z.length; i++) {
            System.out.println(solution28.solution(s1z[i], s2z[i]));
        }

    }

}
