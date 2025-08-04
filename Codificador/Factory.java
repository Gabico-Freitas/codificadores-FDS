public class Factory {
    public static String bestEncoder(int securityLevel){
        if (securityLevel==1) {
            return "CodificadorSimples \nCodificadorVerde";
        }
        else{
            return "outro";
        }
    }
}
