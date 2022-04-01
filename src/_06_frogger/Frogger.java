package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int frogX = 440;
	int frogY = 540;
	Car buddy = new Car(300, 200, 200, 50);
	Car right = new Car(500, 400, 200, 50);
	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		
	}

	public void draw() {
		background(0, 0, 200);
		fill(0, 140, 20);
		ellipse(frogX, frogY, 100, 100);
		
		buddy.display();
		right.display();
		check();
		buddy.moveLeft();
	}

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}

	public void keyPressed() {
		if (key == CODED) {
			if (keyCode == UP) {
				// Frog Y position goes up
				frogY = frogY - 20;
			} else if (keyCode == DOWN) {
				// Frog Y position goes down
				frogY = frogY + 20;
			} else if (keyCode == RIGHT) {
				// Frog X position goes right
				frogX = frogX + 20;
			} else if (keyCode == LEFT) {
				// Frog X position goes left
				frogX = frogX - 20;
			}
		}
	}

	public void check() {
		if (frogY >= 600) {
			frogY=540;

		} if (frogY <= 0) {
			frogY = 5;

		} if (frogX >= 800) {
			frogX = 730;

		} if (frogX <= 0) {
			frogX = 100;

		}
	}

	class Car {

		int CarX;
		int CarY;
		int CarSize;
		int CarSpeed;

		Car(int CarX, int CarY, int CarSize, int CarSpeed) {
			this.CarX = CarX;
			this.CarY = CarY;
			this.CarSize = CarSize;
			this.CarSpeed = CarSpeed;
		}

		void display() {
			fill(255, 0, 0);
			rect(CarX, CarY, CarSize, CarSpeed);
		}

		public void moveLeft() {
			CarX = CarX - 20;
		}
		public void moveRight() {
			
		}
	}

}