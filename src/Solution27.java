class Solution27 {
    public int[] solution(int n) {
        int[] answer = new int[(int) Math.ceil(( double)n/2)];

        int count = 0;
        for (int i=1; i<=n; i+=2, count++) {
            answer[count] = i;
        }

        return answer;
    }
}