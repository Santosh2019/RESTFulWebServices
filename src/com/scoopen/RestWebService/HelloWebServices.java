package com.scoopen.RestWebService;
import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/download")
public class HelloWebServices {

	String path="E:\\Movie\\abcd.txt";
	/*
	@GET
	//@POST
	@Path("/data")
	//@Path("/addCustomer")
	@Produces("text/plain")
	public Response Hi(@FormParam("firstname") String firstname,@FormParam("lastname") String lastname) {
		
		File file=new File(mydata);
		ResponseBuilder rb=Response.ok((Object)file);
		
		rb.header("Content-Disposition","attachment;filename=javaabcFileFromServer.txt");
		
		//String demo="<font color='sky' face='verdana' size='10'>" +"My First Name is "+firstname+"</br>My Last Name is "+lastname+"";
		return rb.build();
				//Response.status(200).entity(demo).build();
		
	}
	*/

    @GET

    @Path("/data")

    @Produces("text/plain")

    //@Produces("image/png")

    //@Produces("application/pdf")

    public Response getCustomerDataFile() {
        
        File file = new File(path);
        
        ResponseBuilder rb = Response.ok((Object) file);

        rb.header("Content-Disposition","attachment; filename=abcd.txt");

        return rb.build();

    }
}
	
