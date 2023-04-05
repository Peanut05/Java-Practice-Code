// Zero Parameterised and Parameterised Method in java : ==>>>

// Input parameter :==>>

/*
   1) Input parameter are nothing but variable declared inside a method signature .
   2) We can use input parameters to pass the runtime data for specific method .
*/

// Zero Parameterized Method :=>>

/*
   1) The method which is declared without input parameters are known as zero parameterized method .
   2) If method are zero parameterized we cannot pass any runtime data for specific method .
   3) Zero parameterized method is also known as non-parameterized method .
*/

// Parameterized Method :==>>
/*
   1) If the method accept input parameter the method will be known as parameterized method .
   2) If the method is parameterized method then we can pass runtime data from spicific method .
   3) It is possible to declare multipal input parameters in such a case we have to provide appropriate
      values to the respective parameters .
*/
 
class ProgramArea
{
   public staic void AreaOfSqure(int side)
   {
      double area = side * side ;
      System.out.println("Area Of Squre Is :"+area);
   }
   public static void main(Strin[] args)
   {
      System.out.println("Main Start ...");
      AreaOfSqure(10);
      AreaOfSqure(5);
      System.out.println("Main End ...");
   }
}

