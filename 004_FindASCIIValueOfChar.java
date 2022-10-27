// 문자에서 아스키 코드 찾기

public class AsciiValue {

    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        // char를 int로 캐스트할수도 있다
        int castAscii = (int) ch;

        System.out.println(ch + "의 아스키 코드는: " + ascii);
        System.out.println(ch + "의 아스키 코드는: " + castAscii);
    }
}


/*
<Output>
a의 아스키 코드는: 97
a의 아스키 코드는: 97
*/
