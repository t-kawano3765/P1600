package game;

public class Kazuate {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("数当てゲームをしましょう");
		System.out.println("5回以内に当てて下さい");
		
		Input1 input1 = new Input1(); //inputクラスのインスタンス化
		
       for (int i =1; i<=5; i++) { //12行目~26行目まで5回繰り返す
    	   System.out.println(i+"回目"); //iの回数を出力

		int random= input1.comPuter(); // input1メソッドにメッセージと変数randomで戻り値の受け取り
		System.out.println("コンピュータが選んだ値は"+"   "+random+ "です");

		System.out.println("数値を入力して下さい");
		int    userInput =  input1.user(); //userメソッドにメッセージと変数userInputにたいして戻り値の受け取り
		System.out.println(userInput ); //標準入力された戻り値の出力

		Judge1 judge = new Judge1();  //Judge1クラスのインスタンス化

		String kekka =judge. judGment(random,userInput); //judGmentメソッドにメッセージ引数をrandomと変数userInputを引数として定義
		if (kekka=="当たりです。") { //条件:kekkaと戻り値が"当たりです。"のとき
		System.out.println(kekka);//変数kekkaを出力する
       break;  //24行目の条件に該当する時に終了する。
       }
		else if (i==5) {
			System.out.println("Game Overです。");
			break;
		}
       }
	}
}
