package task2;

import java.util.*;
import java.io.*;

/**
 * 1次元リバーシの最終的な黒石と白石の個数を求めます
 */
public class Main {

  /**
   * 棋譜Sをシミュレートして黒石と白石の個数を計算します
   */
  static void calculateReversi(List<String> lines) {
    String S = lines.get(0);

    // 盤面を文字のリストで管理、初期配置は黒・白。
    List<Character> board = new ArrayList<>();
    board.add('b');
    board.add('w');

    for (int i = 0; i < S.length(); i++) {
      char move = S.charAt(i);

      // 偶数番目は黒、奇数番目は白が打つ
      char stone;
      if (i % 2 == 0) {
        stone = 'b';
      } else {
        stone = 'w';
      }

      char opponent;
      if (stone == 'b') {
        opponent = 'w';
      } else {
        opponent = 'b';
      }

      if (move == 'R') {
        // 右端に石を追加し、左方向にある相手の石をひっくり返す
        board.add(stone);
        int pos = board.size() - 1;
        int j = pos - 1;
        while (j >= 0 && board.get(j) == opponent) {
          j--;
        }
        if (j >= 0 && board.get(j) == stone) {
          for (int k = j + 1; k < pos; k++) {
            board.set(k, stone);
          }
        }
      } else {
        // 左端に石を追加し、右方向にある相手の石をひっくり返す
        board.add(0, stone);
        int pos = 0;
        int j = pos + 1;
        while (j < board.size() && board.get(j) == opponent) {
          j++;
        }
        if (j < board.size() && board.get(j) == stone) {
          for (int k = pos + 1; k < j; k++) {
            board.set(k, stone);
          }
        }
      }
    }

    long black = board.stream().filter(c -> c == 'b').count();
    long white = board.stream().filter(c -> c == 'w').count();
    System.out.println(black + " " + white);
  }

  public static void main(String[] args) throws IOException {
    List<String> array = new ArrayList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String stdin;
    while ((stdin = br.readLine()) != null) {
      if (stdin.equals("")) break;
      array.add(stdin);
    }
    calculateReversi(array);
  }
}