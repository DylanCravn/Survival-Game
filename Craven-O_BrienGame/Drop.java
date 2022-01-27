import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Drop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drop extends Actor
{
    int sDelay;
    int powerUpCode;
    
      public Drop()
    {
        GreenfootImage image = getImage();
        image.scale(30,50);
        setImage(image);
    }
    /**
     * Act - do whatever the Drop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        drop();
        
    }    
    
    public void drop(){
        int r = Greenfoot.getRandomNumber(10);
        if(sDelay > 0){
            sDelay--;
        }
        else if(sDelay == 0 ){
            if(r == 1){
                int x = Greenfoot.getRandomNumber(250)+150;
                int y = Greenfoot.getRandomNumber(200)+100;
                Drop d = new Drop();
                getWorld().addObject(d,x,y);
            }
            sDelay = Greenfoot.getRandomNumber(50) + 50;
           
        }
    }
    
   
    
    
    }
