package interview.code.local.java;

import java.io.Serializable;

/**
 * Created by vibinramakrishnan on 7/11/17.
 */
public class ClassicSingleton  implements Serializable{


    private static ClassicSingleton instance = null;

    private ClassicSingleton() {
        // Exists only to defeat instantiation.
    }

    //  only one instance is crested , thread safety
     public static ClassicSingleton getInstance() {

         if (instance == null) {

             synchronized (ClassicSingleton.class) {
                 if (instance == null) {
                     instance = new ClassicSingleton();
                 }
             }

         }
        return instance;
    }


    @SuppressWarnings("unused")
    private ClassicSingleton readResolve() {
        return instance;
    }

}
