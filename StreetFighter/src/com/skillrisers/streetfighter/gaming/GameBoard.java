package com.skillrisers.streetfighter.gaming;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
		setFocusable(true);
		loadBackground();
		bindEvents();
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
	
	void bindEvents() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Key Typed : " + e.getKeyCode());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Key Released : " + e.getKeyCode());
				player.setSpeed(0);
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println("Key Pressed : " + e.getKeyCode());
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					player.setSpeed(-SPEED);
					player.move();
					repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					player.setSpeed(SPEED);
					player.move();
					repaint();
				}
				
				if(e.getKeyCode() == KeyEvent.VK_A) {
					oppPlayer.setSpeed(-SPEED);
					oppPlayer.move();
					repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_D) {
					oppPlayer.setSpeed(SPEED);
					oppPlayer.move();
					repaint();
				}
			}
		});
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
