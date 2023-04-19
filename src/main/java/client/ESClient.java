package client;

import top_down.Fish;
import top_down.FishNotFoundEx_Exception;
import top_down.FishService;
import top_down.ServiceFishService;

import java.net.MalformedURLException;
import java.net.URL;

public class ESClient {

    public static void main(String[] args) throws MalformedURLException, FishNotFoundEx_Exception {

        int num =-1;
        URL addr = new URL("http://localhost:8080/fishservice?wsdl");

        ServiceFishService fService = new ServiceFishService(addr);

        FishService fServiceProxy = fService.getFishServiceImplPort();

        num = fServiceProxy.countFish();
        System.out.println("Num of fish = " + num);

        Fish fish = fServiceProxy.getFish(1);
        System.out.println("Fish " + fish.getName() + " " + fish.getWeight() + " " + fish.isSaltwater());
        fServiceProxy.addFish(15, "Karp", 10.3f, false);
        fish = fServiceProxy.getFish(15);
        System.out.println("Fish " + fish.getName() + " " + fish.getWeight() + " " + fish.isSaltwater());


    }

}
