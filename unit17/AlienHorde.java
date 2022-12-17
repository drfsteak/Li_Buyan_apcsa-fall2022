//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		for(int i = 0; i<size; i++) {
			aliens.add(new Alien (i * (600/size),100,60,60,1));
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a: aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien a: aliens) {
			a.move(a.getDirection());
			if(a.getX()>=800) {
				a.changeDirection("LEFT");
				a.setY(a.getY()+50);
			}
			if(a.getX()+a.getWidth()<=0) {
				a.changeDirection("RIGHT");
				a.setY(a.getY()+50);
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i=0; i<aliens.size(); i++) {
			for(Ammo ammo: shots) {
				if((Math.abs(ammo.getX()-aliens.get(i).getX())<=13 && Math.abs(ammo.getY()-aliens.get(i).getY())<=10)) {
					aliens.remove(i);
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
