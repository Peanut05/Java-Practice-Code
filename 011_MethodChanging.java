/*
Method Chaining :==>>>
  1] The process of calling one externel method inside another externel method and that externel method get called from main method
     is called method chaining .
  2] In method chaining we can call multipal external methods inside one external method and that externel method called inside main
     main method .
  */

class MethodChaining
{
  public static void text()
  {
    System.out.println("Text Start ...");
    System.out.println("Text End ...");
  }
  public static void show()
  {
    System.out.println("Show Start ...");
    text();
    System.out.println("Show End ...");
  }
  public static void main(String[] args)
  {
    System.out.println("Main Start ...");
    show();
    System.out.println("Main End ...");
  }
}
