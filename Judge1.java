package game;

public class Judge1 {

	public String  judGment(int getrandom,int userInput) {
         String kekka = null;  //戻り値として使う文字列の変数kekkaの宣言
		//	System.out.println("ジャッジメソッド1"+getrandom);
		//	System.out.println("ジャッジメソッド2"+userInput);	

		if (getrandom == userInput) { //条件    変数randomがuserInputと等しい時
			//System.out.println("当たりです。");  //当たりです。を出力する
		    kekka="当たりです。";
		}
		else if(getrandom > userInput){
       // System.out.println("乱数が大きい為外れです。");
		kekka="乱数が大きい為外れです。" ; 
		}	
         else { //if(getrandom < userInput){
			//System.out.println("乱数が小さい為外れです。");
		kekka="乱数が小さい為外れです。" ; 	
		}
       return kekka;  //戻り値を変数kekkaで設定する。
      
	}
}
