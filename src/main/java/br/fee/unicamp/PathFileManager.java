package br.fee.unicamp;

import javax.swing.JTextField;

public class PathFileManager extends FileManager {

	private JTextField txtField;

	public PathFileManager(JTextField txtField) {
		this.txtField = txtField;
	}
	
	@Override
	public void process() {
		this.txtField.setText(file.getPath());
	}

}