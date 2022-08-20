package one.digitalinnovation.gof.singleton;



public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super(); //optional
    }
    public static SingletonEager getInstancia(){
        return instancia;
    }
}
