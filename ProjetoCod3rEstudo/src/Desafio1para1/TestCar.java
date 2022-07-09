package Desafio1para1;

public class TestCar {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println(c1.itsOn());
		
		c1.turnOn();
		System.out.println(c1.itsOn());
		
		System.out.println(c1.motor.giros());
		
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		
		System.out.println(c1.motor.giros());
		
		c1.brake();
		c1.brake();
		c1.brake();
		c1.brake();
		c1.brake();
		c1.brake();
		c1.brake();
		c1.brake();
		
		System.out.println(c1.motor.giros());
		
		//Falto Encapsulamento !!
		//c1.motor.fatorInjecao = -30;
		
		// Relação bidirecional
		System.out.println(c1.motor.car.motor.car.motor.giros());
		System.out.println(c1.motor.giros());
	}

}
