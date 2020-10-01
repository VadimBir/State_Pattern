public class Alive implements State{

    Character character;
    int health;
    int gettingDmg;
    int toDoDmg;


    public Alive(Character character)
    {
        this.character=character; 
    }
    public void attackEnemy(Character enemy, int doDmg) {
        System.out.println(character.getName() + " is attacking other character: " + doDmg + " attack");
        enemy.gotAttacked(doDmg);
    }

    public void gotAttacked(int gotDmg) {
        System.out.println(character.getName() + " is attacked: " + gotDmg + " attack");
        character.setHealth(character.getHealth()-gotDmg);
        if(character.getHealth()<=0){
            character.setState(character.getDead());
        }
    }

    
}
