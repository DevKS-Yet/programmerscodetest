class Solution12 {
    public int solution(int price) {
        if (price >= 500000) return discount(price, 20);
        if (price >= 300000) return discount(price, 10);
        if (price >= 100000) return discount(price, 5);
        return price;
    }

    private int discount(int price, int percent) {
        return price*(100-percent)/100;
    }
}