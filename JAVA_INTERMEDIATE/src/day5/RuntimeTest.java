package day5;
public class RuntimeTest {
	public static void main(String[] args) throws Exception {
		Runtime r = Runtime.getRuntime();		
		r.exec("c:/windows/notepad.exe");
		//Runtime r1 = Runtime.getRuntime();	
		//Runtime r2 = Runtime.getRuntime();	
		//System.out.println(r);
		//System.out.println(r1);
		//System.out.println(r2);
	}
}
