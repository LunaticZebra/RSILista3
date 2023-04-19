package top_down;



import java.util.List;

public interface FishRepository2 {
    List<Fish> getAllFish();
    Fish getFish(int id) throws FishNotFoundEx_Exception;
    Fish updateFish(int id, String name, float weight, boolean saltwater) throws FishNotFoundEx_Exception;
    boolean deleteFish(int id) throws FishNotFoundEx_Exception;
    Fish addFish(int id, String name, float weight, boolean saltwater) throws FishNotFoundEx_Exception;
    int countFish();
}
