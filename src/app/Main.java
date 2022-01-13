package app;

import java.util.Scanner;

public class Main {
	
	static Scanner reader = new Scanner(System.in);
	
	static DesignPatternsFacade dpFacade = new DesignPatternsFacade();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
	}
	
	public static void showMenu() {
		var menu = 	"***************************************************\n"
				+ 	"*  Design Patterns - GoF                          *\n"
				+ 	"*  Tiago da Costa Farinon                         *\n"
				+ 	"*  Exemplos de funcionamento                      *\n"
				+ 	"***************************************************\n"
				+ 	"* 1 - Abstract Factory         * 8  - Mediator    *\n"
				+   "* 2 - Bridge                   * 9  - Memento     *\n"
				+   "* 3 - Buider                   * 10 - Prototype   *\n"
				+   "* 4 - Chain of Responsibility  * 11 - Proxy       *\n"
			 	+   "* 5 - Composite                * 12 - State       *\n"
				+   "* 6 - Facade                   * 13 - Visitor     *\n"
				+   "* 7 - Flyweight                *                  *\n"
				+ 	"***************************************************\n"
				+ 	"Escolha o padrão que quer testar:";
		System.out.println(menu);
		choseOption();
	}
	
	private static void choseOption() {
		var n = reader.nextInt();

		switch(n){
			case 1:
				var t1 = dpFacade.getAbstractFactoryTester();
				t1.showMenu(t1.getTitle());
	            break;	
	        case 2:
	        	var t2 = dpFacade.getBridgeTester();
				t2.showMenu(t2.getTitle());
	            break;	        
	        case 3:
	        	var t3 = dpFacade.getBuilderTester();
				t3.showMenu(t3.getTitle());
	            break;	        
	        case 4:
	        	var t4 = dpFacade.getChainOfResponsibilityTester();
				t4.showMenu(t4.getTitle());
	            break;	        
	        case 5:
	        	var t5 = dpFacade.getCompositeTester();
				t5.showMenu(t5.getTitle());
	            break;	            
	        case 6:
	        	var t6 = dpFacade.getFacadeTester();
				t6.showMenu(t6.getTitle());
	            break;	       
	        case 7:
	        	var t7 = dpFacade.getFlyweightTester();
				t7.showMenu(t7.getTitle());
	            break;	        
	        case 8:
	        	var t8 = dpFacade.getMediatorTester();
				t8.showMenu(t8.getTitle());
	            break;	            
	        case 9:
	        	var t9 = dpFacade.getMementoTester();
				t9.showMenu(t9.getTitle());
	            break;	            
	        case 10:
	        	var t10 = dpFacade.getPrototypeTester();
				t10.showMenu(t10.getTitle());
	            break;
	        case 11:
	        	var t11 = dpFacade.getProxyTester();
				t11.showMenu(t11.getTitle());
	            break;
	        case 12:
	        	var t12 = dpFacade.getStateTester();
				t12.showMenu(t12.getTitle());
	            break;
	        case 13:
	        	var t13 = dpFacade.getVisitorTester();
				t13.showMenu(t13.getTitle());
	            break;
	        default:
	        	showMenu();
	    }
		
	}

}
