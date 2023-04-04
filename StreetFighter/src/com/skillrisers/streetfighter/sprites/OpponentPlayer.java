package com.skillrisers.streetfighter.sprites;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import com.skillrisers.streetfighter.utils.GameConstants;

public class OpponentPlayer extends CommonPlayer implements GameConstants {
	
	public OpponentPlayer() throws Exception {
		x = SCREENWIDTH - 500;
		y = GROUND;
		w = 200;
		h = 250;
		speed = 0;
		playerImg = ImageIO.read(Player.class.getResource(RYU_IMAGE));
	}
	
	@Override
	public BufferedImage defaultImage() {
		//X = 2748 Y = 37 Width = 105 Height = 232
		return playerImg.getSubimage(2748, 37, 105, 232);
	}
}
