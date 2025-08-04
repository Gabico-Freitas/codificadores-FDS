import java.time.LocalDate;

public class CodificadorWorst implements Codificador{
    @Override
    public String getNome(){
        return "The Worst";
    }

    @Override
    public LocalDate getDataCriacao(){
        return LocalDate.of(2025, 8, 4);
    }

    @Override
    public int getNivelSeguranca(){
        return Integer.MIN_VALUE;
    }

    @Override
    public String codifica(String str){
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char)(c-1));
        }

        return encoded.toString();
    }

    @Override
    public String decodifica(String str){
        StringBuilder decoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            decoded.append((char)(c+1));
        }
        
        return decoded.toString();
    }
}