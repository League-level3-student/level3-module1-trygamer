package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * 
	 * 
	 * Create a GUI with three buttons. Button 1: Add Entry When this button is
	 * clicked, use an input dialog to ask the user to enter an ID number. After an
	 * ID is entered, use another input dialog to ask the user to enter a name. Add
	 * this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */

	public static void main(String[] args) {
		_02_LogSearch m = new _02_LogSearch();
		m.Setup();
	}

	HashMap<Integer, String> LogSearch = new HashMap<Integer, String>();

	JFrame f = new JFrame();
	JPanel p  = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	

	public void Setup() {
		f.setVisible(true);
		f.add(p);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		f.pack();
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b1.setText("Add Entry");
		b2.setText("View List");
		b3.setText("Remove Entry");
		f.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			String s_IDNUM = JOptionPane.showInputDialog("Enter an ID");
			String name = JOptionPane.showInputDialog("Enter name");
			int id = Integer.parseInt(s_IDNUM);

			LogSearch.put(id, name);

		}

		f() {
			String ids1 = JOptionPane.showInputDialog("Enter ID number");
			
			int ids = Integer.parseInt(ids1);
			if(LogSearch.containsKey(ids)) {
				JOptionPane.showMessageDialog(null, LogSearch.get(ids)+ " key=" + ids);
			}
			else {
				JOptionPane.showMessageDialog(null, "This ID is not in the list");
			}
			
  	
		
		if (e.getSource() == b2) {
			JOptionPane.showMessageDialog(null, "Names: "+ LogSearch.values());
		}

		if (e.getSource() == b3) {
			String removedid = JOptionPane.showInputDialog("Enter the ID that you want to Remove");
			int rid = Integer.parseInt(removedid);
			if (LogSearch.containsKey(rid)) {
				LogSearch.remove(rid);
			} else {
				JOptionPane.showMessageDialog(null, "Their is no names cantaining that ID");
			}

		}

	}

}
