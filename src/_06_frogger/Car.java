package _06_frogger;

public class Car {

	
int CarX;
int CarY;
int CarSize;
int CarSpeed;

Car(int CarX, int CarY, int CarSize, int CarSpeed){
	this.CarX = CarX;
	this.CarY = CarY;
	this.CarSize = CarSize;
	this.CarSpeed = CarSpeed;
}

public void display()
{
  fill(0,0,255);
  rect(CarX , CarY,  CarSize, CarSpeed);
}
private void rect(int carX2, int carY2, int carSize2, int carSpeed2) {
	// TODO Auto-generated method stub
	
}
private void fill(int i, int j, int k) {
	// TODO Auto-generated method stub
	
}
}