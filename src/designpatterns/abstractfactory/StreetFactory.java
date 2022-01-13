package designpatterns.abstractfactory;

public class StreetFactory extends AbstractFactory {

	@Override
	Vehicle getVehicle(String vehicleModel) {
		if (vehicleModel.equalsIgnoreCase("X")) {
			return new XStreet();
		} else if (vehicleModel.equalsIgnoreCase("Y")) {
			return new YStreet();
		}
		return null;
	}

}
