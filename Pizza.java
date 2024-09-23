import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author Gloriana Zheng
 * @version Sep. 2024
 */
public class Pizza extends Food
{
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 1;
    public void act()
    {
        moveDownwards(speed);
    }
    
    public int getScore()
    {
        return 1;
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
