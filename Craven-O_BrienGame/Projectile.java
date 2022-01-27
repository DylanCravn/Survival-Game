import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
  public Projectile()
    {
        GreenfootImage image = getImage();
        image.scale(5,5);
        setImage(image);
    }  
       
     
     int direction;
     public int speed = 15;
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Motion();  
        move(speed);
    }
    
    public Projectile (int rotation)
    {
        setRotation(rotation);
    }
    
    public void Motion()
    {
        if(isAtEdge())
        {
        getWorld().removeObject(this);    
        }
      
    }
}
