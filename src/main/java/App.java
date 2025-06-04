import controllers.Cola;
import controllers.ColaG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;

public class App {
    public static void main(String[] args) {
        System.out.println("------------------------ NODE NORMAL");
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(0);
        stack.push(5);

        stack.print();

        System.out.println(" | "+stack.size()+" → size");
        stack.pop();
        System.out.println("\n");
        stack.print();
        System.out.println("| "+stack.size()+" → size");

        System.out.println("------------------------ NODE GENERICO");
        StackG stackG = new StackG();
        stackG.push("uno");
        stackG.push("dos");
        stackG.push(3);
        stackG.push(4.9);
        stackG.print();
        System.out.println(" | "+stackG.size() + " → size");
        System.out.println("\n");
        stackG.pop();
        stackG.print();
        System.out.println(" | "+stackG.size() + " → size");


        System.out.println("------------------------ COLA NODO NORMAL");
        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(1);
        cola.print();
        System.out.println(" | "+cola.size+" → Size \n");

        System.out.println("------------------------ COLA NODO GENERICO");
        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Maria");

        ColaG<Persona> colaG = new ColaG<Persona>();
        colaG.add(p1);
        colaG.add(p2);
        colaG.add(p3);
        colaG.print();
        System.out.println("|| Size → "+colaG.size());




    }
}
