import java.awt.*;

import javax.swing.*;
 
public class animation extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;

    	public static void main(String[] args) 
    		{
	        animation canvas = new animation();
	        JFrame frame = new JFrame();
	        frame.setSize(500, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
    	
    	public void paint(Graphics graphics)
    	{
    	graphics.setColor(new Color(139,69,19));
    	graphics.fill3DRect(50, 250, 100, 100, true);
    	
    	graphics.setColor(new Color(255,222,173));
    	graphics.fill3DRect(80, 285, 40, 65, true);
    	
    	for (int i = 0; i < 350; i++)
    		{
    		for (int i1 = 0; i1 < 10; i1++)
    			{
    			graphics.setColor(new Color(210,180,140));
    			graphics.fillRect(200, 330, 10, 30);
        	
    			delay();
        	
    			graphics.setColor(Color.white);
    			graphics.fillRect(200, 330, 10, 30);
    			}
    		for (int i1 = 0; i1 < 10; i1++)
    			{
    			graphics.setColor(new Color(210,180,140));
    			graphics.fillRect(200, 320, 30, 10);
        	
    			delay();
        	
    			graphics.setColor(Color.white);
    			graphics.fillRect(200, 320, 30, 10);
    			}
    		for (int i1 = 0; i1 < 10; i1++)
    			{
    			graphics.setColor(new Color(210,180,140));
    			graphics.fillRect(320, 410, 30, 10);
        	
    			delay();
        	
    			graphics.setColor(Color.white);
    			graphics.fillRect(320, 410, 30, 10);
    			}
    		}
    	}
    	
    	public void delay()
			{
	        try
					{
					Thread.sleep(10);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
    	
	}