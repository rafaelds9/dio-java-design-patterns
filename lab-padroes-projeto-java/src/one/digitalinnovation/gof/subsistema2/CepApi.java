package one.digitalinnovation.gof.subsistema2;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super(); //optional
    }
    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Patos";
    }
    public String recuperarEstado(String cep){
        return "PB";
    }
}
