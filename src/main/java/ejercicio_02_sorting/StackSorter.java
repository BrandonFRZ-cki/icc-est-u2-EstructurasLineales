package ejercicio_02_sorting;

import controllers.Stack;

public class StackSorter {
    public void stackSort(Stack temp) {
        Stack stackTemp = new Stack();
        while (!temp.isEmpty()) {
            int elementoTemp = temp.pop();
            while (!stackTemp.isEmpty() && stackTemp.peek() > elementoTemp) {
                temp.push(stackTemp.pop());
            }
            stackTemp.push(elementoTemp);
        }
        while (!stackTemp.isEmpty()) {
            temp.push(stackTemp.pop());
        }
    }
}