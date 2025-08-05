import java.time.LocalDate;

public class Codificador_Pali implements Codificador {

    public String getNome() {
        return "Codificador Simples";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 3, 13);
    }

    public int getNivelSeguranca() {
        return 1;
    }
    
    @Override
    public String codifica(String str) {
        char[] caracteres = str.toCharArray();
        char[] invertido = new char[caracteres.length];

        
        for (int i = 0; i < caracteres.length; i++) {
            invertido[i] = caracteres[caracteres.length - 1 - i];
        }

        // Incrementa cada caractere
        for (int i = 0; i < invertido.length; i++) {
            invertido[i] = (char) (invertido[i] + 1);
        }

        return new String(invertido);
    }

    @Override
    public String decodifica(String str) {
        char[] caracteres = str.toCharArray();

        // Decrementa cada caractere
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = (char) (caracteres[i] - 1);
        }
       
        char[] invertido = new char[caracteres.length];
        
        for (int i = 0; i < caracteres.length; i++) {
            invertido[i] = caracteres[caracteres.length - 1 - i];
        }

        return new String(invertido);
    }
}
