package day4;

import java.util.HashSet;
import java.util.Random;

public class LottoMachine {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		Random random = new Random();

		while(lotto.size() < 10) {
			lotto.add(random.nextInt(10, 30));
		}
		
		System.out.println("오늘의 로또 번호: " + lotto);
	}
}
