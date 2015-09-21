package br.fee.unicamp;

import java.io.File;

public abstract class FileManager {

	protected File file;
	
	public abstract void process();

	public void setFile(File file) {
		this.file = file;
	}
	
}