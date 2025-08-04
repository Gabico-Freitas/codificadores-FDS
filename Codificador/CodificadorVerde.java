import java.time.LocalDate;

public class CodificadorVerde implements Codificador {
    public String getNome(){
        return "CodificadorVerde";
    }

    public LocalDate getDataCriacao(){
        return LocalDate.of(2025,8,4);
    }

    public int getNivelSeguranca() {
        return 1;
    }

    public String codifica(String str){
        StringBuilder encoded = new StringBuilder();
        String verde="verde";
        int letra=0;
        for (char c : str.toCharArray()) {
            encoded.append((char) (c + (int)verde.charAt(letra)));
            if (letra==4) {
                letra=0;
            }
            else{
                letra++;
            }
        }
        return encoded.toString();
    }

    public String decodifica (String str){
        StringBuilder encoded = new StringBuilder();
        String verde="verde";
        int letra=0;
        for (char c : str.toCharArray()) {
            encoded.append((char) (c - (int)verde.charAt(letra)));
            if (letra==4) {
                letra=0;
            }
            else{
                letra++;
            }
        }
        return encoded.toString();
    }
}