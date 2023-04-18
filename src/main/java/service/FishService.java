package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface FishService {
    @WebMethod
    Fish getFish(int id) throws FishNotFoundEx;

    @WebMethod
    Fish addFish(int id, String name, float weight, boolean saltwater);

    @WebMethod
    boolean deleteFish(int id) throws FishNotFoundEx;

    @WebMethod
    List<Fish> getAllFish();

    @WebMethod
    int countFish();
}
