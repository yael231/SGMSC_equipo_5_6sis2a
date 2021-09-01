package controlador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.Usuario;

import entidad.BeanUsuario;

public class ServletRegistro extends HttpServlet {
 private static final long serialVersionUID = 1L;

    public ServletRegistro() {
    }

 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String user=request.getParameter("user");
  String pass=request.getParameter("pass");
  if(!user.equalsIgnoreCase("") && !pass.equalsIgnoreCase("")){
   BeanUsuario busuario=new BeanUsuario(user, pass);
   boolean sw=Usuario.agregarmusuario(busuario);
   if(sw){
    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
   }else{
    PrintWriter out=response.getWriter();
    out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
   }
  }
 }

 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String user=request.getParameter("user");
  String pass=request.getParameter("pass");
  if(!user.equalsIgnoreCase("") && !pass.equalsIgnoreCase("")){
   BeanUsuario busuario=new BeanUsuario(user, pass);
   boolean sw=Usuario.agregarmusuario(busuario);
   if(sw){
    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
   }else{
    PrintWriter out=response.getWriter();
    out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
   }
  }
 }
}