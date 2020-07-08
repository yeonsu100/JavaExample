package step4_file;

import java.io.*;

public class FileEx04 {
	public static void main(String[] args) {
		String[] names= {"Kristoff", "Sven", "Hans"};
		String[] pws= {"1111", "2222", "3333"};
		int[] money= {20000, 30000, 40000};
		
		String fileName="fileTest02.txt";
		
		String data="";
		
		int size=names.length;
		for(int i=0; i<size; i++) {
			data+=names[i];
			data+="/";
			data+=pws[i];
			data+="/";
			data+=money[i];
			data="\n";
		}
		
		// 마지막 글자 삭제 
		data=data.substring(0, data.length()-1);
		System.out.println(data);
		
		FileWriter fw=null;
		try {
			fw=new FileWriter(fileName);
			fw.write(data);
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
