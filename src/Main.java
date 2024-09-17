import interfaces.FilaImpl;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FilaImpl <String> f = new FilaImpl<>();
        f.add("Calabresa");
        f.add("Marguerita");
        f.add("Portuguesa");
        f.add("Vegetariana");
        f.add("Frango");
        f.add("Pepperoni");

        System.out.println(f.toString());
        System.out.println(f.pool());
        System.out.println(f.toString());
        System.out.println(f.pool());
        System.out.println(f.toString());
        System.out.println(f.pool());
        System.out.println(f.toString());
        f.add("Pizza");
        System.out.println(f.toString());
        System.out.println(f.pool());
        System.out.println(f.toString());
        f.pool();
        System.out.println(f.toString());
        System.out.println(f.peek());
        System.out.println(f.size());
        System.out.println(f.isEmpty());

    }
}