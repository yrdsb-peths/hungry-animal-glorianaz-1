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
    GreenfootImage idle = new GreenfootImage("images/snake_idle/idle0");
    
    /*
     * Constructor - The code that gets run one time when object is created
     */
    public Snake()
    {
        setImage(idle);
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
            move(-1);
        }
        
        //Remove cupcake if snake eats it
        eat();
        
    }
    
    /* 
     * Eat the cupcake and spawn new cupcake if a cupcake is eaten 
     */
    public void eat()
    {
        if(isTouching(Cupcake.class))
        {
            removeTouching(Cupcake.class);
            MyWorld world = (MyWorld) getWorld();
            world.createCupcake();
            world.increaseScore();
            snakeSound.play();
        }
    }
}