
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        //para los checkbox arreglo 
        String tecnologias [] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupuacion = request.getParameter("ocupacion");
        //para el tag select html
        String musica[] = request.getParameterValues("musica");
        String cometario = request.getParameter("comentarios");
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title> resultado servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Paramentros procesados por el servlet</h1>");
        out.print("<table border='1' >");
        
        
        out.print("<tr>");
        out.print("<td>");
        out.print("usuario");
        out.print("</td>");
        out.print("<td>");
        out.print(usuario);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("password");
        out.print("</td>");
        out.print("<td>");
        out.print(password);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("tecnologias");
        out.print("</td>");
        out.print("<td>");
          for(String tecnologia: tecnologias){
        
            out.print(tecnologia);
            out.print(" / ");
        }
        
        out.print("</td>");
        out.print("</tr>");
        
        
        out.print("<tr>");
        out.print("<td>");
        out.print("genero");
        out.print("</td>");
        out.print("<td>");
        out.print(genero);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("ocupacion");
        out.print("</td>");
        out.print("<td>");
        out.print(ocupuacion);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("musica");
        out.print("</td>");
        out.print("<td>");
        
        if(musica != null){
          for(String item: musica){
        
            out.print(item);
            out.print(" / ");
        }
        }else{
           out.print("musica no fue selecionada");
        }
        
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("comentario");
        out.print("</td>");
        out.print("<td>");
        out.print(cometario);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
    }
}
