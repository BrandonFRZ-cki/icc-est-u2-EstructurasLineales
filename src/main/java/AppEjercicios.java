import controllers.Stack;
import ejercicio_01_sign.SignValidator;
import ejercicio_02_sorting.StackSorter;

public class AppEjercicios {

    public static void main(String[] args) {
        SignValidator signValidator = new SignValidator();
        System.out.println(signValidator.isValid("([]){}"));
        System.out.println(signValidator.isValid("({)}"));

        Stack stack = new Stack();

        stack.push(3);
        stack.push(10);
        stack.push(6);
        stack.push(9);
        stack.push(4);
        stack.push(2);
        stack.push(1);

        stack.print();

        StackSorter sorter = new StackSorter();
        sorter.stackSort(stack);
        System.out.println("\n");
        stack.print();

























    }
}
