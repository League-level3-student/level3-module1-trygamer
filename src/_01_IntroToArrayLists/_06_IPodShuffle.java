package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	
	ArrayList<Song> songs = new ArrayList<Song>();
	
	Random r = new Random();
	int y;
	Song s = new Song(null);
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
		
		JFrame f = new JFrame();
		JButton b= new JButton();
		JPanel p = new JPanel();
		b.addActionListener(this);
		
		f.add(p);
		f.setVisible(true);
		p.add(b);
		b.setText("Suprise Me!");
		f.pack();
	
      songs.add(new Song("demo.mp3"));
      songs.add(new Song("Alan Walker - Faded.mp3"));
      songs.add(new Song("Lil Pump Gucci Gang ROBLOX MUSIC VIDEO (OOF-er GANG).mp3"));
      songs.add(new Song("mainMenuMusic.mp3"));
      songs.add(new Song("Watercolour.mp3"));
      
   
		
		
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		songs.get(y).stop();
		 y = r.nextInt(songs.size());
		
		
		
		System.out.println(y);
		
		
		
	
		
		
	songs.get(y).play();
		System.out.println(y);
		
	
		
	}
}