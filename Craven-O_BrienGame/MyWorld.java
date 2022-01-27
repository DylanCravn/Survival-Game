import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   private int score = 0;
   int rng,tick;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1); 
        prepare();
       
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Background(),300,200); 
        addObject(new Player1(),300,200);
        addObject(new broc(),100,140);
        addObject(new broc(),475,310);
        addObject(new Juggernaugt(),575,380);
        addObject(new Drop(),600,400);
        
        
       
        
        
    }
    
    public void act()
    {
        showText("score "+score,40,20);
        showText("WASD- To Move    SPACE- To Shoot",190,380);
    }
    
    public void increaseScore()
    {
        score = score +1;
    }
    
    
    
    
    
}
