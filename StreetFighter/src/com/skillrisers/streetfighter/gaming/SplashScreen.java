package com.skillrisers.streetfighter.gaming;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;

import com.skillrisers.streetfighter.utils.GameConstants;

import jaco.mp3.player.MP3Player;

public class SplashScreen extends JFrame implements GameConstants {
	
	private JLabel label = new JLabel();
	private MP3Player mp3player;
	public SplashScreen() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setSize(SCREENWIDTH, SCREENHEIGHT);
		setExtendedState(MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setTitle(TITLE);
		
		Icon icon = new ImageIcon(SplashScreen.class.getResource("splash.jpg"));
		label.setIcon(icon);
		this.add(label);
		setVisible(true);
		loadMusic();
		
		try {
			Thread.sleep(10000);
			setVisible(false);
			dispose();
			mp3player.stop();
			GameScreen obj = new GameScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void loadMusic(){
		mp3player = new MP3Player(GameBoard.class.getResource("StreetFighter.mp3"));
		mp3player.play();
	}

	public static void main(String[] args) {
		SplashScreen screen = new SplashScreen();

	}

}
