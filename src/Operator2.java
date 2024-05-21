public class Operator2 {
    public static void main(String[] args) {
        //논리(비교) 연산자 : 결과로 boolean 나오는 것(참/거짓)
        //==(같다) !=(다르다)

        int x = 10;
        int y = 20;
        boolean a = x<y;

        System.out.println(a);

        // 결합 연산자 : ★논리연산자★ 여러개 묶는거
        // && ex)A && B => A와 B를 모두 만족하면 true
        // || ex)A || B => A나 B를 만족하면 true
        // ^ ex)A ^ B => A나 B 둘 중 하나만 만족해야 true

        // 단항 연산자
        // ! !A A의 결과를 반대로

        // x가 5보다 크고, y가 10보다 작나?
        boolean b = x > 5 && y < 10;
        System.out.println(b);

        // x가 5보다 크거나, y가 10보다 작나?
        boolean c = x > 5 || y < 10;
        System.out.println(c);

        System.out.println("-------------------------------------");
        //놀이동산
        //놀이기구를 타도 되는지 체크하는 프로그램

        //키, 나이

        int height = 180;
        int age = 30;

        // 나이가 10살 이상이고, 키가 200넘으면 타도 됨
        boolean ok = age>=10 && height > 200;
        System.out.println(ok);
        //★확률이 낮은 것을 앞으로 배치하면 연산 횟수를 줄일 수 있다.★
        // 키가 200넘고, 나이가 10살 이상이면  타도 됨
        boolean ok2 = height > 200 && age>=10;
        System.out.println(ok2);

        // 나이가 10살 이상거나, 키가 200넘으면 타도 됨
        boolean ok3 = age>=10 || height > 200;
        System.out.println(ok3);

        // 키가 200넘거나, 나이가 10살 이상이면  타도 됨
        boolean ok4 = height > 200 || age>=10;
        System.out.println(ok4);

        // 키가 200이 넘으면 타면 안된다.
        height = 220;

        boolean ok5 = !(height > 200);
        System.out.println(ok5);

        // 삼항연산자 (참 / 거짓 개념)
            // 둘 중 하나
        // 조건식 ? 조건 만족시 값(true) : 조건 불만족시 값(false)
        // 조건? true : false

        //나이가 8살 넘으면 welcome, 안넘으면 go home

        String msg = age > 8 ? "welcome" : "go home";
        System.out.println(msg);

        //짝수, 홀수
        //age % 2 == 0 짝수
        //age % 2 == 1 홀수

        //TEST
        //놀이동산 입장료 계산
        //키가 200넘거나 나이가 20 이상이면 10000원, 아니면 5000원
        //할인
        //나이가 짝수면 1000원, 아니면 500원 할인
        //총 요금=입장료 - 할인
        //결과출력
        //입장료 : OO원
        //할인 : OO원
        //총요금 : OO원
        System.out.println("------------------------------------------------");



        int usjPrice = height>200 && age>=20? 10000 : 5000;
        int usjPriceDiscount = age%2 ==0? 1000:500;
        int usjTotalPrice = usjPrice - usjPriceDiscount;

        System.out.println("입장료 : " + usjPrice + "원" );
        System.out.println("할인\t  : " + usjPriceDiscount + "원" );
        System.out.println("총요금 : " + usjTotalPrice + "원" );

        System.out.println("------------------------------------------------");
        System.out.printf("입장료 : %d원\n",usjPrice);
        System.out.printf("할인\t : %d원\n",usjPriceDiscount);
        System.out.printf("입장료 : %d원\n",usjTotalPrice);












    }
}
