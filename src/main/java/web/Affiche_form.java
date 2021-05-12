package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import metier.*;
import service.GestionVins;

/**
 * Servlet implementation class Affiche_form
 */
@WebServlet("/Affiche_form")
public class Affiche_form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	  private GestionVins gestVin;
    public Affiche_form() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	gestVin = GestionVins.getInstance();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub
		if (request.getParameter("type").equals("list")) {
			request.setAttribute("liste", gestVin.getListeDonneeVin());
			this.getServletContext().getRequestDispatcher("/WEB-INF/Affiche_liste.jsp" ).include(request, response);
		}
		else if (request.getParameter("type").equals("del")) {
			int id = Integer.parseInt(request.getParameter("id"));
			DonneeVin d = gestVin.getDonneeVin(id);
			gestVin.deleteDonneeVin(d);
			request.setAttribute("liste", gestVin.getListeDonneeVin());
			this.getServletContext().getRequestDispatcher("/WEB-INF/Affiche_liste.jsp" ).include(request, response);
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("bad type");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Vin v = new Vin();
		v.setNom(request.getParameter("nom"));
		v.setPrix(request.getParameter(prix));
		DonneeVin d = new DonneeVin();
		d.setVin(v);
		String quantite = request.getParameter("quantite");
		d.setQuantite(Integer.parseInt(quantite));
		gestVin.addVin(d);
		System.out.println("Pizza: "+d.getVin().getNom());
		System.out.println("Quantite: "+d.getQuantite());
		System.out.println("Id: "+d.getId());
	//	this.listeCommande.add(c);

		request.setAttribute("DonneeVin", d);
		this.getServletContext().getRequestDispatcher("/WEB-INF/Affiche_pizza.jsp" ).include(request, response);
	}

}
