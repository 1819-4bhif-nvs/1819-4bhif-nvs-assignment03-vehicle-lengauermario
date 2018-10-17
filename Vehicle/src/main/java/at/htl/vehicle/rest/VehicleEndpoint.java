package at.htl.vehicle.rest;

import at.htl.vehicle.model.Vehicle;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

@Path("vehicle")
public class VehicleEndpoint {

    @Path("{id}")
    public Vehicle find(@PathParam("id") long id){
        return new Vehicle("Opel "+ id, "Commodore");
    }

    @GET
    public List<Vehicle> findAll(){
        List<Vehicle> vehicls = new ArrayList<>();
        vehicls.add(find(20));
        vehicls.add(find(43));
        return vehicls;
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") long id) {
        System.out.println("deleted = " + id);
    }

    @POST
    public void save(Vehicle vehicle) {
        System.out.println("Vehicle = " + vehicle);
    }
}
