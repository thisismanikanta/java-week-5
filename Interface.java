//write a JAVA program to implement interface.what kind of inheritance can be achieved?

interface A
{
 void show();
}
class BB implements A
{
  public void show()
  {
   System.out.println("interface");
  }
  public static void main(String args[])
  {
   BB obj=new BB();
   obj.show();
  }
}


//output
interface
  // multiple inheritance can be achieved
