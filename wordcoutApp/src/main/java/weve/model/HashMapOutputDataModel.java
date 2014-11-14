package weve.model;

import java.util.HashMap;

public class HashMapOutputDataModel extends OutputDataModel{
	
	HashMap<String,Long> _data=new HashMap<String,Long>();
	
	public HashMapOutputDataModel(HashMap<String,Long> data)
	{
		_data=data;
	}

	public HashMap<String, Long> get_data() {
		return _data;
	}

	public void set_data(HashMap<String, Long> _data) {
		this._data = _data;
	}

}
