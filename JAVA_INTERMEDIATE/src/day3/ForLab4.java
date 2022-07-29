package day3;

public class ForLab4 {
	public static void main(String[] args) {
		int count = (int)(Math.random()*8) + 3;
		int deco = (int)(Math.random()*3) + 1;
		char decoMunja;
		
		if (deco == 1)
			decoMunja = '*';
		else if (deco == 2)
			decoMunja = '$';
		else
			decoMunja = '#';
		
		for(int i=1; i <= count; i++)
			System.out.print(decoMunja);	
	}
}
