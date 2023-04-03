/*
// What is method ??
   >>> 1] Method is a set of executable java statements . 
       2] Java methods are defined into two types 1) Internel Method
                                                  2) Externel Method 
       3] Methods are used to perform specific oprations on program data .
       4] Methods are used to code reusebility (Write once execute multipal times...) 


1] Internal Methods :=>> 1] internal methods is predifined methods in java.
                         2] java has provided servel internal methods to perform opratons on prgram data .
                         3] Develouper cannnot modify the signature of internal methods .
                         4] Execution of internal methods is the responsibility of JVM .
                            eg.-- 1) Public static void main()
                                  2) toString()


2] External Methods :=>> 1] External methods are also known as user defined methods.
                         2] Develouper can create any number of external methods .
                         3] Develouper can modify signature of external methods .
                         4] For execution of external methods develouper should call externel methods inside main method to execute it .
                         5] Extection of external method is responsibility ofprogrammer . 
*/

class Mthods
{
  Public static void display()
  {
    System.out.println("display method executed");
  }
  
  Public static void main(String[] args)
  {
    System.out.println("Main Starts...");
    display();  //calling display method ...
    System.out.println("Main End...");
  }
}
