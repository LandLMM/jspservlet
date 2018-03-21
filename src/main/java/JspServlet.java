import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "JspServlet", value = "/jsp")
public class JspServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        RequestDispatcher rD = httpServletRequest.getRequestDispatcher("first.jsp");
        httpServletRequest.setAttribute("test1", "testowy atrybut");
        rD.forward(httpServletRequest, httpServletResponse);
    }
}
