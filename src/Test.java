class Test {
    public static void main(String[] args) {

        long timeStart = System.currentTimeMillis();
        int a = Integer.MIN_VALUE;
        while (a <= Integer.MAX_VALUE) {
            System.out.print(a);
            a++;
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("\ntime taken : " + (timeEnd - timeStart));

    }
}