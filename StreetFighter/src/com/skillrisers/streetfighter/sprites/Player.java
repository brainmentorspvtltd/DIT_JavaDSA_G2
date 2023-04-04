package com.skillrisers.streetfighter.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import com.skillrisers.streetfighter.utils.GameConstants;

public class Player extends CommonPlayer implements GameConstants {
	
	public Player() throws Exception {
		x = 150;
		y = GROUND;
		w = 200;
		h = 250;
		playerImg = ImageIO.read(Player.class.getResource("ken_.png"));
	}
	
	@Override
	public BufferedImage defaultImage() {
		//X = 47 Y = 242 Width = 110 Height = 245
		return playerImg.getSubimage(47, 242, 110, 245);
	}
	
}
