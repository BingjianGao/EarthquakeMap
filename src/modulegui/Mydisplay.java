package modulegui;

import processing.core.*;




public class Mydisplay extends PApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	PImage img;
	
	public void setup() {
		
		size(500,500);
		background(100,100,100);
		img=loadImage("no1.JPG","JPG");
		stroke(0);
		
		
		
	}
	
	public void draw() {
		
		img.resize(0, height);
		image(img,0,0);
		
		int [] color= sunSec(second());
		fill(color[0],color[1],color[2]);
		ellipse(width/4,height/5,width/4,height/5);
		
	}
	
	public int[] sunSec(float seconds) {
		int []rgb=new int[3];
		float timediff=Math.abs(seconds-30);
		float ratio=timediff/30;
		
		rgb[0]=(int)(ratio*255);
		rgb[1]=(int)(ratio*255);
		rgb[2]=0;
		return rgb;
		
	}
	

	
}
