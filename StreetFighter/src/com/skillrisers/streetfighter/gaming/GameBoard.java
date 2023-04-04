package com.skillrisers.streetfighter.gaming;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.skillrisers.streetfighter.sprites.OpponentPlayer;
import com.skillrisers.streetfighter.sprites.Player;
import com.skillrisers.streetfighter.utils.GameConstants;

public class GameBoard extends JPanel implements GameConstants {
	BufferedImage bgImage;
	private Player player;
	private OpponentPlayer oppPlayer;
	public GameBoard() throws Exception {
		player = new Player();
		oppPlayer = new OpponentPlayer();
		loadBackground();
	}
	@Override
	public void paintComponent(Graphics pen) {
		//System.out.println("Paint Component...");
		paintBackground(pen);
		player.paintPlayer(pen);
		oppPlayer.paintPlayer(pen);
	}
	private void paintBackground(Graphics pen) {
		
		pen.drawImage(bgImage, 0,0,SCREENWIDTH, SCREENHEIGHT, null);
		
		pen.setColor(Color.GREEN);
		pen.fillRect(100, 10, 600,50);
		pen.setColor(Color.GREEN);
		pen.fillRect(900, 10, 600,50);
	}
	private void loadBackground() {
		try {
			bgImage = ImageIO.read(GameBoard.class.getResource("bg_2.jpg"));
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Something went wrong...");
			System.out.println("Failed to load background image...");
			System.exit(0);
		}
	}
}
