package service;

import test.X;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @Author DoubleC
 * @Description TODO
 * @Date 2020/1/8 10:27
 **/
@HandlesTypes(X.class)
public class TestServlet3AndSpi implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("this class implement ServletContainerInitializer, run when boot");
    }
}
