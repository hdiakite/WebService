package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import metier.DonneeVin;

@Path("/Macave")
public class GestionVins {
	private ArrayList<DonneeVin> listeDonneesVin;
	private int idDonneeVin;
	private static GestionVins INSTANCE; 
	
	
	public GestionVins()
    {
		listeDonneesVin = new ArrayList<DonneeVin>();
		idDonneeVin = 0;
		if ( INSTANCE == null) {
			INSTANCE = this;
		}
    }
 
	 public static GestionVins getInstance()
	    {  
	    	if ( INSTANCE == null) {
	    		INSTANCE = new GestionVins();
	    	}
	    	return INSTANCE;
	    }
	 
	   
	    @POST
	    @Path("add")
	    public void addVin(DonneeVin d) {
	    	d.setId(idDonneeVin++);
	    	listeDonneesVin.add(d);
	    	System.err.println(d);
	    }
	 
	 @POST
	 @Produces(MediaType.APPLICATION_JSON)
	 public List getListeDonneesVin() {
	    	return listeDonneesVin;
	     }
	 
	 public void deleteDonneeVin(DonneeVin d) {
	    	listeDonneesVin.remove(d);
	    }
	 
	    @DELETE
	    @Path("delete/{id}")
	    public void deleteDonneeVin(@PathParam("id")int id) {
	    	if (id < listeDonneesVin.size()) {
	        	DonneeVin d = getDonneeVin(id);
	    		deleteDonneeVin(d);
	        	listeDonneesVin.remove(d);		
	    	}

	    }
	    
	    @GET
	    @Path("{id}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public DonneeVin getDonneeVin(@PathParam("id") int id) {
	    	if (id < listeDonneesVin.size()) {
	    		return listeDonneesVin.get(id);
	    	}
	    	return null;
	    }
	    
		 public void addQuantiteDonneeVin(DonneeVin d, int newquantite ) {
			for( DonneeVin i : listeDonneesVin) {
				if (i ==d){
					i.addQuantite(newquantite);
					break;
				}
			}	
		 }  
		   @DELETE		
	     public void delQuantiteDonneeVin(DonneeVin d, int removquantite ) {
				for( DonneeVin i : listeDonneesVin) {
					if (i ==d){
						if(i.getQuantite() > removquantite) {
							i.removeQuantite(removquantite);
						break;
					}
						else if(i.getQuantite() > removquantite){
							listeDonneesVin.remove(i);		
						}
				}	
			 }
	     }
	    public ArrayList<DonneeVin> getListeDonneeVin() {
	    	return listeDonneesVin;
	    }
	  
}
