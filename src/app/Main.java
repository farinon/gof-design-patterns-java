package app;

public class Main {

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
	}

}
