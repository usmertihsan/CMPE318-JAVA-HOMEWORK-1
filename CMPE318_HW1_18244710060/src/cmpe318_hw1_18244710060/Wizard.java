
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
public class Wizard extends Player
{
    
    public Wizard(String name, int score, int level, int damage, int defense, int health) {
        super(name, score, level, damage, defense, health);
        this.setHealth(health+10);
    }
    
    public String toString()
    {
        return (this.getClass().getSimpleName()+ "{ name="+this.getName()+", score="+ this.getScore()+", level="+this.getLevel()+", damage="+ this.getDamage()+", defense="+this.getDefense()+", health="+this.getHealth()+"}");
    }
    
    
}
