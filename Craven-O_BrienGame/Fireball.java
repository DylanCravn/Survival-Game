import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{
    int x = Greenfoot.getRandomNumber(2);
    int y = Greenfoot.getRandomNumber(400);
      public Fireball()
    {
        GreenfootImage image = getImage();
        image.scale(60,30);
        setImage(image);
    }
    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     movement();  
    }   
    
    public void movement()
    {
     turnTowards(x,y);
     move(4);
     
     if(isAtEdge())
     {
      getWorld().removeObject(this);   
     }
    }
    
    
}
