import java.util.ArrayList;

class Solution1 {
    public int[] solution(String today, String[] terms, String[] privacies) {

        ArrayList<Integer> tmpAnswer = new ArrayList<Integer>();

        String[] termNames = new String[terms.length];
        String[] termMonths = new String[terms.length];
        for (int i=0; i< terms.length; i++) {
            String[] tmp = terms[i].split(" ");
            termNames[i] = tmp[0];
            termMonths[i] = tmp[1];
        }

        int count = 0;
        while (true) {
            String[] privacy = privacies[count].split(" ");
            for (int i=0; i< terms.length; i++) {
                if (termNames[i].equals(privacy[1])) {

                }
            }
            break;
        }

        int[] answer = new int[privacies.length];
        return answer;
    }

    public boolean checkValidate(String today, String privacyDate) {
        return false;
    }

}