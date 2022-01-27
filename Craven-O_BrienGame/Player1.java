import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    
    public Player1()
    {
          GreenfootImage image = getImage();
       image.scale(50,50);
       setImage(image);
    }
    int delay;
    int mouseX, mouseY;
    public static int playerX, playerY; 
    int playerRot;
    int powerUpCode;
   
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Movement();
        mouseTrack();
        SpawnBullet();
        death();
        death2();
        death3();
        
        playerX = getX();
        playerY = getY();
        playerRot = getRotation();
        hitDetection();
        
        
        
    }

    public void Movement()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-2);
           
        } 
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-2,getY());
           
        } 
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+2);
            
        }    
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+2,getY());
          
        } 
          
    }
    
    public void mouseTrack()
    {
     if(Greenfoot.getMouseInfo() != null)
     {
     mouseX = Greenfoot.getMouseInfo().getX();  
     mouseY = Greenfoot.getMouseInfo().getY();
     
     turnTowards(mouseX, mouseY);
     }
    }
    
    
    public void SpawnBullet()
    {
        if(powerUpCode == 0){
    if(delay > 0)
    {
        delay--;
    }
    else if(delay == 0 && Greenfoot.isKeyDown("space"))
    {
        getWorld().addObject(new Projectile(playerRot), getX()+10, getY()-5);
        delay = 10;
        Greenfoot.playSound("Gun+Silencer.wav");
    }}
       if(powerUpCode == 1){
    if(delay > 0)
    {
        delay--;
    }
    else if(delay == 0 && Greenfoot.isKeyDown("space"))
    {
        getWorld().addObject(new Projectile(playerRot), getX()+5, getY()-5);
        getWorld().addObject(new Projectile(playerRot), getX()+25, getY()+15);
        delay = 5;
        Greenfoot.playSound("Gun+Silencer.wav");
    }}
    
   
    }
    
    public void death()
    {
    Actor badGuy = getOneIntersectingObject(Enemy.class);
    
    if(badGuy!=null)
    {
        Greenfoot.playSound("attack.wav");
        getWorld().addObject(new GameOver(),300,200);
        getWorld().removeObject(badGuy);
        Greenfoot.stop();
        
        
        
    }
    
    }
    
    public void death2()
    {
    Actor badGuy2 = getOneIntersectingObject(Enemy2.class);
    
    if(badGuy2!=null)
    {
        Greenfoot.playSound("attack.wav");
        getWorld().addObject(new GameOver(),300,200);
        getWorld().removeObject(badGuy2);
        Greenfoot.stop();
        
        
        
    }
    
    }
    
     public void death3()
     
    {
    Actor badGuy3 = getOneIntersectingObject(Fireball.class);
    
    if(badGuy3!=null)
    {
        Greenfoot.playSound("attack.wav");
        getWorld().addObject(new GameOver(),300,200);
        getWorld().removeObject(badGuy3);
        Greenfoot.stop();
       
        
        
    }
    
    }
    
     public void hitDetection()
    {
      Actor drop = getOneIntersectingObject(Drop.class);
    MyWorld myWorld = (MyWorld)getWorld(); 
    if(drop!=null)
    {
               
        Greenfoot.playSound("wv-sword.wav");
        getWorld().removeObject(drop);
        powerUpCode = 1;
        
    }   
    }
    
    public void givePower()
    {
        if (powerUpCode == 1);
        {
           
        }
    }
}
