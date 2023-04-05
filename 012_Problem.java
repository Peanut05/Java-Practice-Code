// Create a extrenal method named AreaOfRectangle to calculate area of rectangle having length 100cm and width 200cm
// ==>>> 

class Problem
{
  public static void AreaOfRectangle()
  {
    int length = 100;
    int width = 200;
    int area = length * width ;
    
    System.out.println("Area of rectangle is :"+area);
    
  }
  public static void main(String[] args)
  {
    System.out.println("Main Start ....");
    AreaOfRectangle();                      // calling AreaOfRectangle Method in main method ...
    System.out.println("Main End ....");
  }
}
