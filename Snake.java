import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Snake, our hero. 
 * 
 * @author Gloriana Zheng
 * @version September 2024
 */
public class Snake extends Actor
{
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
        }
    }
}