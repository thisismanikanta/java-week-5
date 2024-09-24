//write a JAVA program  that implements Runtime polymorphism

class V
{
  void run()
  {
    System.out.println("vechicle is running");
   }
 }
 class Bi extends V
 {
   void run()
   {
   System.out.println("Bike is running");
   }
   public static void main(String args[])
   {
     Bi b=new Bi();
     b.run();
   }
 }


//output
Bike is running
