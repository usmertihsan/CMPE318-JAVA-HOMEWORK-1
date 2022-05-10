
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
public class Tournament
{
    private Player fighter1;
    private Player fighter2;

    public Tournament(Player fighter1, Player fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }
    
    public void fight()
            
    {
       
        System.out.println("****************************************************************");
        System.out.println("Fight begin!!!!!!!!!!!!!!!!!!!!!!!");
        do                    
        {  
           System.out.println(fighter1.getName()+" attacks to "+ fighter2.getName());
           fighter1.attack(fighter1, fighter2);
           System.out.println(fighter1.toString());
           System.out.println(fighter2.toString());          
           System.out.println(fighter2.getName()+" attacks to "+ fighter1.getName());
           fighter2.attack(fighter2, fighter1);  
           System.out.println(fighter1.toString());
           System.out.println(fighter2.toString());
                         
        }  while(fighter1.alive() && fighter2.alive());
        
        if(fighter1.getHealth()>0)
        {
            fighter1.increaseScore();
            fighter1.levelUp();
            System.out.println("***************************");
            System.out.println("The winner is:"+ fighter1.getName());
            System.out.println("***************************");
            System.out.println(fighter1.toString());
            
        }
        
        else if (fighter2.getHealth()>0)              
        {
            fighter2.increaseScore();
            fighter2.levelUp();
            System.out.println("***************************");
            System.out.println("The winner is:"+ fighter2.getName());
            System.out.println("***************************");
            System.out.println(fighter2.toString());
        }
        
        
        
    }
}
