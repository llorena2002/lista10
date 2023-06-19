package br.ucsal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/salvarInformacoesServlet")
public class SalvarInformacoesServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        // Salvar informações de login
        String login = request.getParameter("login");
        session.setAttribute("login", login);
        
        // Salvar informações pessoais
        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");
        session.setAttribute("nome", nome);
        session.setAttribute("idade", idade);
        
        // Salvar informações acadêmicas
        String universidade = request.getParameter("universidade");
        String curso = request.getParameter("curso");
        session.setAttribute("universidade", universidade);
        session.setAttribute("curso", curso);
        
        // Salvar informações profissionais
        String empresa = request.getParameter("empresa");
        String cargo = request.getParameter("cargo");
        session.setAttribute("empresa", empresa);
        session.setAttribute("cargo", cargo);
        
        // Verificar quantidade de acessos ao documento
        Integer numeroAcessos = (Integer) session.getAttribute("numeroAcessos");
        if (numeroAcessos == null) {
            numeroAcessos = 1;
        } else {
            numeroAcessos++;
        }
        session.setAttribute("numeroAcessos", numeroAcessos);
        
        if (numeroAcessos >= 3) {
            // Redirecionar para o servlet Excedidos
            response.sendRedirect("excedidosServlet");
        } else {
            // Continuar normalmente
            response.sendRedirect("confirmacaoCadastro.jsp"); 
        }
    }
}
