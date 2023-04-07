package com.skillrisers.streetfighter.sprites;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import com.skillrisers.streetfighter.utils.GameConstants;

public class OpponentPlayer extends CommonPlayer implements GameConstants {
	
	private BufferedImage idleImages[] = new BufferedImage[5];
	
	public OpponentPlayer() throws Exception {
		x = SCREENWIDTH - 500;
		y = GROUND;
		w = 200;
		h = 250;
		speed = 0;
		playerImg = ImageIO.read(Player.class.getResource(RYU_IMAGE));
		loadIdleImages();
	}
	
//	@Override
//	public BufferedImage defaultImage() {
//		//X = 2748 Y = 37 Width = 105 Height = 232
//		return playerImg.getSubimage(2748, 37, 105, 232);
//	}
	
	private void loadIdleImages() {
		idleImages[0] = playerImg.getSubimage(2172, 49, 93, 215);
		idleImages[1] = playerImg.getSubimage(2360, 37, 104, 233);
		idleImages[2] = playerImg.getSubimage(2555, 34, 106, 233);
		idleImages[3] = playerImg.getSubimage(2751, 37, 106, 233);
		idleImages[4] = playerImg.getSubimage(2955, 39, 106, 233);
	}
	
	@Override
	public BufferedImage defaultImage() {
		//X = 47 Y = 242 Width = 110 Height = 245
		//return playerImg.getSubimage(47, 242, 110, 245);
		if(imageIndex > 4) {
			imageIndex = 0;
		}
		BufferedImage img = idleImages[imageIndex];
		imageIndex++;
		return img;
	}
}
