import java.util.Random;

public class Dice 
{
    public static void main(String[] args) {
        Dice d = new Dice(); 
        
        //Testing
        for(int i = 0; i < 10; i++)
        {
            System.out.println(d.diceRoll()) ; 
        }

        //Testing
        for(int i = 0; i < 10; i++)
        {
            System.out.println(d.diceRoll(10)) ; 
        }
    }
    

    /**
     * Rolls a dice with n sides and returns the result.
     * 
     * @param sides The preferred number of sides
     * @return A number between 1 and n(inclusive)
     */
    public int diceRoll(int sides)
    {
        Random rand = new Random(); 
        int result = rand.nextInt(sides)+1; 
        return result;  
    }

    /**
     * Rolls a dice with 6 sides and returns the result. 
     * 
     * @return A number between 1 and 6(inclusive) 
     */
    public int diceRoll()
    {
        return this.diceRoll(6); 
    }




}
