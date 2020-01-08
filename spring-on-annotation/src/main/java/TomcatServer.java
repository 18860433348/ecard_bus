import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

/**
*@Author DoubleC
*@Description TODO
*@Date 2020/1/8 9:44
**/
public class TomcatServer {

    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9090);
        try {
            tomcat.addWebapp("/","d:\\embed_tomcat\\");
            tomcat.start();
            tomcat.getServer().await();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
