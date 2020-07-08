package step4_file;
// #파일 저
import java.io.FileWriter;

public class FileEx01 {
	public static void main(String[] args) {
		String fileName="ex01.txt";
		// FileWriter fw=new FileWriter(fileName);
		
		FileWriter fw=null;
		try {
			fw=new FileWriter(fileName);
			fw.write("test");
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 1. Run : Ctrl+F11
		// 2. 프로젝트 선택 후 F5(Refresh)를 누르면 생성된 메모장 파일을 확인할 수 있다.
	}
}
