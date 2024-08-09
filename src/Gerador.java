import java.util.Random;

public class Gerador {


    public static String gerarSenha(boolean minusculas, boolean maiusculas, boolean numeros, boolean especiais, int tamanho) {

        String caracteresForSenha = "";
        String senhaGerada = "";

        if (minusculas) {
            caracteresForSenha += Senha.getMinusculas();
        }
        if (maiusculas) {
            caracteresForSenha += Senha.getMaiusculas();
        }
        if (numeros) {
            caracteresForSenha += Senha.getNumeros();

        }

        if (especiais) {
            caracteresForSenha += Senha.getEspeciais();
        }


        return gerarString(caracteresForSenha, tamanho);
    }


    public static String gerarString(String source, int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(source.length());
            sb.append(source.charAt(randomIndex));
        }

        return sb.toString();
    }
}

