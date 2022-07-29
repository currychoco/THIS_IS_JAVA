package day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

class CopyExam{
	public static void main(String[] args) throws IOException {
		LocalDateTime now = LocalDateTime.now();

		//새 파일을 만들 것
		File dir = new File("c:/iotest"); 
		
		String newFileName = "sample_"+now.getYear()+"_"+now.getMonth()+"_"+now.getDayOfMonth()+".txt";
		File file = new File(dir,newFileName);
		file.createNewFile();
		
		//파일을 읽어올 것
		try (FileReader reader = new FileReader("c:/iotest/output.txt");
		    	   BufferedReader br = new BufferedReader(reader);){
			
			
		} catch (Exception e) {
			System.out.println("파일을 읽어오지 못했습니다.");
		}
	}
}