package beginner.abc081b;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abs/tasks/abc081_b
 * @author sakazoo
 *
 */
public class Main {
  public static void main(String[] args) {
    // 入力
    try (Scanner sc = new Scanner(System.in);) {
      int n = sc.nextInt();

      int[] numbers = new int[n];
      int operationCount = 0;
      // 数字の配列を作成する。要素内に奇数が含まれる場合は終了する。
      for (int i = 0; i < numbers.length; i++) {
        numbers[i] = sc.nextInt();
        if (numbers[i] % 2 != 0) {
          System.out.println(operationCount);
          return;
        }
      }

      while (isAllNumbersEven(numbers)) {
        doHalfNumbers(numbers);
        operationCount++;
      }

      // 出力
      System.out.println(operationCount);
    }
  }

  private static boolean isAllNumbersEven(int[] numbers) {
    for (int number : numbers) {
      if (number % 2 != 0) {
        return false;
      }
    }
    return true;
  }

  private static void doHalfNumbers(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = numbers[i] / 2;
    }
  }
}