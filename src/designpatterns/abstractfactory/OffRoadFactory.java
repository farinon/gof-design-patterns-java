package designpatterns.abstractfactory;

public class OffRoadFactory extends AbstractFactory {
	@Override
	public Vehicle getVehicle(String vehicleModel) {
		if (vehicleModel.equalsIgnoreCase("X")) {
			return new XOffRoad();
		} else if (vehicleModel.equalsIgnoreCase("Y")) {
			return new YOffRoad();
		}
		return null;
	}
}