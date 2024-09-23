import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author Gloriana Zheng
 * @version Sep. 2024
 */
public abstract class Food extends Actor
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public abstract int getScoreValue();

    
    public void moveDownwards(int s