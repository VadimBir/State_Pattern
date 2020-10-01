public class Dead implements State{
    
    Character character;

    public Dead(Character character)
    {
        this.character=character;
    }
    public void attackEnemy(Character enemy, int doDmg) {
        System.out.println("Oops Seems like " + character.getName()+ " is dead and dead cant attack others...");
    }

    public void gotAttacked(int gotDmg) {
        
        System.out.println("Oops " + character.getName() + " is already dead ...");

    }
}
