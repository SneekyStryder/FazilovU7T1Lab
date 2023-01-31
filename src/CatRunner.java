import java.util.ArrayList;
import java.util.Locale;

public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Stryder");
        Cat cat2 = new Cat("Joe");
        Cat cat3 = new Cat("Det");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Paul");
        Cat replaceCat = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replaceCat);
        cat4.setName(cat4.getName() + " Meow");
        cats.set(2, cat4);
        System.out.println(cat4);
        System.out.println(cats);

        for (int i = 0; i < cats.size(); i++) {
            String lowerName = cats.get(i).getName();
            String upperName = lowerName.toUpperCase();
            cats.get(i).setName(upperName);
        }
        System.out.println(cats);

        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}
