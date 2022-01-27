import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class broc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class broc extends Actor
{
    int sDelay;
    int side;
    int enemyType;
    int time;
    int wap;
    int tick,speed;
    /**
     * Act - do whatever the broc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        eSpawn();
    }    
    public broc()
    {
          GreenfootImage image = getImage();
       image.scale(150,100);
       setImage(image);
   }
    public void eSpawn()
    {
     if(sDelay > 0)
    {
        sDelay--;
        side = Greenfoot.getRandomNumber(4);
        enemyType = Greenfoot.getRandomNumber(3);
    }
    else if(sDelay == 0)
    {
        if(side == 0 && enemyType == 1)        {
        getWorld().addObject(new Enemy(),Greenfoot.getRandomNumber(570) , Greenfoot.getRandomNumber(10));}
        if(side == 0 && enemyType == 2)        {
        getWorld().addObject(new Enemy2(),Greenfoot.getRandomNumber(570) , Greenfoot.getRandomNumber(10));}
        if(side == 1 && enemyType == 1){
        getWorld().addObject(new Enemy(),Greenfoot.getRandomNumber(10) , Greenfoot.getRandomNumber(400));}
        if(side == 1 && enemyType == 2){
        getWorld().addObject(new Enemy2(),Greenfoot.getRandomNumber(10) , Greenfoot.getRandomNumber(400));}
        if(side == 2 && enemyType == 1){
        getWorld().addObject(new Enemy(),Greenfoot.getRandomNumber(5)+590 , Greenfoot.getRandomNumber(400));}
        if(side == 2 && enemyType == 2){
        getWorld().addObject(new Enemy2(),Greenfoot.getRandomNumber(5)+590 , Greenfoot.getRandomNumber(400));}
        if(side == 3 && enemyType == 1){
        getWorld().addObject(new Enemy(),Greenfoot.getRandomNumber(590) , Greenfoot.getRandomNumber(2)+390);}
        if(side == 3 && enemyType == 2){
        getWorld().addObject(new Enemy2(),Greenfoot.getRandomNumber(590) , Greenfoot.getRandomNumber(2)+390);}
       if(speed<50){
        speed++;}
        sDelay = 85-speed;
        
    }   
    
        
    }
    
}