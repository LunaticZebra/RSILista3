package service;

import jakarta.xml.ws.WebFault;

@WebFault
public class FishNotFoundEx extends Exception{
    public FishNotFoundEx(){
        super("The specified fish does not exist");
    }
}
