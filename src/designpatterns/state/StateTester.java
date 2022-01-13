package designpatterns.state;

import app.TesterInterface;
import app.AbstractTester;

public class StateTester  extends AbstractTester implements TesterInterface{
	private String title = "State";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = " Este padrão de projeto de software é usado quando o comportamento de um objeto muda,\n"
				+ " dependendo do seu estado, propondo uma solução para esta complicação, criando basicamente,\n"
				+ " um objeto para cada estado possível do objeto que o chama.\n"
				+ "Permite que um objeto altere seu comportamento de acordo com o estado interno que se encontra\n"
				+ " em um momento dado.\n";
		System.out.println(content);
		System.out.println("");
		showMenu(title);
		
	}

	public String getTitle() {
		return title;
	}
	protected void choseOption() {
		var n = reader.nextInt();
		switch(n){
			case 1:
				showAbstract();
	            break;
	
	        case 2:
	            start();
	            break;
	            
	        case 3:
	            app.Main.showMenu();
	            break;
	            
	
	        default:
	        	showMenu(title);
		}
	   }
	@Override
	public void start() {
		showTitle(title);
		
		TvContext context = new TvContext();
		State tvStartState = new TvStartState();
		State tvStopState = new TvStopState();
		
		context.setState(tvStartState);
		context.doAction();
		
		
		context.setState(tvStopState);
		context.doAction();
		showMenu(title);

	}

}
