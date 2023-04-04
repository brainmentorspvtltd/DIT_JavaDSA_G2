package com.skillrisers.streetfighter.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import com.skillrisers.streetfighter.utils.GameConstants;

public class Player extends CommonPlayer implements GameConstants {
	
	private BufferedImage idleImages[] = new BufferedImage[4];
	
	public Player() throws Exception {
		x = 150;
		y = GROUND;
		w = 200;
		h = 250;
		speed = 0;
		playerImg = ImageIO.read(Player.class.getResource(KEN_IMAGE));
		loadIdleImages();
	}
	
	private void loadIdleImages() {
		idleImages[0] = playerImg.getSubimage(47, 242, 110, 245);
		idleImages[1] = playerImg.getSubimage(266, 240, 108, 248);
		idleImages[2] = playerImg.getSubimage(478, 244, 110, 243);
		idleImages[3] = playerImg.getSubimage(685, 246, 116, 242);
	}
	
	@Override
	public BufferedImage defaultImage() {
		//X = 47 Y = 242 Width = 110 Height = 245
		//return playerImg.getSubimage(47, 242, 110, 245);
		if(imageIndex > 3) {
			imageIndex = 0;
		}
		BufferedImage img = idleImages[imageIndex];
		imageIndex++;
		return img;
	}
	
}
