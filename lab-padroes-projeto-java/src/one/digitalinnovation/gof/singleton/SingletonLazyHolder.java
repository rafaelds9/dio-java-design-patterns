package one.digitalinnovation.gof.singleton;


public class SingletonLazyHolder {
    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super(); //optional
    }
    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
