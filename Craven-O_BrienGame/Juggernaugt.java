import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Juggernaugt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juggernaugt extends Actor
{
    long lastAdded = System.currentTimeMillis();
    public Juggernaugt()
    {
        GreenfootImage image = getImage();
        image.scale(100,200);
        setImage(image);
        
    }
    int delay;
    int HP = 100;
    /**
     * Act - do whatever the Juggernaugt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        initialMove();
        addHealthBar();
        spawnFireball();
        
       
        death();
    } 
    public void initialMove()
    {
    if(getX()>550)
    {
    setLocation(getX()-1,getY());    
    }
    if(getY()>200)
    {
    setLocation(getX(),getY()-1);    
    }
    }
  
public void death()
    {
    Actor Projectile = getOneIntersectingObject(Projectile.class);
    MyWorld myWorld = (MyWorld)getWorld(); 
    if(Projectile!=null)
    {
               
        getWorld().removeObject(Projectile);
        HP--;
        
       
        
    }
    }
    
public void addHealthBar()
    {
        if(HP >= 90){
        getWorld().addObject(new Health100(),545,80);    
    }
      if(HP >= 80 && HP < 90){
        getWorld().addObject(new Health90(),545,80);    
    }
     if(HP >= 65 && HP < 80){
        getWorld().addObject(new Health80(),545,80);    
    }
     if(HP >= 50 && HP < 65){
        getWorld().addObject(new Health70(),545,80);    
    }
    if(HP >= 35 && HP < 50){
        getWorld().addObject(new Health60(),545,80);    
    }
    if(HP >= 15 && HP < 35){
        getWorld().addObject(new Health50(),545,80);    
    }
    if(HP == 0){
        getWorld().addObject(new Health0(),545,80);    
    }
        
        
    }
    

    public void spawnFireball()
{
    long curTime  = System.currentTimeMillis();
    if (curTime >= lastAdded + 1500) //5000ms = 5s
    {
       
        getWorld().addObject(new Fireball(),getX(),getY());
        lastAdded  = curTime;
    }
}

    
    
}
