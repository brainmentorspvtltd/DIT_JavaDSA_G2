package com.skillrisers.streetfighter.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import com.skillrisers.streetfighter.utils.GameConstants;

public class Player implements GameConstants {
	private int x;
	private int y;
	private int w;
	private int h;
	BufferedImage playerImg;
	public Player() throws Exception {
		x = 100;
		y = GROUND;
		w = 400;
		h = 600;
		playerImg = ImageIO.read(Player.class.getResource("ken_.png"));
	}
	public void paintPlayer(Graphics pen) {
		pen.drawImage(playerImg, x, y, w, h, null);
	}
}
