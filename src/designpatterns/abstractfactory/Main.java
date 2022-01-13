package designpatterns.abstractfactory;

public class Main {

	public static void main(String[] args) {
		AbstractFactory offRoadFactory = FactoryProducer.getFactory("OffRoad");
		
		Vehicle carro1 = offRoadFactory.getVehicle("X");
		carro1.method();
		
		Vehicle carro2 = offRoadFactory.getVehicle("Y");
		carro2.method();
		
		AbstractFactory streetFactory = FactoryProducer.getFactory("Street");
		
		Vehicle carro3 = streetFactory.getVehicle("X");
		carro3.method();
		
		Vehicle carro4 = streetFactory.getVehicle("Y");
		carro4.method();
	}
}
