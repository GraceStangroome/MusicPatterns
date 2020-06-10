// Fetching the data
void setup() {
  size(255,255);
  frameRate(2);
  background(0);
}
  
void draw() {
  String[] data = loadStrings("/media/grace/Grace/Portfolio/Music Patterns/data.txt");
  int i = 0;
  for(int n = 20; n > 0; n--) {    // for(initialization; condition; iteration) { OR a for each loop: for(type variable : array)
    int content = Integer.parseInt(data[i]);
    println(content);
    int size = Math.abs(content);
    System.out.println(content);
    println("I am reaching this line of code 1");
    if(content < -182) {
      fill(0, 89, 132);
      ellipse(size, size, size, size);
      println("I am reaching this line of code 2");
    } else if(content < -109) { 
      fill(105, 94, 171);
      ellipse(size, size, size, size);
      println("I am reaching this line of code 3");
    } else if (content < -36) {
      fill(179, 91, 171);
      ellipse(size, size, size, size);
      println("I am reaching this line of code 4");
    } else if(content < 37) {
      fill (239, 91, 148);
      ellipse(size, size, size, size);
      println("I am reaching this line of code 5");
    } else if(content < 110) {
      fill(255, 111, 110);
      ellipse(size, size, size, size);
      println("I am reaching this line of code 6");
    } else if (content < 183) {
      fill(255, 152, 64);
      ellipse(size, size, size, size);
      println("I am reaching this line of code 7");
    } else {
      fill(255, 200, 0);
      ellipse(size, size, size, size);
      println("I am reaching this line of code 8");
    }
  i++;  
  }
}
