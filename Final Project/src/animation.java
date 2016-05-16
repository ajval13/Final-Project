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
    	
    		graphics.setColor(new Color(135,206,250));   //The Sky
    		graphics.fillRect(0, 0, 500, 360);
    	
    		graphics.setColor(new Color(250-250-210));   // The Sun
    		graphics.fillOval(0, 0, 40, 40);
    	
    		graphics.setColor(new Color(139,69,19));     //Creating the house
    		graphics.fill3DRect(50, 250, 100, 110, true);
    	
    		graphics.setColor(new Color(255,222,173));
    		graphics.fill3DRect(80, 285, 40, 75, true);
    	
    		graphics.setColor(Color.BLACK);
    		graphics.drawLine(0, 360, 500,360);
    	
    		for (int x = 200; x <=550; x++) //Moving The Person
    			{
    			graphics.setColor(new Color(210,180,140));
    			graphics.fillRect(x, 285, 10, 20);
    		
    			delay(); //The Head
    		
    			graphics.setColor(new Color(135,206,250));
    			graphics.fillRect(x, 285, 10, 20);
    			
    			graphics.setColor(new Color(210,180,140));
    			graphics.fillRect(x, 330, 10, 30);
        	
    			delay(); //One leg
        	
    			graphics.setColor(new Color(135,206,250));
    			graphics.fillRect(x, 330, 10, 30);
    			
    			graphics.setColor(new Color(210,180,140));
    			graphics.fillRect(x, 330, 30, 10);
        	
    			delay(); //Opposite leg
        	
    			graphics.setColor(new Color(135,206,250));
    			graphics.fillRect(x, 330, 30, 10);

    			graphics.setColor(Color.blue);
    			graphics.fillRect(x, 300, 10, 30);
    		
    			delay();   //The Body
    		
    			graphics.setColor(new Color(135,206,250));
    			graphics.fillRect(x, 300, 10, 30);
    		
    			
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