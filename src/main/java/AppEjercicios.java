import ejercicio_01_sign.SignValidator;

public class AppEjercicios {

    public static void main(String[] args) {
        SignValidator signValidator = new SignValidator();
        System.out.println(signValidator.isValid("([]){}"));
        System.out.println(signValidator.isValid("({)}"));

    }
}
