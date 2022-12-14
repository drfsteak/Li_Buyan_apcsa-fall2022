//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   //add code here
		super(x,y);
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
		super(x,y);
		setSpeed(s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("images/ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Mauro");
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
		
		speed = s;
	}

	public int getSpeed()
	{
	   return 0;
	}

	public void move(String direction)
	{
		//add code here
		if(direction.equals("LEFT")) {
			this.setX(this.getX()-speed);
		}
		if(direction.equals("RIGHT")) {
			this.setX(this.getX()+speed);
		}
		if(direction.equals("UP")) {
			this.setY(this.getY()+speed);
		}
		if(direction.equals("DOWN")) {
			this.setY(this.getY()-speed);
		}
		
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
