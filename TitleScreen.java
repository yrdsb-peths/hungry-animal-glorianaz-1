import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Gloriana Zheng
 * @version September 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Snake", 60);
    Label instructions = new Label("Use \u2190 & \u2192 to move", 40);
    Label instructions1 = new Label("Press <space> to start", 40);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        addObject(titleLabel, getWidth()/2, 100);
        addObject(instructions, getWidth()/2, 220);
        addObject(instructions1, getWidth()/2, 300);
        prepare();
    }

    /*
     * The main world act loop
     */
    public void act()
    {
        // start the game if the user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Snake snake = new Snake();
        addObject(snake,68,199);
        snake.setLocation(140,140);
    }
}