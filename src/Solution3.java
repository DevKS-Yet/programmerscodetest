import java.util.Arrays;

class Solution3 {
    public int solution(int[] ingredient) {
        int answer = 0;
        int i = 0; // initial
        int number = 1; // start counting from 1

//        answer = burger(i, ingredient, number, answer);
        while (i < ingredient.length) {
            int[] burger = burger(i, ingredient, number, answer);
            i = burger[0];
            number = burger[1];
            answer = burger[2];
        }

        return answer;
    }

    int[] burger(int i, int[] ingredient, int number, int answer) {
        if (i == ingredient.length) return new int[]{i, number, answer};
        if (ingredient[i] == 1 && number != 4) number = 1;
        if (ingredient[i] == 1 && number == 4) {
            answer++;
            if (i >= 4) {
                if (ingredient[i-4] == 1) number = 2;
            }
        }
        if (ingredient[i] != 1 && ingredient[i] != number) number = 1;
        if (ingredient[i] == number) number++;
        if (i%1000 == 0 && i != ingredient.length) return new int[]{i+1, number, answer};
        return burger(i+1, ingredient, number, answer);
    }

//    int[] burger(int i, int[] ingredient, int number, int answer) {
//        if (i == ingredient.length) {
//            int[] answers = new int[3];
//            answers[0] = i;
//            answers[1] = number;
//            answers[2] = answer;
//            return answers; // 무한으로 돌아가기 위한 마침점
//        }
//        if (ingredient[i] == 1 && number != 4) number = 1; // 빵이지만 4번째 재료가 아닌 경우 리셋 로직
//        if (ingredient[i] != 1 && ingredient[i] != number) number = 1;
//        if (ingredient[i] == 1 && number == 4) answer++; // 4번째 재료가 빵인 경우
//        if (ingredient[i] == number) number++; // 재료가 순차적으로 올라온 경우
//        if (i%1000 == 0 && i != ingredient.length) {
//            int[] answers = new int[3];
//            answers[0] = i+1;
//            answers[1] = number;
//            answers[2] = answer;
//            return answers; // 무한으로 돌아가기 위한 마침점
//        }
//        return burger(i+1, ingredient, number, answer);
//    }

//    int burger(int i, int[] ingredient, int number, int answer) {
//        if (i == ingredient.length) return answer; // 무한으로 돌아가기 위한 마침점
//        if (ingredient[i] == 1 && number != 4) number = 1; // 빵이지만 4번째 재료가 아닌 경우 리셋 로직
//        if (ingredient[i] == 1 && number == 4) answer++; // 4번째 재료가 빵인 경우
//        if (ingredient[i] == number) number++; // 재료가 순차적으로 올라온 경우
//        return burger(i+1, ingredient, number, answer); // 다음 재료로 가는 재귀함수
//    }

//    int burger(int i, int[] ingredient, int number, int answer) {
//        if (i == ingredient.length) return answer; // ingredient의 수만큼 돌았을 때 answer를 return
////        if (ingredient[i] == 1) number = 1; // 중복으로 1이 나왔을 경우를 위한 number 초기화
//        if (ingredient[i] == number) { // 다음으로 나오는 재료가 number와 맞는지
//            if (number==3) { // number가 3이면 고기임으로 햄버거 1개 완성 후 재귀
//                answer++; // 햄버거 1개 완성하였음으로 ++
//                return burger(i+1, ingredient, number, answer);
//            }
//            number++; // 3이 아닌 경우
//            return burger(i+1, ingredient, number, answer);
//        }
//        return burger(i+1, ingredient, number, answer);
//    }

}