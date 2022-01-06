package ReadFrom;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadFromCsvFile {
	public static void main(String[]args) throws CsvValidationException, IOException  {
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

		
		
	}

}
