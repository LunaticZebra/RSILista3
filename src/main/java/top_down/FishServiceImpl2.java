package top_down;


import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "top_down.FishService",
        endpointInterface = "top_down.FishService")
public class FishServiceImpl2 implements FishService {
    private FishRepository2 dataRepository = new FishRepository2Impl();

    public Fish getFish(int id) throws FishNotFoundEx_Exception {
        System.out.println("...called getFish id=" + id);
        return dataRepository.getFish(id);
    }

    public List<Fish> getAllFish(){
        System.out.println("...called getAllFish");
        return dataRepository.getAllFish();
    }

    public Fish addFish(int id, String name, float weight, boolean saltwater){
        System.out.printf("...called addFish with paremeters " + id + " "+ name+ " "+ weight + " " + saltwater);
        try {
            return dataRepository.addFish(id, name, weight, saltwater);
        } catch (FishNotFoundEx_Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteFish(int id) throws FishNotFoundEx_Exception {
        System.out.println("...called deleteFish id = "+ id);
        return dataRepository.deleteFish(id);
    }

    public int countFish(){
        System.out.println("...called countFish");
        return dataRepository.countFish();
    }
}
