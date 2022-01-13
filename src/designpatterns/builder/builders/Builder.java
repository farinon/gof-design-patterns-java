package designpatterns.builder.builders;

import designpatterns.builder.cars.CarType;
import designpatterns.builder.components.Engine;
import designpatterns.builder.components.GPSNavigator;
import designpatterns.builder.components.Transmission;
import designpatterns.builder.components.TripComputer;

public interface Builder {

	void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
