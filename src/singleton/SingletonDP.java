package singleton;

/***
 * Demo Singleton Design Pattern
 * use to create only one implementation of a class in Java
 * Private constructor to restrict instantiation of the class from other classes.
 * Private static variable of the same class that is the only instance of the class.
 * Public static method that returns the instance of the class, 
 * this is the global access point for outer world to get the instance of the singleton class.
 */
public class SingletonDP {
    private static SingletonDP instance;
    private SingletonDP(){

    }
    public static SingletonDP getInstance(){
        if(instance == null){
            synchronized(SingletonDP.class){
                if(instance == null){
                    instance = new SingletonDP();
                }
            }
        }
        return instance;
    }
}


