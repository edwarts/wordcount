package weve.bll;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import weve.interfaces.iSource;
import weve.model.InputDataModel;
import weve.model.OutputDataModel;
import weve.model.StringListDataModel;

public class FileDataSource implements iSource{

	public InputDataModel getInputSource(String sourcePath) {
		ArrayList<String> listLine=new ArrayList<String>();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(sourcePath));
			String line;
			while ((line = br.readLine()) != null) {
			   listLine.add(line);
			}
			br.close();
			return new StringListDataModel(listLine);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return null;
		}

	}

	public OutputDataModel getOutputSource() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
