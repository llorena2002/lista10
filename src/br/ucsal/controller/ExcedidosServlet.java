package br.ucsal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/excedidosServlet")
public class ExcedidosServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        // Recuperar informações da sessão
        String login = (String) session.getAttribute("login");
        String nome = (String) session.getAttribute("nome");
        String idade = (String) session.getAttribute("idade");
        String universidade = (String) session.getAttribute("universidade");
        String curso = (String) session.getAttribute("curso");
        String empresa = (String) session.getAttribute("empresa");
        String cargo = (String) session.getAttribute("cargo");
        Integer numeroAcessos = (Integer) session.getAttribute("numeroAcessos");

        // Exibir as informações dos cookies
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Excedidos</title></head><body>");
        out.println("<h1>Limite de Acessos Excedido</h1>");
        out.println("<p>Olá " + nome + ", o número máximo de acessos permitidos foi excedido.</p>");
        out.println("<p>Informações do usuário:</p>");
        out.println("<ul>");
        out.println("<li><b>Login:</b> " + login + "</li>");
        out.println("<li><b>Nome:</b> " + nome + "</li>");
        out.println("<li><b>Idade:</b> " + idade + "</li>");
        out.println("<li><b>Universidade:</b> " + universidade + "</li>");
        out.println("<li><b>Curso:</b> " + curso + "</li>");
        out.println("<li><b>Empresa:</b> " + empresa + "</li>");
        out.println("<li><b>Cargo:</b> " + cargo + "</li>");
        out.println("</ul>");
        out.println("<p>Número de acessos: " + numeroAcessos + "</p>");
        out.println("</body></html>");
        
    }
}
