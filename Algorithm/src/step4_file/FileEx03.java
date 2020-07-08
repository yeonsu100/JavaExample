package step4_file;

import java.io.*;

public class FileEx03 {
	public static void main(String[] args) {
		String[] names= {"Elsa", "Anna", "Olaf"};
		int[] birth= {1222, 0621, 0116};
		
		String fileName="fileTest01.txt";
		
		String data="";
		
		int size=names.length;
		for(int i=0; i<size; i++) {
			data+=names[i];
			data+="/";
			data+=birth[i];
			if(i!=size-1) {
				data+=",";
			}
		}
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
