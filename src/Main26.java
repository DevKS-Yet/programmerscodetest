import java.util.Arrays;

public class Main26 {

    public static void main(String[] args) {

        Solution26 solution26 = new Solution26();

        int[] moneys = {5500, 15000};

        for (int money : moneys) Arrays.stream(solution26.solution(money)).forEach(System.out::println);

    }

}
