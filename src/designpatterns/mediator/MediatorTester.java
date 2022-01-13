package designpatterns.mediator;

import app.TesterInterface;
import designpatterns.mediator.chat.ChatRoom;
import designpatterns.mediator.chat.ChatUser;
import designpatterns.mediator.chat.IChatRoom;
import designpatterns.mediator.chat.User;
import app.AbstractTester;

public class MediatorTester  extends AbstractTester implements TesterInterface{
	private String title = "Meditor";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = " Este padr�o � usado frequentemente quando deseja-se encapsular como os objetos\n"
					+ " interagem, ou seja, a comunica��o entre os objetos � estabelecida atrav�s do \n"
					+ "Mediator. Este padr�o � considerado um padr�o comportamental, pois o padr�o pode\n"
					+ " alterar o comportamento da aplica��o (programa).O Mediator promove o fraco aco-\n"
					+ "plamento ao evitar que objetos se referiram uns aos outros explicitamente.\n";
		
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
		IChatRoom chatroom = new ChatRoom();
        
        User user1 = new ChatUser(chatroom,"1", "Maria");
        User user2 = new ChatUser(chatroom,"2", "Jos�");
        User user3 = new ChatUser(chatroom,"3", "Jo�o");
        User user4 = new ChatUser(chatroom,"4", "Ana");
         
        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        
        user1.send("Hello brian", "2");
        user2.send("Hey buddy", "1");
	}

}
