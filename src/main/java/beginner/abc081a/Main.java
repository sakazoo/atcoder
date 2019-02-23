package beginner.abc081a;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abs/tasks/abc081_a
 * @author sakazoo
 *
 */
public class Main {
  public static void main(String[] args) {
    // 入力
    try (Scanner sc = new Scanner(System.in);) {
      String str = sc.next();
      char[] marbles = str.toCharArray();

      int sum = 0;
      for(char marble : marbles) {
        if('1' == marble) {
          sum++;
        }
      }

      // 出力
      System.out.println(sum);
    }
  }
}