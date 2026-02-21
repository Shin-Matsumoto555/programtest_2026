# programtest_2026

## 1. 概要
プログラミング課題(programtest_2026)の提出リポジトリです。言語はJavaを使用しています。

## 2. 実行方法
コンパイル後、標準入力で値を渡して実行します。
```bash
javac src/main/java/task1/Main.java -d out
echo "10" | java -cp out task1.Main
```

## 3. 課題一覧

### (1)task1: すごろくの最小サイコロ回数
A マスのすごろくで、スタートからゴールまでの最小サイコロ回数を求めます。

　→1回で最大6マス進めることから、切り上げ除算で最小回数を求めました

**＜動作確認＞**

　①期待する出力
```
echo "10" | java -cp out task1.Main
→ 2

echo "13" | java -cp out task1.Main
→ 2
```
　②実行結果
 
<img width="861" height="177" alt="image" src="https://github.com/user-attachments/assets/3aecc762-03f3-46f9-969c-87064471a348" />

### (2)task2: 1次元リバーシ
棋譜Sをもとに1次元リバーシをシミュレートし、最終的な黒石と白石の個数を出力します。

　→盤面をリストで管理し、石を置くたびに相手の石をスキャンしてひっくり返す処理をシミュレートしました
 
**＜動作確認＞**

　①期待する出力
```
echo "RRLL" | java -cp out task2.Main
→ 0 6

echo "LLRLRLR" | java -cp out task2.Main
→ 3 6
```
　②実行結果
 
 <img width="868" height="172" alt="image" src="https://github.com/user-attachments/assets/1c82af28-3373-46f0-8085-d4eec4f9155e" />

### (3)task3: 桁の並べ替えによる最小値
n桁の整数の桁を並べ替えて、先頭が0にならない最小の整数を求めます。

　→桁をソートして先頭が0の場合のみ、最小の非ゼロ桁と入れ替えるアプローチを取りました
 
**＜動作確認＞**

　①期待する出力
```
echo "201" | java -cp out task3.Main
→ 102

echo "122121222122222" | java -cp out task3.Main
→ 111122222222222
```
　②実行結果

 <img width="903" height="177" alt="image" src="https://github.com/user-attachments/assets/63cacbf3-ba13-40a7-b799-eb0d71f30b05" />

