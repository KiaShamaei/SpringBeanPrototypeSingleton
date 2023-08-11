package org.example;

import org.example.component2.SingletonBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * first solution
 *
 */
public class App2
{
    public static void main( String[] args )
    {
        // both bean have singleton behavior
        System.out.println( "system start .............." );
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("show hashcode of bean to evaluate prototype behavior ");
        //first instance
        var x1 = context.getBean(SingletonBean.class);
        //second instance
        var x2 = context.getBean(SingletonBean.class);
        System.out.println("first get  : " + "singleton: " + x1 + " prototype " + x1.getPrototype());
        System.out.println("first get  : " + "singleton: " + x2 + " prototype " + x2.getPrototype());

        System.out.println( "system end .............." );
    }
}
