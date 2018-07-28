package com.clientes.model.rest.facede;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cliente.model.clientesMod;
@Path("/clientes")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class clientesFacede {
 /*Neste class vamos criar nosso cliente para consumir nosso Json*/
	static List<clientesMod> listarclientes = new ArrayList<clientesMod>();
	static {
		listarclientes.add(new clientesMod("Edinaldo Santos","Floresta, 198","Jardim Andorinhas","Campinas","SP"));
		listarclientes.add(new clientesMod("Edy Marcio Santos","Floresta, 198","Jardim Andorinhas","Campinas","SP"));
		listarclientes.add(new clientesMod("Antonio Santos","Floresta, 198","Jardim Andorinhas","Campinas","SP"));
	}
	@GET
	public List<clientesMod>getClientes()
	{
		return listarclientes;
	}
}
