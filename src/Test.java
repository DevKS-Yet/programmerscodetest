import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        String input = "77 77 7777";
        String[] tmp = input.split(" ");
        int a = Integer.parseInt(tmp[0]);
        int b = Integer.parseInt(tmp[1]);
        int c = Integer.parseInt(tmp[2]);

        System.out.println(a+b+c);

        int number = 153;

        int answer = 0;
        String s = Integer.toString(number);
        String[] split = s.split("");
        for (int i=0; i<split.length; i++) {
            answer += (int) Math.pow(Double.parseDouble(split[i]), split.length);
        }
        System.out.println(number == answer);

    }
}