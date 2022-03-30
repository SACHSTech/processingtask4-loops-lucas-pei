import processing.core.PApplet;

    /**
   * This program splits a drawing into four quandrants, each quadrant having its own unique drawing
   * @author: L. Pei
   */

public class Sketch extends PApplet {
	

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  // Quadrant 1
    stroke(0, 0, 0);
    for (int x = 0; x < 200; x += 20){
      line(x, 0, x, 200);
    }
    for (int lineX = 0; lineX < height/2; lineX += 20){
        line(0, lineX, 200, lineX);
    }

    // Quadrant 2
    for (int circleY = 20; circleY < 200; circleY += 40){
      for (int circleX = 220; circleX < 400; circleX += 40){
        fill(189, 55, 99);
          ellipse(circleX, circleY, 25, 25);
      }
    }
    // Quadrant 3
    for(int lineY = 0; lineY <= 200; lineY++){
      stroke(lineY);
      line(lineY, 200, lineY, 400);
    }

    // Quadrant 4
    // flower petals
    stroke(0);
    translate(300, 300);
    
    for (int petal = 0; petal <= 8; petal++) {
      rotate(radians(45));
      fill(255, 95, 31);
      ellipse(0, 0, 20, height/3);  
    }

    // center of flower
    fill(0, 100, 0);
    ellipse(0, 0, 50, 50);
  }
}