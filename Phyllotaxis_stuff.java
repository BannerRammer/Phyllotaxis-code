import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Phyllotaxis_stuff extends PApplet {

// Lorenzo Tablante

float n = 0;
float c = 3;

ArrayList<PVector> points = new ArrayList<PVector>();

float start = 0;

public void setup() {

colorMode(HSB, 360, 255, 255);
}

public void draw() {
background(0);
translate(width / 2, height / 2);
rotate(n * 0.3f);
for  (int i = 0; i < n; i++) {
  float a = i * radians(137.5f);
  float r =c * sqrt(i);
  float x = r * cos(a);
  float y = r * sin(a);
  float hu = i+start;//sin(start + i * 0.5);
  hu = i/3.0f % 360;
  fill(hu, 255, 255);
  noStroke();
  ellipse(x, y, 4, 4);
  }
  n += 5;
  start += 5;
}
  public void settings() { 
size(400, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Phyllotaxis_stuff" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
