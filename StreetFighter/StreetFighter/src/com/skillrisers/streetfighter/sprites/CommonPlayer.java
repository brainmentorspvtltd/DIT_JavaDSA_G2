package com.skillrisers.streetfighter.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class CommonPlayer {
	protected int x;
	protected int y;
	protected int w;
	protected int h;
	protected BufferedImage playerImg;
	public abstract BufferedImage defaultImage();
	
	public void paintPlayer(Graphics pen) {
		pen.drawImage(defaultImage(), x, y, w, h, null);
	}
}
