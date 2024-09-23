import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our snake.
 * 
 * @author Gloriana Zheng
 * @version September 2024
 */
public class Cupcake extends Food
{
    private int speed = 2;
    /**
     * Act - do whatever the Cupcake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Cupcake falls downwards
        moveDownwards(speed);
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    
    // Cupcake is 5 Points
    public int getScoreValue()
    {
        return 5;
    }
}