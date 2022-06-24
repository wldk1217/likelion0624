package org.example.untitled;

class Main {
    public static void main(String[] args) {

        // 구현시작
        자동차 a자동차1 = new 자동차();
        a자동차1.km = 230;
        자동차 a자동차2 = new 자동차();
        a자동차2.km = 210;
        // 구현끝
        a자동차1.달리다();
        // 출력 => 자동차가 최고속력 230km로 달립니다.
        a자동차2.달리다();
        // 출력 => 자동차가 최고속력 210km로 달립니다.
    }
}

class 자동차 {
    // 구현
    public int km;

    void 달리다 () {
        System.out.println("자동차가 최고속력" + this.km + "km로 달립니다.");
    }
}