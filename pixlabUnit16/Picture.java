import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  public void keepOnlyBlue() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[]row: pixels) {
		  for(Pixel p: row) {
			  p.setRed(0);
			  p.setGreen(0);
		  }
	  }
  }
  public void keepOnlyRed() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[]row: pixels) {
		  for(Pixel p: row) {
			  p.setBlue(0);
			  p.setGreen(0);
		  }
	  }
  }
  
  public void keepOnlyGreen() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[]row: pixels) {
		  for(Pixel p: row) {
			  p.setRed(0);
			  p.setBlue(0);
		  }
	  }
  }
  public void negate() {
	  Pixel[][]pixels = this.getPixels2D();
	  for(Pixel[]row: pixels) {
		  for(Pixel p: row) {
			  p.setRed(p.getRed()-255);
			  p.setGreen(p.getGreen()-255);
			  p.setBlue(p.getBlue()-255);
		  }
	  }
  }
  
  public void grayscale() {
	  
	  Pixel[][]pixels = this.getPixels2D();
	  for(Pixel[]row: pixels) {
		  for(Pixel p: row) {
			  int average = (p.getRed()+p.getGreen()+p.getBlue())/3;
			  p.setRed(average);
			  p.setGreen(average);
			  p.setBlue(average);
		  }
	  }
  }
  
