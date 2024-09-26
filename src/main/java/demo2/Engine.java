package demo2;

import org.springframework.stereotype.Component;

public class Engine {

    private String id = "0x11aa";

    public void setId(String arg){
        this.id = arg;
    }

    public Engine(){
        System.out.println("Object Created for class Engine");
    }

    public void runner(){
        System.out.println("Engine entered the running state with id: " + this.id);
    }

}
