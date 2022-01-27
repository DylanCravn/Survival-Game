import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Health0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health0 extends Actor
{
     public Health0()
    {
        GreenfootImage image = getImage();
        image.scale(130,90);
        setImage(image);
    }
    /**
     * Act - do whatever the Health0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        getWorld().addObject(new Win(),300,200);
       
        
    
        Greenfoot.stop();
    }    
}
