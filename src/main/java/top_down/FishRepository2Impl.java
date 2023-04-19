package top_down;

import java.util.ArrayList;
import java.util.List;

public class FishRepository2Impl implements FishRepository2 {
    private List<Fish> fishList;

    public FishRepository2Impl(){
        fishList = new ArrayList<>();
        try {
            addFish(1, "Łosoś", 23.5f, true);
            addFish(2, "Pstrąg", 13.7f, false);
        } catch (FishNotFoundEx_Exception e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public List<Fish> getAllFish() {
        return fishList;
    }

    @Override
    public Fish getFish(int id) throws FishNotFoundEx_Exception {
        for(Fish fish: fishList){
            if(fish.getId() == id) return fish;
        }
        throw new FishNotFoundEx_Exception("Fish not found", new FishNotFoundEx());
    }

    @Override
    public Fish updateFish(int id, String name, float weight, boolean saltwater) throws FishNotFoundEx_Exception {
        for(Fish fish: fishList){
            if(fish.getId() == id){
                if(name != null) fish.setName(name);
                if(weight > 0) fish.setWeight(weight);
                fish.setSaltwater(saltwater);
                return fish;
            }
        }
        throw new FishNotFoundEx_Exception("Fish not found", new FishNotFoundEx());
    }

    @Override
    public boolean deleteFish(int id) throws FishNotFoundEx_Exception {
        fishList.removeIf(fish -> fish.getId() == id);
        throw new FishNotFoundEx_Exception("Fish not found", new FishNotFoundEx());
    }

    @Override
    public Fish addFish(int id, String name, float weight, boolean saltwater) throws FishNotFoundEx_Exception {
        for(Fish fish: fishList){
            if(fish.getId() == id) throw new FishNotFoundEx_Exception("Fish not found", new FishNotFoundEx());
        }
        Fish fish = new Fish();
        fish.setId(id);
        fish.setName(name);
        fish.setWeight(weight);
        fish.setSaltwater(saltwater);
        fishList.add(fish);
        return fish;
    }

    @Override
    public int countFish() {
        return fishList.size();
    }
}
