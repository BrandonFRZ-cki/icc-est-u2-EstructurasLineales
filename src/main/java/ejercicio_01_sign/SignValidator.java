package ejercicio_01_sign;

import java.util.Stack;

public class SignValidator {
    public boolean isValid(String cadena) {
        /* {}[]{()}
        * Agarro el uno por uno y comparo
        * comparo si es de apertura o cerrada
        *   apertura → agrego a la pila
        *   cerrada  → comparo con el anterior
        *       si es de cerrada comparo si es del mismo tipo
        *           si son del mismo tipo elimino de la pila
        *           si no retorno falso
        * */
        Stack<Character> pila = new Stack<Character>();
        for (int i = 0; i < cadena.length(); i++) {
            char temp = cadena.charAt(i);
            if(temp == '('||temp == '['||temp == '{'){//apertura
                pila.push(temp);
            } else if (temp == ')' || temp == ']' || temp == '}') {//de cierre
                if(pila.isEmpty()){
                    return false;
                }
                if(pila.peek() == '(' && temp==')'){
                    pila.pop();
                }else if(pila.peek() == '[' && temp==']'){
                    pila.pop();
                } else if (pila.peek() == '{' && temp=='}') {
                    pila.pop();
                }
            }else{
                return false;
            }
        }
        if(pila.isEmpty()){
            return true;
        }
        return false;
    }
}
