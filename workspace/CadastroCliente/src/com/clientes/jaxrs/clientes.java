package com.clientes.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/Exemplojawsrs")
public class clientes {
  @GET
  public String ExecultaGet() {
	  return "Ola Mundo Isto � um GET";
  }
  
  @POST 
  public String ExecutarPost() {
	  return "Ola Mundo Isto � um POST";
  }
}
