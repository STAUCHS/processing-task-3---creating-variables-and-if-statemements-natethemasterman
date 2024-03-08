import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {

  String CurrentTime;
  float MiddleFlowerX = random(0, 400);
  float MiddleFlowerY = random(0, 400);
  float MiddleFlowerSize = random(40, 120);
  float MiddleFlowerDistance = MiddleFlowerSize / 2;
  
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  } public void setup() {
    background(210, 255, 173);
  } public void draw() {
    double FlowerY = random(0, 400);
    double FlowerX = random(0, 400);

    boolean isGreaterX = FlowerX > 200;

    boolean isGreaterY = FlowerY > 200;

    boolean isGreaterXY = FlowerX && FlowerY;

    if (isGreaterXY) {
      background(100, 100, 50);
    }
    // Called repeatedly, anything drawn on the screen goes here
    // Stem
    fill(124, 252, 0);
    rect(MiddleFlowerX - (MiddleFlowerDistance / 5), MiddleFlowerY + (MiddleFlowerDistance + ((MiddleFlowerDistance / 2) - (MiddleFlowerDistance/3))), MiddleFlowerSize / 5, MiddleFlowerSize * 7);

    // Petals
    fill(255, 255, 255);
    ellipse(MiddleFlowerX - MiddleFlowerDistance, MiddleFlowerY - MiddleFlowerDistance, MiddleFlowerSize, MiddleFlowerSize);
    ellipse(MiddleFlowerX - MiddleFlowerDistance, MiddleFlowerY + MiddleFlowerDistance, MiddleFlowerSize, MiddleFlowerSize);
    ellipse(MiddleFlowerX + MiddleFlowerDistance, MiddleFlowerY - MiddleFlowerDistance, MiddleFlowerSize, MiddleFlowerSize);
    ellipse(MiddleFlowerX + MiddleFlowerDistance, MiddleFlowerY + MiddleFlowerDistance, MiddleFlowerSize, MiddleFlowerSize);

    // Middle Flower
    fill(255, 255, 0);
    ellipse(MiddleFlowerX, MiddleFlowerY, MiddleFlowerSize, MiddleFlowerSize);

    // Sun
    fill(255, 210, 12);
    ellipse(MiddleFlowerX - (MiddleFlowerDistance * 3), MiddleFlowerY - (MiddleFlowerDistance * 3), MiddleFlowerSize / 2, MiddleFlowerSize / 2);

    // Show current time
    fill(0);
    textSize(25);
    CurrentTime = hour() + ":" + minute() + ":" + second();
    text(CurrentTime, 150, 50);
  }}