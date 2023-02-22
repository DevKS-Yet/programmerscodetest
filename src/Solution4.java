class Solution4 {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String babble : babbling) {
            if( checkBabble(babble) ) answer++;
        }
        return answer;
    }

    public boolean checkBabble(String babble) {
        if (babble.contains("aya")) babble = babble.replace("aya", "1");
        if (babble.contains("ye")) babble = babble.replace("ye", "1");
        if (babble.contains("woo")) babble = babble.replace("woo", "1");
        if (babble.contains("ma")) babble = babble.replace("ma", "1");
        if (babble.matches("1+")) return true;
        return false;
    }
}