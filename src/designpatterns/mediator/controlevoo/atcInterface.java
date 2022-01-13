package designpatterns.mediator.controlevoo;

public interface atcInterface {
	public void registerFlight(Flight flight);
	public void registerTrack(Track track);
	public void setAvailability(Boolean status);
	public Boolean isAvaible();
}


