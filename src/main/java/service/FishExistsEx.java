package service;

import jakarta.xml.ws.WebFault;

@WebFault
public class FishExistsEx extends Exception {
    public FishExistsEx(){
        super("This fish already exists");
    }
}
