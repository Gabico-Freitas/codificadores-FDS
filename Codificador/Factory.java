public class Factory {
    public static String bestEncoder(int securityLevel){
         if (securityLevel==1) {
            return "CodificadorSimples \nCodificadorVerde";
        }
        else if(securityLevel==Integer.MAX_VALUE){
            return "CodificadorBest";
        }
        else if(securityLevel==Integer.MIN_VALUE){
            return "CodificadorWorst";
        }
        else{
            return "outro";
        }
    }
}
