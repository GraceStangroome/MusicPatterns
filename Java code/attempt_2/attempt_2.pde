// Fetching the data
void setup() {
  size(700,700);
  frameRate(2);
  background(0);
}
  
void draw() {
  //String[] data = loadStrings("E:/Portfolio/Music Patterns/data.txt");
  //for(int i = 0; i<data.length; i++) {
    //println(data[i]);
    int i = -200;
    for(int x = 0; x<200; x++) {
      if(i < -182) {
        fill(0, 89, 132);
        ellipse(Math.abs(i), Math.abs(i), Math.abs(i), Math.abs(i));
        i = i + 5;
      } else if(i < -109) { 
        fill(105, 94, 171);
        ellipse(-195, Math.abs(i), Math.abs(i), Math.abs(i));
        i = i + 5;
      } else if (i < -36) {
        fill(179, 91, 171);
        ellipse(Math.abs(i), Math.abs(i), Math.abs(i), Math.abs(i));
        i = i + 5;
      } else if(i < 37) {
        fill (239, 91, 148);
        ellipse(Math.abs(i), Math.abs(i), Math.abs(i), Math.abs(i));
        i = i + 5;
      } else if(i < 110) {
        fill(255, 111, 110);
        ellipse(Math.abs(i), Math.abs(i), Math.abs(i), Math.abs(i));
        i = i + 5;
      } else if (i < 183) {
        fill(255, 152, 64);
        ellipse(Math.abs(i), Math.abs(i), Math.abs(i), Math.abs(i));
        i = i + 5;
      } else {
        fill(255, 200, 0);
        ellipse(Math.abs(i), Math.abs(i), Math.abs(i), Math.abs(i));
        i = i + 5;
    }
  }
}
