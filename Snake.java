import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Snake, our hero. 
 * 
 * @author Gloriana Zheng
 * @version September 2024
 */
public class Snake extends Actor
{
    GreenfootSound snakeSound = new GreenfootSound("snake-rattle-sound-hq-240150.mp3");
    GreenfootImage[] idle = new GreenfootImage[7];
    
    /*
     * Constructor - The code that gets run one time when object is created
     */
    public Snake()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/snake_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            mo