public void fixUnderwater() {
	  
	  Pixel[][]pixels = this.getPixels2D();
	  for(Pixel[]row: pixels) {
		  for(Pixel p: row) {
			  p.setRed(p.getRed()*5);
			  
		  }
	  }
  }
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft() {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; col < width / 2; col++)
	      {
	        rightPixel = pixels[row][col];
	        leftPixel = pixels[row][width - 1 - col];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    } 
  }
  
  public void mirrorHorizontal() {
	  Pixel[][]pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel botPixel = null;
	  int width = pixels[0].length;
	  int height = pixels.length;
	    for (int row = 0; row < pixels.length/2; row++)
	    {
	      for (int col = 0; col < width; col++)
	      {
	        topPixel = pixels[row][col];
	        botPixel = pixels[height - 1 - row][col];
	        botPixel.setColor(topPixel.getColor());
	      }
	    } 
  }
  public void mirrorHorizontalBotToTop() {
	  Pixel[][]pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel botPixel = null;
	  int width = pixels[0].length;
	  int height = pixels.length;
	    for (int row = 0; row < pixels.length/2; row++)
	    {
	      for (int col = 0; col < width; col++)
	      {
	        botPixel = pixels[row][col];
	        topPixel = pixels[height - 1 - row][col];
	        botPixel.setColor(topPixel.getColor());
	      }
	    } 
  }
  
  public void mirrorDiagonal() {
	  Pixel[][]pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel botPixel = null;
	 for(int r = 0; r< pixels.length && r<pixels[0].length; r++) {
		 for(int c = r+1; c<pixels[0].length && c<pixels.length; c++) {
			 topPixel = pixels[r][c];
			 botPixel = pixels[c][r];
			 botPixel.setColor(topPixel.getColor());
					 
		 }
	 }
  }
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
      
    }
    System.out.println(count);
  }
  public void mirrorArms() {
	  int mirrorPoint = 191;
	    Pixel topPixel = null;
	    Pixel botPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 160; row < mirrorPoint; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 105; col < 170; col++)
	      {
	        
	        topPixel = pixels[row][col];   
	        botPixel = pixels[mirrorPoint - row + mirrorPoint][col];
	       // botPixel = pixels[row][mirrorPoint - col + mirrorPoint];
	        botPixel.setColor(topPixel.getColor());
	        
	      }
	      
	    }
	    int mirrorPoint2 = 197;
	    for (int row = 174; row < mirrorPoint2; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 235; col < 292; col++)
	      {
	        
	        topPixel = pixels[row][col];   
	        botPixel = pixels[mirrorPoint2 - row + mirrorPoint2][col];
	       // botPixel = pixels[row][mirrorPoint - col + mirrorPoint];
	        botPixel.setColor(topPixel.getColor());
	        
	      }
	      
	    }
  }
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void mirrorGull() {
	  int mirrorPoint = 345;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 236; row < 319; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 239; col < mirrorPoint; col++)
	      {
	        
	        leftPixel = pixels[row][col];  
	        if(leftPixel.getBlue()<130) {
	        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	        }
	      }
	      
	    }
	   
  }
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < toPixels.length; 
			  fromRow++, toRow++)
	  {
		  for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < toPixels[0].length;  
				  fromCol++, toCol++)
		  {
			  fromPixel = fromPixels[fromRow][fromCol];
			  toPixel = toPixels[toRow][toCol];
			  toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  public void copy(Picture fromPic, int copyStartR, int copyEndR, int copyStartC, int copyEndC, int startRow, int startCol)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  Pixel[][] copyFromPixels = new Pixel[copyEndR-copyStartR][copyEndC-copyStartC];
	  for (int row = copyStartR; row < copyEndR; row++)
	  {
		  for (int col = copyStartC; col < copyEndC; col++)
		  {
			  copyFromPixels[row-copyStartR][col-copyStartC] = fromPixels[row][col];
		  }
	  }
	  for (int fromRow = 0, toRow = startRow; fromRow < copyFromPixels.length && toRow < toPixels.length; fromRow++, toRow++)
	  {
		  for (int fromCol = 0, toCol = startCol; fromCol < copyFromPixels[0].length && toCol < toPixels[0].length; fromCol++, toCol++)
		  {
			  fromPixel = copyFromPixels[fromRow][fromCol];
			  toPixel = toPixels[toRow][toCol];
			  toPixel.setColor(fromPixel.getColor());
		  }
	  }   
  }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  public void edgeDetection2(int edgeDist) {
	  Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    Color rightColor = null;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; 
	           col < pixels[0].length-1; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][col+1];
	        rightColor = rightPixel.getColor();
	        if (leftPixel.colorDistance(rightColor) > 
	            edgeDist)
	          leftPixel.setColor(Color.BLACK);
	        else
	          leftPixel.setColor(Color.WHITE);
	      }
	    }
	    Pixel topPixel = null;
	    Pixel bottomPixel = null;
	    Color bottomColor = null;
	    for(int col = 0; col<pixels[0].length; col++) {
	    	for(int row = 0; row<pixels.length-1; row++) {
	    		topPixel = pixels[row][col];
	    		bottomPixel = pixels[row+1][col];
	    		bottomColor = bottomPixel.getColor();
	    		 if (topPixel.colorDistance(bottomColor) > 
		            edgeDist)
		          topPixel.setColor(Color.BLACK);
		        
	    	}
	    }
  }
  
  
  public Picture decode() {
	  
	  Pixel[][] pixels = this.getPixels2D();
	 
	  Picture messagePicture = new Picture(this.getHeight(),this.getWidth());
	  Pixel[][]messagePixel = messagePicture.getPixels2D();
	  Pixel currPixel = null;
	  for (int r = 0; r <this.getHeight(); r++) {
		  for(int c = 0; c<this.getWidth(); c++) {
			  Color col = pixels[r][c].getColor();
			  Color newCol = new Color((col.getRed()%2)*128, (col.getBlue()%2)*128, col.getGreen()%2 * 128);
			  messagePixel[r][c].setColor(newCol);
			 
		  }
	  }
	  return messagePicture;
  }
  
  
  public void encode(Picture messagePict)
  {
	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  // if the current pixel red is odd make it even
			  currPixel = currPixels[row][col];
			
			  messagePixel = messagePixels[row][col];
			  currPixel.setGreen((currPixel.getGreen()/2)*2);
			  currPixel.setRed((currPixel.getRed()/2)*2);
			  currPixel.setBlue((currPixel.getBlue()/2)*2);
			  Color c = new Color(currPixel.getRed()+ messagePixel.getRed()/128, currPixel.getGreen()+ messagePixel.getGreen()/128, currPixel.getBlue()+ messagePixel.getBlue()/128);
			  currPixel.setColor(c);
		  }
			  
	  }
	  
	  
  }
  /**
   * Method to decode a message hidden in the
   * red value of the current picture
   * @return the picture with the hidden message
   */

  public void removeNonBlack() {
	
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  // if the current pixel red is odd make it even
			  currPixel = currPixels[row][col];
			
			  if(currPixel.getRed()==128 && currPixel.getBlue()==128 && currPixel.getGreen()==128) {
				  currPixel.setBlue(255);
				  currPixel.setRed(255);
				  currPixel.setGreen(255);
			  }
		  }
	  }
  }
	  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
   	beach.encode(new Picture("apple.jpg"));
   	beach.explore();
   	beach.decode().explore();
   
 
   	
   	
   
  }
  
} // this } is the end of class Picture, put all new methods before this
