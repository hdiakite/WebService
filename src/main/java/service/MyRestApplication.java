package service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
public class MyRestApplication extends Application{
	

    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<Class<?>>();
        s.add(HellowordService.class);
        return s;
    }
    
    

	@Override
	public Set<Object> getSingletons() {
		 Set<Object> s = new HashSet<Object>();
	        s.add(new GestionVins());
		return s;
	}



	public MyRestApplication() {
		super();
		// TODO Auto-generated constructor stub
	}

}
