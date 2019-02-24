package beginner.abc087b;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abs/tasks/abc087_b
 * @author sakazoo
 *
 */
public class Main {

  public static void main(String[] args) {
    // 入力
    try (Scanner sc = new Scanner(System.in);) {
      int coin500 = sc.nextInt();
      int coin100 = sc.nextInt();
      int coin50 = sc.nextInt();
      int total = sc.nextInt();

      int pattern = 0;
      for (int i = 0; i <= coin500; i++) {
        for (int j = 0; j <= coin100; j++) {
          for (int k = 0; k <= coin50; k++) {
            if (total == 500 * i + 100 * j + 50 * k) {
              pattern++;
            }
          }
        }
      }

      // 出力
      System.out.println(pattern);
    }
  }

}