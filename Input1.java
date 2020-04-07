package game;
import java.util.Random;
import java.util.Scanner;
public class Input1 {


public int  comPuter() {  //comPuterメソッド

	Random random =new Random(); //乱数を発生させる準備

	int randomno = random.nextInt(99); //変数randomnoの宣言して標準入力された値を代入
	//System.out.println(randomno); 
	return randomno; //戻り値を変数randomで設定
	}

 public int user() {  //userメソッド
	 
	 Scanner scan = new Scanner(System.in);  //標準入力の準備
	 int userInput = scan.nextInt();  //変数userInputの宣言と標準入力された値を代入
	return userInput ; //戻り値を変数userInputで設定
 }
}
