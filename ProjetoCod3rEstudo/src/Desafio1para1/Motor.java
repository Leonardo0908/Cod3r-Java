package Desafio1para1;

public class Motor {
	
	Car car;
	boolean switchedOn = false; //ligado
	double injectionFactor = 1;
	
	Motor(Car car){
		this.car = car;
	}
	
	int giros() {
		if(!switchedOn) {
			return 0;
		}else {
			return (int) Math.round(injectionFactor * 3000);
		}
	}
}
