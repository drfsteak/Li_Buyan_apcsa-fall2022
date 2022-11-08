//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y) {
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h) {
		super(x,y,w,h);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color col) {
		super(x,y, w, h, col);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h, Color col, int x1, int y1) {
		super(x,y,w,h,col);
		setXSpeed(x1);
		setYSpeed(y1);
	}
	
	   
   //add the set methods
   public void setXSpeed(int x1) {
	   xSpeed =x1;
   }
   public void setYSpeed(int y1) {
	   ySpeed = y1;
   }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   
	   draw(window, Color.white);
	   
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
		//setY
      window.setColor(getcol());
      window.fillRect(getX(), getY(), getWidth(), getHeight());

		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{

		Ball b = (Ball)(obj);
		
		return b.toString().equals(toString());
	}   

   //add the get methods
public int getXSpeed() {
	return xSpeed;
}
public int getYSpeed() {
	return ySpeed;
}
   //add a toString() method
	public String toString() {
		return super.toString() + " " + xSpeed + " " + ySpeed;
	}
}