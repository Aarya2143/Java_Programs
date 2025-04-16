package polymorphism.MethodOverLoading;

public class MainMethodOverLoading {
    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    public static void main() {
        System.out.println("Main method without args");
    }

   MainMethodOverLoading obj = new MainMethodOverLoading();
}
