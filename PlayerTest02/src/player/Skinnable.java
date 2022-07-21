package player;

/*
 <인터페이스 규칙>
 1. 인터페이스는 추상 메소드만을 가짐
 2. 일반적인 변수는 갖지 못하고 반드시 static 상수만을 가짐
 3. public static final은 생략 가능
 
 <인터페이스 이름을 짓는 방법>
 1. 클래스 이름처럼 명사로 만듦
 2. 인터페이스 중에서도 클래스를 꾸며주는, 보조하는 형태의 인터페이스 이름은 ~albe로 붙여서 만드는 것을 권장
 ex)runnable, clonnable...
 */
public interface Skinnable {
	
	/*public static final*/ int RED = 1; // 
	int BLUE =2;
	int GREEN = 3;
	int BLACK = 4;
	int LEOPARD = 5;
	
	void changeSkin(int skin);
}
