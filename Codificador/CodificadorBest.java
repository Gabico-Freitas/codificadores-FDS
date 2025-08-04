import java.time.LocalDate;

public class CodificadorBest implements Codificador{
    @Override
    public String getNome(){
        return "The Best";
    }

    @Override
    public LocalDate getDataCriacao(){
        return LocalDate.of(2025, 8, 4);
    }

    @Override
    public int getNivelSeguranca(){
        return Integer.MAX_VALUE;
    }

    @Override
    public String codifica(String str){
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char)(c*c));
        }

        return encoded.toString();
    }

    @Override
    public String decodifica(String str){
        StringBuilder decoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            decoded.append((char)Math.sqrt(c));
        }
        
        return decoded.toString();
    }
}