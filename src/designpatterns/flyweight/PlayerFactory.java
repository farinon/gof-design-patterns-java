package designpatterns.flyweight;
import java.util.HashMap;

/*
Classe para retornar o jogador (Player)
Se j� existe retorna uma refer�ncia do objeto que j� existe
Caso contr�rio cria uma
*/

class PlayerFactory {
    /* HashMap para armazenar inst�ncias de player (nesse caso CT ou TR) */
    private static HashMap <String, Player> hm = new HashMap<String, Player>();

    public static Player getPlayer(String type) {
        Player player = null;
  
        /* Se um TR ou CT j� foi criado somente retorna sua refer�ncia*/
        if (hm.containsKey(type)) {
            player = hm.get(type);
        } else {
            /* Cria Terrorista ou Contra Terrorista  */
            switch(type) {

            case "Terrorist":
                System.out.println("\nT Created");
                player = new Terrorist();
                break;

            case "CounterTerrorist":
                System.out.println("\nCT Created");
                player = new CounterTerrorist();
                break;

            default:
                System.out.println("Not defined");
            }
  
            // Add no HashMap depois de criado
            hm.put(type, player);
        }

        return player;
    }
}
