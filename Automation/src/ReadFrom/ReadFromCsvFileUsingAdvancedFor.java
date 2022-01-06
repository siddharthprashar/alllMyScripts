package ReadFrom;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

public class ReadFromCsvFileUsingAdvancedFor {

	public static void main(String[] args) throws IOException, CsvException {
		//creating object for  FR
				FileReader fr=new FileReader("./resources/Siddharth.csv");
				//creating object for respective file type
				@SuppressWarnings("resource")
				CSVReader reader=new CSVReader(fr);
				//call the read methods
				String[] info = reader.readNext();
				System.out.println(info[0]);
				System.out.println(info[1]);
				System.out.println(info[2]);
				System.out.println(info[3]);
				System.out.println("=================");
				String[] info2 = reader.readNext();
				System.out.println(info2[0]);
				System.out.println(info2[1]);
				System.out.println(info2[2]);
				System.out.println(info2[3]);
				List<String[]> allInfo = reader.readAll();
				for(String[]a:allInfo) {
					for(String b:a) {
						System.out.println(b+" ");
					}
					System.out.println();
				}
	}

}
