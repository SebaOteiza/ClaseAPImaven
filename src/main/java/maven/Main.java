package maven;

import java.util.List;

import javax.ws.rs.client.Client; //lo  traemos de las depenciencias de POM
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//Javax es lo que pusimos en el POM de ahí los exporta 
public class Main {

	public static void main(String[] args) {
		// clase creada dentro del paquete maven
		
		//TODO LO EXPORTADO VIENE EN EL JAVAX, ESTO LO CONSEGUIMOS CUANDO ESCRIBIMOS EN EL POM.XML PARA LLEGAR A ESO SE DEBE REALIZAR EN MAVEN EL UPDATE PROJECT 

		Client client = ClientBuilder.newClient(); //cliente que viene de la clase cliente, client Builder crea un cliente nuevo
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("posts"); // cliente que consume desde una api alguna info
		//le pasamos la URL que estabsmos utilziando y en el path. le pasamos el "posts" 
		
		Invocation.Builder invocacionBuilder = target.request(MediaType.APPLICATION_JSON); //construyendo el REQUEST, PETICIOON DE ACCESO A LA API (EL LINK PEGADO ARRIBA)
		
		Response respuestaAPI = invocacionBuilder.get(); //Creacion del RESPONSE 
		
		
		//vamos a crear una lista 
		
		List<Publicacion> lista  = respuestaAPI.readEntity(new GenericType<List<Publicacion>>() {}); //en los <> se escribe el nombre de la otra clase (publicacion en este caso)
		
		System.out.println(lista.get(0));
		
		
		
		
		
		
		//al trabajar con bases de datos y front end todo esto es mas simple 
		
		
		
	}

}
