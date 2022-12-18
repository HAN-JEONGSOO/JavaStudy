import java.util.Scanner;

class RemoveWhitespaces {
  public static void main(String[] args) {

    // 스캐너 객체를 만들어줌
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");

    // 입력받은 것을 출력
    String input = sc.nextLine();
    System.out.println("Original String: " + input);

    // 공백을 
    input = input.replaceAll("\\s", "");
    System.out.println("Final String: " + input);
    sc.close();
  }
}


/*
Enter the string
J  av  a-  P rog  ram  m ing
Original String: J  av  a-  P rog  ram  m ing
Final String: Java-Programming
*/
