import java.time.LocalDate;

public class CodificadorSimples implements Codificador {
    public String getNome() {
        return "Codificador Simples";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    public int getNivelSeguranca(){
        return 1;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c + 1));
        }

        return encoded.toString();
    }

    public String codifica2(String str) {
        char[] caracteres = str.toCharArray();
        char[] invertido = new char[caracteres.length];

        for (int i = 0; i < caracteres.length; i++) {
            invertido[i] = caracteres[caracteres.length - 1 - i];
        }

        for (int i = 0; i < invertido.length; i++) {
            invertido[i] = (char) (invertido[i] + 1);
        }

        return new String(invertido);
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            encoded.append((char) (c - 1));
        }
        
        return encoded.toString();
    }

     public String decodifica2(String str) {
        char[] caracteres = str.toCharArray();

        // Subtrai 1 do código ASCII de cada caractere
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = (char) (caracteres[i] - 1);
        }

        // Inverte a string
        char[] invertido = new char[caracteres.length];
        for (int i = 0; i < caracteres.length; i++) {
            invertido[i] = caracteres[caracteres.length - 1 - i];
        }

        return new String(invertido);
    }
}