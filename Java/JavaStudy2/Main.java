package JavaStudy2;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Ryota";
        System.out.println(child.getName());

        Parent parent = new Child();
        parent.name = "Tom";
        System.out.println(parent.getName());
    }
}