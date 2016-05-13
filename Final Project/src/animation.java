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
    	
    	graphics.setColor(Color.BLACK);
    	graphics.drawLine(0, 350, 500,350 );
    	
    	for (int x = 200; x <= 400; x++)
    		{
    		graphics.setColor(new Color(210,180,140));
    		graphics.fillRect(x, 330, 10, 30);
        	
    		delay();
        	
    		graphics.setColor(Color.white);
    		graphics.fillRect(x, 330, 10, 30);
    			
    		graphics.setColor(new Color(210,180,140));
    		graphics.fillRect(x, 330, 30, 10);
        	
    		delay();
        	
    		graphics.setColor(Color.white);
    		graphics.fillRect(x, 330, 30, 10);
    		if(x==500)
		    	{
		    	x = 30;	
		    	x = -x;	
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