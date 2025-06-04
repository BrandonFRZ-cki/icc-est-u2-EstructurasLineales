import controllers.Stack;
import controllers.StackG;

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
    }
}
