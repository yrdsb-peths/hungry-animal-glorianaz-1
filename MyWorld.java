import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World our hero lives in. 
 * 
 * @author Gloriana Zheng
 * @version September 2024
 */
public class MyWorld extends World
{
    private int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        // Create the Snake Object
        Snake snake = new Snake();
        addObject(snake, 300, 300);  
        
        //Create a Label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        spawnFood();
    }
    
    
    public void spawnFood()
    {
        if(Greenfoot.getRandomNumber(2) == 0)
        {
            createCupcake();
        }else
        {
            createPizza();
        }
    }
    /*
     * End the game and draw 'Game Over'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /*
     * Increase score
     */
    public void increaseScore(int points)
    {
        score += points;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0){
            level += 1;
        }
    }
    
    /* 
     * Create a new cupcake at a random location at top of the screen
     */
    public void createCupcake()
    {
        Cupcake cupcake = new Cupcake();
        cupcake.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(cupcake, x, y);
    }
    
    public void createPizza()
    {
        Pizza pizza = new Pizza();
        pizza.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(pizza, x, y);
    }
}
