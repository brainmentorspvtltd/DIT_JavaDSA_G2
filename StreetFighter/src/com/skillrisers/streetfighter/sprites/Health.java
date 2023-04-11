package com.skillrisers.streetfighter.sprites;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Health extends CommonPlayer {
	Color color;
	public Health(int x, Color color) {
		this.x = x;
		y = 20;
		w = 500;
		h = 50;
		this.color = color;
	}

	@Override
	public BufferedImage defaultImage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void printHealth(Graphics pen) {
		pen.setColor(color);
		pen.fillRect(x, y, w, h);
	}
}
