package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JFrame f = new JFrame();
	JLabel l = new JLabel();
	JLabel l2 = new JLabel();
	JPanel p = new JPanel();
	int lives = 0;
	static int Number_of_Words = 0;
	String r = "reach";
	String Word = "";
	String _Converter = "";

	public static void main(String[] args) {
		HangMan hm = new HangMan();
		hm.first_Interface();
		hm.setup();

	}

	public void first_Interface() {
		String Number_of_Words_Str = JOptionPane
				.showInputDialog("This is HangMan! How many words would you like to guess.");
		Number_of_Words = Integer.parseInt(Number_of_Words_Str);

	}

	public void setup() {
		Stack<String> Word_Storage = new Stack<String>();
		for (int i = 0; i < Number_of_Words; i++) {
			Word_Storage.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		}
		lives = 10;
		f.setVisible(true);
		f.add(p);
		f.setTitle("HangMan");
		p.add(l);
		l.setText("Lives: " + lives);
		p.add(l2);
		f.addKeyListener(this);
		f.pack();
		Word = Word_Storage.pop();

		for (int i = 0; i < Word.length(); i++) {
			_Converter += '_';
		}
		l2.setText(_Converter);
		System.out.println(r);
		f.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		char Key_Pressed = e.getKeyChar();
		if (Word.contains(Key_Pressed + "")) {
			for (int i = 0; i < Word.length(); i++) {

				System.out.println(Word.indexOf(Key_Pressed));

			}

		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
