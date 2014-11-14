package weve.main;

import java.util.Map.Entry;
import java.util.Set;

import weve.bll.DummyWordCount;
import weve.bll.FileDataSource;
import weve.interfaces.iCountWords;
import weve.interfaces.iSource;
import weve.model.HashMapOutputDataModel;
import weve.model.InputDataModel;
import weve.model.OutputDataModel;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		iSource is=new FileDataSource();
		iCountWords icw=new DummyWordCount();
		InputDataModel inputData=is.getInputSource("C:\\Users\\TEST ACCOUNT\\boma\\testData.txt");
		OutputDataModel outPut=icw.getResult(inputData);
		HashMapOutputDataModel result=(HashMapOutputDataModel) outPut;
	    for(Entry<String, Long> oneData:result.get_data().entrySet())
	    {
	    	System.out.println("Word->"+oneData.getKey()+" occurs->"+oneData.getValue());
	    }

	}

}
