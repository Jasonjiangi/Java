import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 纯Java实现Servlet
* @author YEGC
* @version 1.0
* @data 2019年5月31日 上午8:58:51
* @remark Be Yourself
*/
public class HelloServlet extends HttpServlet{
 
    public void doGet(HttpServletRequest request, HttpServletResponse response){
         
        try {
            response.getWriter().println("<h1>Hello Servlet!</h1>");
            response.getWriter().println(new Date().toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
     
}
