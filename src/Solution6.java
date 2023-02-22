class Solution6 {
    public int solution(int n, int k) {
        int answer = 0;
        int freeDrink = (int) ((n/10) * 2000);
        int stickPrice = n * 12000;
        int drinkPrice = k * 2000;
        answer = stickPrice + drinkPrice - freeDrink;
        return answer;
    }
}