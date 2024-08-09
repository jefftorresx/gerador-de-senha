public class Senha {

    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvxyz";
    private static final String MAIUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "1234567890";
    private static final String ESPECIAIS = "!@#$%^&*()_+-=[]{}|;:,.<>/?";


    public static String getMinusculas() {
        return MINUSCULAS;
    }

    public static String getMaiusculas() {
        return MAIUSCULAS;
    }

    public static String getNumeros() {
        return NUMBERS;
    }

    public static String getEspeciais() {
        return ESPECIAIS;
    }


}
