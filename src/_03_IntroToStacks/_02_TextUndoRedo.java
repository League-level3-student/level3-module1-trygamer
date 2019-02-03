package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	
	public static void main(String[] args) {
		_02_TextUndoRedo tur = new _02_TextUndoRedo();
		
		tur.SetUp();
	}
	
	Stack<Character> cr = new Stack<Character>();
	Stack<Character> crd = new Stack<Character>();
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	
	public void SetUp() {
	f.setVisible(true);
	f.add(p);
	p.add(l);
	f.addKeyListener(this);
	f.pack();
	
	
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
	
	
	
	
	
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		cr.push(e.getKeyChar());
		for(int i= 0; i<cr.size(); i++) {
		l.setText(l.getText()+cr.pop()+"");
	}
		
		if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
			
			String lss =l.getText();
			System.out.println(lss);
			crd.push((char) (lss.length()-1));
			l.setText(lss.substring(0, lss.length()-2));
			
		}
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			for(int i= 0; i<crd.size(); i++) {
			l.setText(l.getText()+crd.pop()+"");
			}
		}
	}

	
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
