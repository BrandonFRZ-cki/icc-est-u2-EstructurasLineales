import controllers.Cola;
import controllers.ColaG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;

public class AppPilasColas {
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
        Persona p4 = new Persona("David");
        Persona p5 = new Persona("Antonio");
        Persona p6 = new Persona("Juan");
        Persona p7 = new Persona("Pedro");

        ColaG<Persona> colaPersonas = new ColaG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        colaPersonas.add(p4);
        colaPersonas.add(p5);
        colaPersonas.add(p6);
        colaPersonas.add(p7);
        colaPersonas.print();
        System.out.println("|| Size → "+colaPersonas.size());
        System.out.println("----- Elemento Eliminado con remove() → "+ colaPersonas.remove());
        colaPersonas.print();
        System.out.println("|| Size → "+colaPersonas.size());

        System.out.println("Maria esta en la posicion "+colaPersonas.findByName("Maria"));
        System.out.println("------ ELIMINANDO David");
        colaPersonas.removeByName("David");
        colaPersonas.print();

    }
}
