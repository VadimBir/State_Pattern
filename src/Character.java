public class Character {
    
    State alive;
    State dead;
    State gotAttack;
    State doAttack;
    State state;
    int health = 0;
    int dmg = 0;
    Character otherCharacter;
    String name;



    public Character(int health, int dmg, String name)
    {
        alive = new Alive(this);
        dead = new Dead(this); 
        this.health=health;
        this.dmg=dmg;
        this.name=name;

        if(health>0){
            state = alive;
        }else{
            state = dead;
        }
    }
    //setter and getter of param 
    void setName(String charName)
    {
        name = charName;
    }
    String getName()
    {
        return name;
    }
    void setHealth(int hp)
    {
        health = hp;
    }
    int getHealth()
    {
        return health;
    }
    int getDmg()
    {
        return dmg;
    }
    //State setter and getter 
    void setState(State state)
    {
        this.state = state;
    }
    public State getState()
    {
        return state;
    }
    public State getDead()
    {
        return dead;
    }
    public State getAlive()
    {
        return alive;
    }

    //---------------------------------------------
    //
    public void attackEnemy(Character enemy)
    {
        this.otherCharacter=enemy;
        state.attackEnemy(otherCharacter, dmg);
    }
    public void gotAttacked(int dmg)
    {
        state.gotAttacked(dmg);
    }


}
