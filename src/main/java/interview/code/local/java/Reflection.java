package interview.code.local.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by vibinramakrishnan on 7/4/17.
 */
public class Reflection {
    public static void main(String args[]) {
        try {
            /* Parameters */
            Object[] doubleArgs = new Object[]{4.2, 3.9};

			/* Get class */
            Class rectangleDefinition = Class.forName("interview.code.local.java.Rectangle");

			/* Equivalent: Rectangle rectangle = new Rectangle(4.2, 3.9); */
            Class[] doubleArgsClass = new Class[]{double.class, double.class};
            Constructor doubleArgsConstructor = rectangleDefinition.getConstructor(doubleArgsClass);
            Rectangle rectangle = (Rectangle) doubleArgsConstructor.newInstance(doubleArgs);

			/* Equivalent: Double area = rectangle.area(); */
            Method m = rectangleDefinition.getDeclaredMethod("area");
            Double area = (Double) m.invoke(rectangle);

            System.out.println(area);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (NoSuchMethodException e) {
            System.out.println(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        } catch (InvocationTargetException e) {
            System.out.println(e);
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
