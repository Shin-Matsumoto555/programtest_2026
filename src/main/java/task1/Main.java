package task1;

import java.util.*;
import java.io.*;

/**
 * すごろくの最小サイコロ回数を求めます
 */
public class Main {

  /**
   * Aマスのすごろくでゴールするための最小回数を計算します
   */
  static void calculateMinRolls(List<String> lines) {
    int A = Integer.parseInt(lines.get(0));
    int answer = (int) Math.ceil((A - 1) / 6.0);
    System.out.println(answer);
  }

  public static void main(String[] args) throws IOException {
    List<String> array = new ArrayList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String stdin;
    while ((stdin = br.readLine()) != null) {
      if (stdin.equals("")) break;
      array.add(stdin);
    }
    calculateMinRolls(array);
  }
}