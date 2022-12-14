//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		color = Color.black;
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;

	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y) {
		setX(x);
		setY(y);
		color = Color.black;
	}
	public Block(int x, int y, int w) {
		setX(x);
		setY(y);
		setWidth(w);
		color = Color.black;
	}
	public Block(int x, int y, int w, int h) {
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		color = Color.black;
	}
	
	public Block(int x, int y, int w, int h, Color col) {
		setColor(col);
		setPos(x,y);
		setWidth(w);
		setHeight(h);
	}
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col;
   }
   public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		setX(x);
		setY(y);
	} 
   public void setX(int x) {
	   xPos = x;
   }
   public void setY(int y) {
	   yPos = y;
   }
   public void setWidth( int w) {
	   width = w;
   }
   public void setHeight(int h) {
	   height = h;
   }
  
   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		Block ball = (Block)(obj);
		


		return ball.getX() == xPos && ball.getY() == yPos && ball.getWidth() == width && ball.getHeight() == height && ball.getcol()==color;
	}   

   //add the other get methods
    public int getX() {
    	return xPos;
    }
    public int getY() {
    	return yPos;
    }
    public int getWidth() {
    	return width;
    }
    public int getHeight() {
    	return height;
    }
    public Color getcol() {
    	return color;
    }
       //add a toString() method  - x , y , width, height, color
    public String toString() {
    	return "" + xPos + " " + yPos + " " + width + " " + height + " " + "\n"+color ;
    }


}