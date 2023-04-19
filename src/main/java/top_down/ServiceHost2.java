package top_down;

import jakarta.xml.ws.Endpoint;

import java.io.IOException;

import static java.lang.System.exit;

public class ServiceHost2 {
    static int PORT = 8080;
    static String URL = "http://localhost:";
    static String ENDPOINT = "/fishservice";


    public static void main(String[] args){
        System.out.println("Web Service service.FishService is starting...");
        FishService fsi = new FishServiceImpl2();
        String finalUrl = URL + PORT + ENDPOINT;
        System.out.println(finalUrl);
        Endpoint.publish(finalUrl, fsi);
        System.out.println("Press ENTER to STOP service.FishService...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        exit(0);
    }
}
