package app;

import java.util.Scanner;

public abstract class AbstractTester {
	protected static Scanner reader = new Scanner(System.in);
	
	public void showMenu(String title) {
		showTitle(title);
		var menu ="********************************\n"
				+ "* 1 - Resumo sobre o padrão    *\n"
				+ "* 2 - Iniciar teste            *\n"
				+ "* 3 - Voltar ao menu principal *\n"
				+ "********************************\n";
		System.out.println(menu);
		choseOption();
	}
	
	public void showTitle(String title) {

		var ret = "********************************\n"
				 +" "+ title +"\n"
				 +"********************************";
		System.out.println(ret);
		
	}

	protected abstract void choseOption();

}
