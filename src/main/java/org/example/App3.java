package org.example;

import org.example.component3.SingletonBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * we have two beans with different scope but both do as singleton
 *
 */
public class App3
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
        System.out.println("first get  : " + "singleton: " + x1 + " prototype " + x1.getProtoypeBean());
        System.out.println("first get  : " + "singleton: " + x2 + " prototype " + x2.getProtoypeBean());

        System.out.println( "system end .............." );
    }
}
