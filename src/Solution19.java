class Solution19 {
    public int solution(int slice, int n) {
        int answer = 0;

        if (n > slice) answer = (int) Math.ceil((double) n / slice);
        else answer = 1;

        return answer;
    }
}