class Solution17 {
    public int solution(int[] array, int height) {
        int answer = 0;

        for (int arrays : array) if (height <= arrays) answer++;

        return answer;
    }
}