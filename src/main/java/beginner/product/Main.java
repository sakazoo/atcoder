package beginner.product;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abs/tasks/abc086_a
 * @author sakazoo
 *
 */
public class Main {
  public static void main(String[] args) {
    // 入力
    try (Scanner sc = new Scanner(System.in);) {
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();

      // 出力
      String answer = (num1 * num2) % 2 == 0 ? "Even" : "Odd";
      System.out.println(answer);
    }
  }
}