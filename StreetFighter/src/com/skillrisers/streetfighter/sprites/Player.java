package com.skillrisers.streetfighter.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import com.skillrisers.streetfighter.utils.GameConstants;

public class Player extends CommonPlayer implements GameConstants {
	
	private BufferedImage idleImages[] = new BufferedImage[4];
	private BufferedImage walkImages[] = new BufferedImage[5];
	private BufferedImage kickImages[] = new BufferedImage[5];
	
	private int force;
	public Player() throws Exception {
		x = 150;
		y = GROUND;
		w = 200;
		h = 250;
		force = 0;
		speed = 0;
		playerImg = ImageIO.read(Player.class.getResource(KEN_IMAGE));
		loadIdleImages();
		loadWalkImages();
		loadKickImages();
	}
	
	private void loadIdleImages() {
		idleImages[0] = playerImg.getSubimage(47, 242, 110, 245);
		idleImages[1] = playerImg.getSubimage(266, 240, 108, 248);
		idleImages[2] = playerImg.getSubimage(478, 244, 110, 243);
		idleImages[3] = playerImg.getSubimage(685, 246, 116, 242);
	}
	
	private void loadWalkImages() {
		walkImages[0] = playerImg.getSubimage(46, 737, 114, 235);
		walkImages[1] = playerImg.getSubimage(258, 731, 117, 243);
		walkImages[2] = playerImg.getSubimage(470, 731, 103, 243);
		walkImages[3] = playerImg.getSubimage(692, 731, 99, 244);
		walkImages[4] = playerImg.getSubimage(907, 749, 99, 226);
	}
	
	private void loadKickImages() {
		kickImages[0] = playerImg.getSubimage(56, 1458, 117, 247);
		kickImages[1] = playerImg.getSubimage(247, 1458, 123, 243);
		kickImages[2] = playerImg.getSubimage(428, 1461, 207, 243);
		kickImages[3] = playerImg.getSubimage(247, 1458, 123, 243);
		kickImages[4] = playerImg.getSubimage(56, 1458, 117, 247);
	}
	
	public BufferedImage printIdle() {
		//X = 47 Y = 242 Width = 110 Height = 245
		//return playerImg.getSubimage(47, 242, 110, 245);
		if(imageIndex > 3) {
			imageIndex = 0;
		}
		BufferedImage img = idleImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	public BufferedImage printWalk() {
		if(imageIndex > 4) {
			imageIndex = 0;
			currentMove = IDLE;
		}
		BufferedImage img = walkImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	public BufferedImage printKick() {
		if(imageIndex > 4) {
			imageIndex = 0;
			currentMove = IDLE;
		}
		BufferedImage img = kickImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	public void jump() {
		force = -50;
		y = y + force;
	}
	
	public void fall() {
		if(y + force > GROUND) {
			return;
		}
		force = force + GRAVITY;
		y = y + force;
	}
	
	@Override
	public BufferedImage defaultImage() {
		if(currentMove == WALK) {
			return printWalk();
		}
		else if(currentMove == KICK) {
			return printKick();
		}
		else {
			return printIdle();
		}
	}
	
}
