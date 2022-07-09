package Desafio1para1;

public class Car {
	
	Motor motor;
	
	Car(){
		this.motor = new Motor(this);
	}
	
	//acelerar
	void speedUp() {
		if(motor.injectionFactor < 2.6) {
			motor.injectionFactor += 0.4;
		}
	}
	//frear
	void brake() {
		if(motor.injectionFactor > 0.5) {
			motor.injectionFactor -= 0.4;
		}
	}
	//ligar
	void turnOn() {
		motor.switchedOn = true;
	}
	//desligado
	void off() {
		motor.switchedOn = false;
	}
	//estaligado
	boolean itsOn() {
		return motor.switchedOn;
	}
}