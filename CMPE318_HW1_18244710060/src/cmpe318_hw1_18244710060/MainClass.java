
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

public class MainClass 
{
  
    public static void main(String[] args)
    {
       Player p1 = new Player("p1", 600, 3, 50, 40, 55);
       System.out.println(p1.toString());
       Knight k1 = new Knight("k1", 700, 3, 70, 60, 55, true);
       System.out.println(k1.toString());
       Archer a1 = new Archer("a1", 700, 3, 70, 60, 55);
       System.out.println(a1.toString());
       Tournament t1 = new Tournament(p1, k1);
       t1.fight();
    }   

}  

