package com.skillrisers.streetfighter.gaming;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.skillrisers.streetfighter.sprites.Health;
import com.skillrisers.streetfighter.sprites.OpponentPlayer;
import com.skillrisers.streetfighter.sprites.Player;
import com.skillrisers.streetfighter.sprites.PowerEffect;
import com.skillrisers.streetfighter.utils.GameConstants;

import jaco.mp3.player.MP3Player;

public class GameBoard extends JPanel implements GameConstants {
	BufferedImage bgImage;
	private Player player;
	private OpponentPlayer oppPlayer;
	private Health ryu_health;
	private Health ken_health;
	private Timer timer;
	private boolean isGameOver;
	private MP3Player mp3player;
	public GameBoard() throws Exception {
		player = new Player();
		oppPlayer = new OpponentPlayer();
		setFocusable(true);
		loadBackground();
		bindEvents();
		loadHealth();
		loadMusic();
		gameLoop();
	}
	
	private void loadMusic(){
		mp3player = new MP3Player(GameBoard.class.getResource("StreetFighter.mp3"));
		mp3player.play();
	}
	
	private void gameLoop() {
		timer = new Timer(200, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				player.fall();
				collision();
			}
		});
		timer.start();
	}
	
	private void loadHealth() {
		ryu_health = new Health(30, "RYU");
		ken_health = new Health(SCREENWIDTH - 560, "KEN");
	}
	
	private void printHealth(Graphics pen) {
		ryu_health.printHealth(pen);
		ken_health.printHealth(pen);
	}
	
	private boolean isCollide() {
		int xDistance = Math.abs(player.getX() - oppPlayer.getX());
		int yDistance = Math.abs(player.getY() - oppPlayer.getY());
		int maxH = Math.max(player.getH(), oppPlayer.getH());
		int maxW = Math.max(player.getW(), oppPlayer.getW());
		return xDistance <= maxW && yDistance <= maxH;
	}
	
	private void collision() {
		if(isCollide()) {
			if(player.isAttacking() && oppPlayer.isAttacking()) {
				
			}
			else if(player.isAttacking()) {
				//oppPlayer.prinHitImages();
				oppPlayer.setCurrentMove(HIT);
				ken_health.setHealth();
			}
			else if(oppPlayer.isAttacking()) {
				
			}
			
			if(ken_health.getHealth() <= 0 || ryu_health.getHealth() <= 0) {
				isGameOver = true;
			}
			
			//System.out.println("Collision Detected...");
			player.setCollide(true);
			player.setSpeed(0);
		}
		else {
			player.setCollide(false);
			//System.out.println("No Collision...");
			player.setSpeed(SPEED);
		}
	}
	
	private void printGameOver(Graphics pen) {
		pen.setColor(Color.WHITE);
		pen.setFont(new Font("times", Font.BOLD, 80));
		pen.drawString("Game Over", SCREENWIDTH/2 - 160, SCREENHEIGHT/2 - 80);
	}
	
	@Override
	public void paintComponent(Graphics pen) {
		//System.out.println("Paint Component...");
		paintBackground(pen);
		player.paintPlayer(pen);
		oppPlayer.paintPlayer(pen);
		printHealth(pen);
		printPower(pen);
		if(isGameOver) {
			printGameOver(pen);
			timer.stop();
		}
	}
	private void paintBackground(Graphics pen) {
		pen.drawImage(bgImage, 0,0,SCREENWIDTH, SCREENHEIGHT, null);
//		pen.setColor(Color.GREEN);
//		pen.fillRect(100, 10, 600,50);
//		pen.setColor(Color.GREEN);
//		pen.fillRect(900, 10, 600,50);
	}
	
	void bindEvents() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				//System.out.println("Key Typed : " + e.getKeyCode());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				//System.out.println("Key Released : " + e.getKeyCode());
				player.setSpeed(0);
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println("Key Pressed : " + e.getKeyCode());
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					player.setSpeed(-SPEED);
					player.move();
					player.setCollide(false);
					player.setCurrentMove(WALK);
					//repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					player.setSpeed(SPEED);
					player.move();
					player.setCurrentMove(WALK);
					//repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_K) {
					player.setCurrentMove(KICK);
					player.setAttacking(true);
				}
				else if(e.getKeyCode() == KeyEvent.VK_P) {
					player.setCurrentMove(PUNCH);
					player.setAttacking(true);
				}
				else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					player.jump();
				}
				else if(e.getKeyCode() == KeyEvent.VK_Z) {
					player.setCurrentMove(POWER);
					player.showPower();
				}

				
				if(e.getKeyCode() == KeyEvent.VK_A) {
					oppPlayer.setSpeed(-SPEED);
					oppPlayer.move();
					//repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_D) {
					oppPlayer.setSpeed(SPEED);
					oppPlayer.move();
					//repaint();
				}
			}
		});
	}
	
	private void printPower(Graphics pen) {
		for(PowerEffect power : player.getPowers()) {
			power.printPower(pen);
		}
	}
	
	private void loadBackground() {
		try {
			bgImage = ImageIO.read(GameBoard.class.getResource(BACKGROUND_IMAGE));
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Something went wrong...");
			System.out.println("Failed to load background image...");
			System.exit(0);
		}
	}
}
