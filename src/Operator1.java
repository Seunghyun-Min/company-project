import java.util.Scanner;

public class Operator1 {
    public static void main(String[] args) {
        //import 단축키 alt + enter
        //들여쓰기 정렬 ctrl + alt + i
        //키보드 입력 받을준비
        Scanner sc = new Scanner(System.in);

        // 대입 연산자 : = <- 같다는 뜻이 아니다. 대입했다는 뜻; 우항에 있는 내용을 왼쪽에 담는다.
        // 같다: ==

        int x = 10;

        //산술연산자 : + - * / %

        /*System.out.println("y값 : ");
        int y = sc.nextInt();

        int hap = x+y;
        int cha = x-y;
        int gob = x*y;
        int mok = x/y;
        // % 나눈 나머지*/
        System.out.println("------------------------------");

        //증감 연산자 : +=, -=, *=,/=.%=

        System.out.println(x);

        x = x+  1; // x에 x+1의 값을 담았다.
        System.out.println(x);
        x += 1;
        System.out.println(x);

        x -=2; //x에 x-2의 값을 담는다.
        System.out.println(x);

        x *= 2;
        System.out.println(x);

        x /= 2;
        System.out.println(x);

        x %= 2;
        System.out.println(x);

        //전위 후위 연산자
        x++; //1증가 ++x;
        x--; //1감소 --y;



        System.out.println(x);

    }
}
