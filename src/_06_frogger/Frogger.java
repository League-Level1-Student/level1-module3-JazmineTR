package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int frogX = 440;
    int frogY = 550;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
    	background(0,0,200);
    	fill(0, 140, 20);
    	ellipse(frogX, frogY, 100, 100);
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            	frogY= frogY-50;
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            	frogY= frogY+50;
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            	frogX = frogX+50;
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            	frogX = frogX-50;
            }
        }
    }
    public void check() {
    	if(frogY >= 600) {
    		frogY = 100;
    	}
    	else if(frogY<=0) {
    		frogY = 100;
    	}
    }
}

