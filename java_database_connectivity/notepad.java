package com.dbproj;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
//A clipboard is a temporary storage area for data that the user wants to copy from one place to another
//copy - cut - paste - When the user copies the selected content, it's stored in the clipboard buffer until it's pasted
import java.awt.datatransfer.DataFlavor;
//DataFlavor is typically used to access data on the clipboard, or during a drag and drop operation.
import java.awt.datatransfer.Transferable;
import java.awt.event.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.*;

public class notepad extends JFrame {

	private static final long serialVersionUID = 1L;
	//serialization is the process of converting an object into a stream of bytes 
	//to store it on disk or send it over the network
	//serialVersionUID, which is used during deserialization to verify that the sender and 
	//receiver of a serialized object have loaded classes for that object that are compatible with 
	//respect to serialization
	JFrame frame;
	JMenuBar menuBar;
	JMenu file;
	JMenu edit;
	JMenuItem open, newFile,save, exit;
	JMenuItem undo,paste, selectAll ;
	JMenu format;
	JMenu help;
	JFileChooser fileChooser;
	JTextArea textArea;
	Clipboard clip ;
	
	notepad() {
		frame = new JFrame("Notepad Application");
		file = new JMenu("File");
		edit = new JMenu("Edit");
		format = new JMenu("Format");
		help = new JMenu("Help");
		
		newFile = new JMenuItem("New");
		open = new JMenuItem("Open");		
		save = new JMenuItem("Save");
		exit = new JMenuItem("Exit");
		undo = new  JMenuItem("Undo                 Ctrl+Z");
		paste = new JMenuItem("Paste                Ctrl+V");
		selectAll = new JMenuItem("Select All       Ctrl+A ");
		textArea = new JTextArea();
		fileChooser = new JFileChooser();
		menuBar = new JMenuBar();
		
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        frame.add(textArea);
		file.add(open);
		file.add(newFile);
		file.add(save);
		file.add(exit);
		
		edit.add(undo);
		edit.add(paste);
		edit.add(selectAll);
		
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(format);
		menuBar.add(help);
		
		frame.setJMenuBar(menuBar);
		

		NewListener NewL = new NewListener();
		SaveListener saveL = new SaveListener();
		ExitListener exitL = new ExitListener();
		OpenListener openL = new OpenListener();
		open.addActionListener(openL);
		newFile.addActionListener(NewL);
		save.addActionListener(saveL);
		exit.addActionListener(exitL);
		//UndoListener UndoL = new UndoListener();
		PasteListener pasteL = new PasteListener();
		//EditListener EditL = new EditListener();
		//SelectListener SelectL = new SelectListener();
		//undo.addActionListener(UndoL);
		//paste.addActionListener(EditL);
		//selectAll.addActionListener(SelectL);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
	
	class OpenListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(frame)) {//open dialog box
				File file = fileChooser.getSelectedFile();
				textArea.setText("");
				Scanner in = null;
				try {
					in = new Scanner(file);
					while(in.hasNext()) {
						String line = in.nextLine();
						textArea.append(line+"\n");
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				} finally {
					in.close();
				}
			}
		}
	}
	
	class SaveListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(frame)) {
				File file = fileChooser.getSelectedFile();
				PrintWriter out = null;
				try {
					out = new PrintWriter(file);
					String output = textArea.getText();
					System.out.println(output);
					out.println(output);
				} catch (Exception ex) {
					ex.printStackTrace();
				} finally {
					try {
						out.flush();
						} catch(Exception ex1) 
						{
							
						}
					try {
						out.close();
						} catch(Exception ex1) {
							
						}
				}
			}
		}
	}
	
	class NewListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textArea.setText("");
			//frame.add(newFile);
			//textArea.(newFile+"\n");
			
			
			
		}
	}
	class ExitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	
	
	class PasteListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Transferable cliptran = clip.getContents(notepad.this);
	         try
	             {
	             String sel = (String) cliptran.getTransferData(DataFlavor.stringFlavor);//string data of clipboard where temporarily data stored
	             textArea.replaceRange(sel,textArea.getSelectionStart()/* start */,textArea.getSelectionEnd()/* end */);//copy from start to end
	         }
	         catch(Exception exc)
	             {
	             System.out.println("not string flavour");
	         }
			
		}
	}
	
	
	public static void main(String args[]) {
		notepad n = new notepad();
	}
}