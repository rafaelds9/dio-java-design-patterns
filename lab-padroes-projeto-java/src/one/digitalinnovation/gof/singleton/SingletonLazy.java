package one.digitalinnovation.gof.singleton;



public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super(); //optional
    }
    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
