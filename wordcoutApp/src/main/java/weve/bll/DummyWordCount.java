package weve.bll;

import java.util.ArrayList;
import java.util.HashMap;

import weve.interfaces.iCountWords;
import weve.model.HashMapOutputDataModel;
import weve.model.InputDataModel;
import weve.model.OutputDataModel;
import weve.model.StringListDataModel;

public class DummyWordCount implements iCountWords{

	public OutputDataModel getResult(InputDataModel inputData) {
		
		StringListDataModel inputDataSet=(StringListDataModel) inputData;
		
		ArrayList<String> dataToBeProccessed=inputDataSet.getData();
		
		HashMap<String,Long> dataCounter=new HashMap<String,Long>();
		for(String oneWord:dataToBeProccessed)
		{
			String[] oneLineData=oneWord.split(" ");
			for(int i=0;i<oneLineData.length;i++)
			{
			String wordOne=oneLineData[i];
			if(dataCounter.containsKey(wordOne))
			{
				//update data
				long dataCountValue=dataCounter.get(wordOne)+1;
				dataCounter.remove(wordOne);
				dataCounter.put(wordOne, dataCountValue);
			}
			else
			{
				dataCounter.put(wordOne, 1L);
			}
			}
		}
		return new HashMapOutputDataModel(dataCounter);
	
	}

}
