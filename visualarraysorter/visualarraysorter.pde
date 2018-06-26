
//1. create an array of ints. don't initialize it yet.

int[] a;

void setup() {
  //2. set the size of your window
  
  size(1000,1000);
  //  if you are using Processing 3, you cannot use variables
  
  //  because the developers don't know how programming is supposed to work.

  //3. initialize your array with the built in width variable
  
  
  a = new int[width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  for (int x = 0; x < height; x++) {
  
         int ran = (int)random(height);
         
       
      
      a[x]  = ran;  
  }
  
  //5. call the noStroke() method
  
  noStroke();

}

void draw() {
  //6. set the background color with background(r, g, b);
background(0,0,255);
  //7. set the color for your graph
  fill(255,0,0);
  //8. draw a rectangle for each int in your array.
  
  for( int h = 0; h < height;h++) {
    
    rect( a[h], height, 1, a[h]*-1);
    
    
    
  }
  
  //   the x value will be the element of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array


  //9. call the stepSort method

stepSort(a);
  //10. extract the code that randomizes the array into a method.
   
  //11. call the method you made in step 10 when the mouse is pressed
  

}

  void mousePressed() {
    
    randomize();


    
  }
  
  void randomize() {
  
      for (int x = 0; x < height; x++) {
  
         int ran = (int)random(height);
         
       
      
      a[x]  = ran;  
      
  
  }
  }


void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
