import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Health100 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health100 extends Actor
{
    int delay;
     public Health100()
    {
        GreenfootImage image = getImage();
        image.scale(120,90);
        setImage(image);
    }
    /**
     * Act - do whatever the Health100 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     lifeSpan();   
    }  
    
    public void lifeSpan()
    {
     if(delay > 0)
    {
        delay--;
    }
    else if(delay == 0)
    {
       
        getWorld().removeObject(this);
        delay = 5;
        
    }   
    }
}
