package day2;

import java.util.Random;

class DuplicateException extends Exception{
	DuplicateException(){
		super("중복된 로또 번호가 발생했습니다.");
	}
}

class LottoMachine{
	
	int[] nums;
	
	LottoMachine(){
		nums = new int[6];
	}
	
	void createLottoNums() {
		Random random = new Random();
		for(int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(20) + 1;
		}
	}
	
	void checkLottoNums() throws DuplicateException{
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] == nums[j]) {
					throw new DuplicateException();
				}
			}
		}
	}
	
	int[] getNums() {
		return nums;
	}
}

public class LottoGame {
public static void main(String[] args) {
	
	LottoMachine lotto = new LottoMachine();
	lotto.createLottoNums();

	try {
		lotto.checkLottoNums();
	}catch(DuplicateException e) {
		System.out.println(e.getMessage());
		return;
	}
	
	for(int i : lotto.getNums()) {
		System.out.print(i + " ");
	}
	
	}
}
