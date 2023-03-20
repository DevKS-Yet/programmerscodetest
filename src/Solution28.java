class Solution28 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String s11 : s1) {
            for (String s21 : s2) {
                if (s11.equals(s21)) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}