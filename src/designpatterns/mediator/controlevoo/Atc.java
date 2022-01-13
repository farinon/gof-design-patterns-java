package designpatterns.mediator.controlevoo;
public class Atc implements atcInterface {
	public Boolean avaible;
	
	@Override
	public void registerFlight(Flight flight) {
	}
	
	@Override
	public void registerTrack(Track track) {
	}
	
	@Override
	public void setAvailability(Boolean status) {
		this.avaible = status;
	}
	
	@Override
	public Boolean isAvaible() {

		return avaible;
	}
	
	}
