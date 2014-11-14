package weve.interfaces;

import weve.model.InputDataModel;
import weve.model.OutputDataModel;

public interface iSource {
	
	public InputDataModel getInputSource(String sourcePath);
	public OutputDataModel getOutputSource();

}
