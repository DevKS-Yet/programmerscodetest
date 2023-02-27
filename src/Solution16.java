class Solution16 {
    public int[] solution(int[] num_list) {
        int[] answer = {};

        answer = reverse1(num_list);

        return answer;
    }

    private int[] reverse(int[] num_list) {
        int[] result = new int[num_list.length];
        for (int i=0; i<num_list.length; i++) {
            result[i] = num_list[num_list.length-1-i];
        }
        return result;
    }

    private int[] reverse1(int[] num_list) {
        for (int i=0; i<num_list.length/2; i++) {
            int tmp = num_list[num_list.length-1-i];
            num_list[num_list.length-1-i] = num_list[i];
            num_list[i] = tmp;
        }
        return num_list;
    }
}