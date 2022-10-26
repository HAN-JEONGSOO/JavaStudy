// 사용자에 의해 입력된 정수를 어떻게 출력하는가

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        // standard input에서 input을 가져오는 읽기 인스턴스를 만든다
        Scanner reader = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");

        // nextInt()는 키보드로부터 다음의 정수를 읽는다
        int number = reader.nextInt();

        // println()은 output 화면에 다음 행을 출력한다
        System.out.println(number + "을(를) 입력하였습니다");
    }
}


/*
<Output>
숫자를 입력하세요: 10
10을(를) 입력하였습니다
*/
