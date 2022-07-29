package day4;

public class WhileLab3_1 {

	public static void main(String[] args) {
		int time=0;
		while(true) {
			int num=(int)(Math.random()*31);			
			char alp=(char)(num+64);
				
			if(num==0 || num>=27 && num<=30)
				break;
			else
				System.out.println(alp+"("+num+")");
				time++;					
		}
		System.out.println("수행횟수는 "+time+"번 입니다.");
	}

}
