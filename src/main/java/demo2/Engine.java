package demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Engine {

    @Value("0x11aa")
    private String id;

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
