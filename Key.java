import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound; 
    private String upImage;
    private String downImage;
    
    /**
     * Create a new key linked to a given keyboard key, and
     * with a given sound.
     */
    public Key(String keyName, String soundFile, String img1, String img2)
    {
        key = keyName;
        sound = soundFile;
        upImage = img1;
        downImage = img2;
        setImage(upImage);
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if(!isDown && Greenfoot.isKeyDown(key))
        {
           setImage(downImage);
           Greenfoot.playSound(sound);
           isDown = true;
        }
        if( isDown && !Greenfoot.isKeyDown(key))
        {
           setImage(upImage); 
           isDown = false; 
        }
    }
    
    /*
     * Play The Note of this Key  
     */
    public void play()
    {
        Greenfoot.playSound(sound); 
    }
}
    