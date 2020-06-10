PGraphics canvas; // to enable fading

void setup() {
  size(500,500);
  frameRate(20);
  background(0);
  canvas = createGraphics(width, height);
}
  
void draw() {
  // fetching data
  String[] data = loadStrings("E:/MusicPatterns Git/MusicPatterns/data.csv");
  int i = 0;
  int[] content = int(split(data[i], ','));
  
  // to find the correct colour/shape
  fadeGraphics(canvas, 2);
  canvas.beginDraw();
  for(int n = 20; n > 0; n--) {    // for(initialization; condition; iteration) { OR a for each loop: for(type variable : array)
    println(content[i]);
    int size = Math.abs(content[i]);
    if(content[i] < -182) {
      fill(0, 89, 132);
      canvas.ellipse(size, size, size, size);
    } else if(content[i] < -109) { 
      fill(105, 94, 171);
      canvas.ellipse(size, size, size, size);
    } else if (content[i] < -36) {
      fill(179, 91, 171);
      canvas.ellipse(size, size, size, size);
    } else if(content[i] < 37) {
      fill (239, 91, 148);
      canvas.ellipse(size, size, size, size);
    } else if(content[i] < 110) {
      fill(255, 111, 110);
      canvas.ellipse(size, size, size, size);
    } else if (content[i] < 183) {
      fill(255, 152, 64);
      canvas.ellipse(size, size, size, size);
    } else {
      fill(255, 200, 0);
      canvas.ellipse(size, size, size, size);
    }
  i++;
  }
  canvas.endDraw();
  image(canvas, 0, 0);
}

// enabling a fade effect
void fadeGraphics(PGraphics c, int fadeAmount) {
  c.beginDraw();
  c.loadPixels();
 
  // iterate over pixels
  for (int i =0; i<c.pixels.length; i++) {
 
    // get alpha value
    int alpha = (c.pixels[i] >> 24);
 
    // reduce alpha value
    alpha = max(0, alpha-fadeAmount);
 
    // assign color with new alpha-value
    c.pixels[i] = alpha<<24 | (c.pixels[i]);
  }
  canvas.updatePixels();
  canvas.endDraw();
}
