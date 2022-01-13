package designpatterns.state;


public class Main {

	public static void main(String[] args) {
		TvContext context = new TvContext();
		State tvStartState = new TvStartState();
		State tvStopState = new TvStopState();
		
		context.setState(tvStartState);
		context.doAction();
		
		
		context.setState(tvStopState);
		context.doAction();
		
	}

}
