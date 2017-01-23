package cointoss;

import java.util.Random;

public class CoinToss {
	
	public String tossACoin() {
		Random rand = new Random();
		int toss = Math.abs(rand.nextInt()) % 2; // 숫자로 코인의 앞뒤 구분하게끔 함
		if(toss == 0) {
			return "HEADS";
		} else {
			return "TAILS";
		}
	}

	public static void main(String[] args) {
		CoinToss game = new CoinToss();
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
	}
}