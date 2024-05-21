import java.sql.SQLOutput;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("키와 나이를 입력하세요");
        int height = sc.nextInt();
        int age = sc.nextInt();

        int usjPrice = height>200 && age>=20? 10000 : 5000;
        int usjPriceDiscount = age%2 ==0? 1000:500;
        int usjTotalPrice = usjPrice - usjPriceDiscount;

        System.out.println("입장료 : " + usjPrice + "원" );
        System.out.println("할인\t  : " + usjPriceDiscount + "원" );
        System.out.println("총요금 : " + usjTotalPrice + "원" );
    }
}
