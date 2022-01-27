import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    int speed;
    int tick;
     public Enemy()
    {
        GreenfootImage image = getImage();
        image.scale(40,40);
        setImage(image);
    }
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    chase();
    death();
    }   
    
    public void chase()
    {
        if(tick > 0)
    {
        tick--;
    }   
    else if(tick == 0)
    {
    speed++;    
    tick = 25;    
    }
    turnTowards(Player1.playerX,Player1.playerY);
    move(speed);
    }
    public void death()
    {
    Actor Projectile = getOneIntersectingObject(Projectile.class);
    MyWorld myWorld = (MyWorld)getWorld(); 
    if(Projectile!=null)
    {
               
        getWorld().removeObject(Projectile);
        getWorld().removeObject(this);
        myWorld.increaseScore();
        
    }
    }
    
    
    }

