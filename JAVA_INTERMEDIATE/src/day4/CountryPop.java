package day4;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountryPop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> country = new HashMap<String, Integer>();
		String name;
		int num;
		
		while(country.size() < 5) {
			System.out.print("나라 이름을 입력하세요: ");
			name = sc.next();
			System.out.print("인구 수를 입력하세요: ");
			num = sc.nextInt();
			if(!country.containsKey(name)) {
				country.put(name, num);
			}else {
				System.out.println("나라명 " + name + "은 이미 저장되었습니다.");
			}
		}
		System.out.print("5개가 모두 입력되었습니다.\n입력된 데이터: ");
	
		for(Entry<String, Integer> ent : country.entrySet()) {
			System.out.print(ent.getKey() + "(" + ent.getValue() + "), ");
			//마지막 ','를 없애는 방법을 못 찾겠습니다.
		}
		sc.close();
	}
}
