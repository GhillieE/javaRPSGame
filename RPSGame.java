import java.util.*;

public class RPSGame {
	public static void main(String[] args) {
		// スコープを広げるために変数をここで宣言
		String pcHand;
		int npcHand;
		boolean isFalse = true;
		//Mapでグーチョキパーを格納して数字に対応するようにしてます
		Map<Integer, String> rpsList = new LinkedHashMap<Integer, String>();
		rpsList.put(0, "グー");
		rpsList.put(1, "チョキ");
		rpsList.put(2, "パー");
		//タイトル表示
		System.out.println("---じゃんけんゲーム---");
		//for文でrpsListに入っているグーチョキパーを取り出して表示する
		for (int i = 0; i < rpsList.size(); i++) {
			System.out.println(rpsList.get(i));
		}//for
		System.out.println("から選んで入力してください");
		//じゃんけんを始めて、入力を求める。while文で求めている入力以外ならループさせてやり直させる
		System.out.print("最初はグー、じゃんけん…");
		do {
			pcHand = new Scanner(System.in).nextLine();
			npcHand = new Random().nextInt(2);
			if (!pcHand.equals("グー") || pcHand.equals("チョキ") || pcHand.equals("パー")) {			//このifでグーチョキパーを受け取り違えばisFalseをtrueのまま
				System.out.println("ちょっと、グーかチョキかパーかを出してください");					//グーチョキパーに含まれるならisFalseをfalseにしてループから脱出させる
			}else {
				isFalse = false;
			}//else
		} while (isTrue);
		//ここで勝ち負けチェックする
		if (pcHand.equals(rpsList.get(npcHand))) {
			System.out.println(rpsList.get(npcHand));
			System.out.println("あなたの勝ちです");
		}else {
			System.out.println(rpsList.get(npcHand));
			System.out.println("あなたの負けです");
		}//else
		//挨拶してゲームを終了させる
		System.out.println("お疲れ様でした");
	}//main
}//class