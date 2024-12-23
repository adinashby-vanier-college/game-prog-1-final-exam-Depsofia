// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class GameOverWorld.
     */
    public GameOverWorld()
    {
        super(600, 400, 1);
        gameMusic =  new  GreenfootSound("lose.wav");
        showText("Game Over", 260, 260);
    }

    /**
     * 
     */
    public void ShowTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(message, x, y);
    }

    /**
     * 
     */
    public void started()
    {
        gameMusic.play();
    }

    /**
     * 
     */
    public void stopped()
    {
        gameMusic.stop();
    }
}
