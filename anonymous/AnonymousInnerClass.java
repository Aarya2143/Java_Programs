package anonymous;

interface AnonymousInnerClass {
    int x = 10;
    void age();
}
class Demo
{
    public static void main(String[] args)
    {
  AnonymousInnerClass obj = new AnonymousInnerClass()
  {
      @Override
      public void age()
      {
          System.out.println("Age is: "+x);
      }
  };
  obj.age();
    }
}
