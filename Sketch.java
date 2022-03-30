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
    for (int lineY = 0; lineY < height/2; lineY += height/2/10){
        line(0, lineY, width/2, lineY);
    }

    // Quadrant 2
    for (int circleX = 225; circleX < (375); circleX += width/10.6){
      for (int circleY = 25; circleY < (175); circleY += width/10.6){
        fill(189, 55, 99);
          ellipse(circleX, circleY, 25, 25);
      }
    }
    // Quadrant 3
    for(int line = 0; line <= 200; line++){
      stroke(line);
      line(line, 200, line, 400);
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