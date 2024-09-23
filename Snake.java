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
    GreenfootImage[] idleLeft = new GreenfootImage[5];
    GreenfootImage[] idleRight = new GreenfootImage[5];
    
    // Direction the snake is facing
    String facing = "left";
    SimpleTimer animationTimer = new SimpleTimer();
    /*
     * Constructor - The code that gets run one time when object is created
     */
    public Snake()
    {
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/snake_idle/idle" + i + ".gif");
            idleLeft[i].scale(200, 80);
        }
        
        for(int i = 0; i < idleRight.length;i++)
        {
            idleRight[i] = new GreenfootImage("images/snake_idle/idle" + i + ".gif");
            idleRight[i].mirrorHorizontally();
            idleRight[i].scale(200, 80);
        }
        
        animationTimer.mark();
        
        // Initial snake image
        setImage(idleLeft[0]);
    }
    
    /*
     * Animate the snake 
     */
    int imageIndex = 0;
    public void animateSnake()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
            
        }
        animationTimer.mark();
        if(facing.equals("left"))
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
        else 
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
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
            move(2);
            facing = "right";
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            facing = "left";
        }
        
        
        //Remove cupcake if snake eats it
        eat();
        
        //Animate the cupcake 
        animateSnake();
    }
    
    /* 
     * Eat the cupcake and spawn new cupcake if a cupcake is eaten 
     */
    public void eat()
    {
        if(isTouching(Food.class))
        {
            Food food = (Food)getOneIntersectingObject(Food.class);
            removeTouching(Food.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnFood();
            world.increaseScore(food.getScore());
            snakeSound.play();
        }
    }
}