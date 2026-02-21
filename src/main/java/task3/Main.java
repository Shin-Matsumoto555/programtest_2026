package task3;

import java.util.*;
import java.io.*;

/**
 * n桁の整数xの桁を並べ替えて、先頭が0にならない最小の整数を求めます
 */
public class Main {

  /**
   * 桁を並べ替えて最小値を計算します
   */
  static void calculateMinPermutation(List<String> lines) {
    String x = lines.get(0);

    // 桁を文字の配列に分解してソート
    char[] digits = x.toCharArray();
    Arrays.sort(digits);

    // 先頭が0の場合、0でない最小の桁と入れ替える
    if (digits[0] == '0') {
      for (int i = 1; i < digits.length; i++) {
        if (digits[i] != '0') {
          char tmp = digits[0];
          digits[0] = digits[i];
          digits[i] = tmp;
          break;
        }
      }
    }

    System.out.println(new String(digits));
  }

  public static void main(String[] args) throws IOException {
    List<String> array = new ArrayList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String stdin;
    while ((stdin = br.readLine()) != null) {
      if (stdin.equals("")) break;
      array.add(stdin);
    }
    calculateMinPermutation(array);
  }
}