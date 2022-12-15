//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		super(x,y,10, 10);
		speed = 2;
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x,y,10,10);
		setSpeed(s);
		
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return 0;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.setColor(Color.RED);
		window.drawRect(getX(), getY(), 10, 10);
	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
		if(direction.equals("UP")) {
			this.setY(this.getY()-speed);
		}
	}

	public String toString()
	{
		return "";
	}
}
