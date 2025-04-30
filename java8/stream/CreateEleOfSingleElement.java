package java8.stream;

import java.util.stream.Stream;

class Student1{

}

public class CreateEleOfSingleElement {
    public static void main(String[] args) {

        Stream<Student1> singleElementStream = Stream.of(new Student1());
        System.out.println(singleElementStream.count());
    }
}
