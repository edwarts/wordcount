package weve.model;

import java.util.ArrayList;

public class StringListDataModel extends InputDataModel {
	
	private ArrayList<String> _data=new ArrayList<String>();
	
	public StringListDataModel(ArrayList<String> data)
	{
		_data=data;
	}
	public ArrayList<String> getData()
	{
		return _data;
	}

}
