package polymorphism.MethodOverRiding;

public class CovariantRule_No3 {
    CovariantRule_No3 show()
    {
        CovariantRule_No3 parent = new CovariantRule_No3();
        return parent;
    }

    CovariantRule_No3 test()
    {
        CovariantRule_No3 parent2 = new CovariantRule_No3();
        return parent2;
    }
}
class CovariantClass2 extends CovariantRule_No3
{
   @Override
   CovariantRule_No3 show()
   {
       CovariantClass2 child = new CovariantClass2();
       return child;
   }

    @Override
    CovariantClass2 test()
    {
       CovariantClass2 child2 = new CovariantClass2();
       return child2;
    }
}