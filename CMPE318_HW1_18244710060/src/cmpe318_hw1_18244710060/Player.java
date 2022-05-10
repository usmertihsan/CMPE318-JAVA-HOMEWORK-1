//
package cmpe318_hw1_18244710060;

/**
 *
 * @author Mert İhsan US
 *CMPE318 HW1
 * 18244710060
 * SE
 * 
 * 07.12.2021 
 */




public class Player implements PlayerInterface
{
    private String name;
    private int score;
    private int level;
    private int damage;
    private int defense;
    private int health;

    public Player(String name, int score, int level, int damage, int defense, int health) {
        this.name = name;
        this.score = score;
        this.level = level;
        this.damage = damage;
        this.defense = defense;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    /**
     *
     */
    @Override
    public String toString()
    {
       return (this.getClass().getSimpleName()+ "{ name="+this.getName()+", score="+ this.getScore()+", level="+this.getLevel()+", damage="+ this.getDamage()+", defense="+this.getDefense()+", health="+this.getHealth()+"}");
    }
    
    public boolean alive()
    {
        if((this.health)>0)
            return true;
        else
            return false;
    }
    
    public void attack (Player attacker, Player enemy)
    {
        int injury=(attacker.getDamage())-(enemy.getDefense());
        
        if(injury>0)
        {
            enemy.health-=injury;
        }
    }

    @Override
    public void levelUp() 
    {
        if(this.score>=1000)
        {
            this.level=(this.level)+1;
            this.score=(this.score)-1000;
        }
            
    }

    @Override
    public void increaseScore()
    {
            this.score=(this.score)+100;
    }

    
    
}
