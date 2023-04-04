package com.skillrisers.streetfighter.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import com.skillrisers.streetfighter.utils.GameConstants;

public class OpponentPlayer extends CommonPlayer implements GameConstants {
	private int x;
	private int y;
	private int w;
	private int h;
	BufferedImage playerImg;
	public OpponentPlayer() throws Exception {
		x = SCREENWIDTH - 150;
		y = GROUND;
		w = 200;
		h = 250;
		playerImg = ImageIO.read(Player.class.getResource("ken_.png"));
	}
	public BufferedImage defaultImage(){
		//
		return 
	}

	public void paintPlayer(Graphics pen) {
		pen.drawImage(playerImg, x, y, w, h, null);
	}
}
