package br.fee.unicamp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;

public class FileChooserActionListener implements ActionListener {

	private FileManager fileManager;
	
	public FileChooserActionListener(FileManager fileManager) {
		this.fileManager = fileManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser fileChooser = new JFileChooser();
		int result = fileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fileChooser.getSelectedFile();
			fileManager.setFile(selectedFile);
			fileManager.process();
		}		
	}

}