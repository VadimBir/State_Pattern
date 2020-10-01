
public class Driver {



	public static void main(String[] args) {

		
		Character player = new Character(100, 11, "Player");
		Character enemy = new Character(20, 8, "Enemy");

		System.out.println("Player health: " + player.getHealth() + " Emeny health: " + enemy.getHealth());
		System.out.println("State player: " + player.getState() + "State enemy: " + enemy.getState());
		System.out.println("\n ");
		player.attackEnemy(enemy);

		System.out.println("Player health: " + player.getHealth() + " Emeny health: " + enemy.getHealth());
		System.out.println("State player: " + player.getState() + "State enemy: " + enemy.getState());
		System.out.println("\n ");
		enemy.attackEnemy(player);
		System.out.println("Player health: " + player.getHealth() + " Emeny health: " + enemy.getHealth());
		System.out.println("State player: " + player.getState() + "State enemy: " + enemy.getState());
		System.out.println("\n ");

		player.attackEnemy(enemy);
		System.out.println("Player health: " + player.getHealth() + " Emeny health: " + enemy.getHealth());
		System.out.println("State player: " + player.getState() + "State enemy: " + enemy.getState());
		System.out.println("\n ");
		
		player.attackEnemy(enemy);
		System.out.println("Player health: " + player.getHealth() + " Emeny health: " + enemy.getHealth());
		System.out.println("State player: " + player.getState() + "State enemy: " + enemy.getState());
		System.out.println("\n ");
		
		enemy.attackEnemy(player);
		System.out.println("Player health: " + player.getHealth() + " Emeny health: " + enemy.getHealth());
		System.out.println("State player: " + player.getState() + "State enemy: " + enemy.getState());
		System.out.println("\n ");
	}
}



