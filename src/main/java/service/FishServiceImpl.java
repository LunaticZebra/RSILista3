package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "service.FishService",
endpointInterface = "service.FishService")
public class FishServiceImpl {
    private FishRepository dataRepository = new FishRepositoryImpl();

    @WebMethod
    public Fish getFish(int id) throws FishNotFoundEx{
        System.out.println("...called getFish id=" + id);
        return dataRepository.getFish(id);
    }

    @WebMethod
    public List<Fish> getAllFish(){
        System.out.println("...called getAllFish");
        return dataRepository.getAllFish();
    }

    @WebMethod
    public Fish addFish(int id, String name, float weight, boolean saltwater) throws FishExistsEx{
        System.out.printf("...called addFish with paremeters " + id + " "+ name+ " "+ weight + " " + saltwater);
        return dataRepository.addFish(id, name, weight, saltwater);
    }

    @WebMethod
    public boolean deleteFish(int id) throws FishNotFoundEx{
        System.out.println("...called deleteFish id = "+ id);
        return dataRepository.deleteFish(id);
    }

    @WebMethod
    public int countFish(){
        System.out.println("...called countFish");
        return dataRepository.countFish();
    }
}
