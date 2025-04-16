package abstraction;

//If one abstract class extend another abstract class then no mendatory to give implementation of parent class



// -------------------------------------------------- 1 --------------------------------------------------------------
abstract class RuleNo3 {
    abstract void abc();
}
abstract class xyz extends RuleNo3
{

     /*
       void abc(){
       System.out.println("hi"); // Not Mendatory
      */
}
// --------------------------------------------------- Rule 4 -------------------------------------------------------
/* no need to create object
abstract method not have body
*/