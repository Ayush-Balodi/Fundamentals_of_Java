package Unit_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class sample39{
	public static void main(String[] args) throws IOException{
		
		ABEF obj = new ABEF();
		obj.takeInputFromFile();
		obj.saveOutputFromFile();
	}
}

class ABEF{

	void takeInputFromFile() throws IOException{

		String path = "\"C:\\Users\\ayush\\git\\Fundamentals_of_Java\\Project_01\\src\\Unit_03\\input\"";
		File file = new File(path);

		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;

		while( (str = br.readLine()) != null ){
			System.out.println(str);
		}
		System.out.println("\n");
		br.close();
	}

	void saveOutputFromFile() throws IOException{

		FileWriter obj = null;

		try{
			obj = new FileWriter("\"C:\\Users\\ayush\\git\\Fundamentals_of_Java\\Project_01\\src\\Unit_03\\output\"");
		}
		catch(IOException e){
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(obj);

		String text = "Hey this would store in Output file.";
		f_writer.write(text);
		f_writer.close();
	}

}