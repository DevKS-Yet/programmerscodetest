public class Solution7 {

    public String solution(int[] numbers, String hand) {
        String answer = "";

        for (int number : numbers) {
            switch (number%3) {
                case 0:
                    answer+="R";
                    break;
                case 1:
                    answer+="L";
                    break;
                case 2:

            }
        }

        return answer;
    }

}
