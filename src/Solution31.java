class Solution31 {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("(?:a|o|u|i|e)", "");
        return answer;
    }
}