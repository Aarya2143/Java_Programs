package collection.custom_array_list;

public class CustArrayList<T> {
  private int size;
  private int capacity;
  private Object[] arr;

   public CustArrayList()
   {
     size=0;
     capacity=100;
     arr = new Object[100/*it can be "capacity" also because capcity is 100*/];
   }

    private void increaseCapacity() {
        capacity = capacity*2;                         // Double the [it can be capacity *= 2 ]
       // arr = Arrays.copyOf(arr, capacity);          //Clone code repalce using Arrays.copyof() method.

        Object[] newarr = arr.clone();
        arr = new Object[capacity];
        for(int i=0 ; i<size; i++)
        {
            arr[i]= newarr[i];
        }
    }

   public void addele(T element){
       if(size == capacity){
           increaseCapacity();
       }
       arr[size++] = element;
   }

   public void removele(int index){
       if(index < 0 || index >= size){
           System.out.println("Invalid index");
           return;
       }
       for (int i = index; i < size - 1; i++) {
           arr[i] = arr[i + 1];
       }
       arr[size - 1] = null; // Remove reference for garbage collection
       size--;
   }

   public void removeobj(Object o)
   {
       for (int i=0; i<size; i++)
       {
           if(arr != null && arr[i].equals(o))
           {
             for(int j=i; j<size-1; j++)
             {
                 arr[j]=arr[j+1];
             }
             arr[size-1]=null;
             size--;
               System.out.println("Deleted obj is: "+o);
               return;
           }
       }
       System.out.println("Object not found in list");
   }

    public void print() {
        System.out.println("Custom ArrayList: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CustArrayList<Object> list = new CustArrayList();
        list.addele(10);
        list.addele("String");
        list.addele(true);
        list.addele('A');

        list.print();  //call print method

//        list.removele(-1);
//        list.removele(101);
//        list.removele(2);
//
//        list.print();  //call print method


        list.removeobj(10);
        list.print();
    }
}


class demo
{
    public static void main(String[] args) {
        CustArrayList<Integer> LI= new CustArrayList<>();
        LI.addele(4);
        LI.print();
    }
}