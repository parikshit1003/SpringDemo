package demo2.config;

import demo2.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Instance {

    private int id;
    private Engine engine;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startInstance(){
        engine.runner();
        System.out.println("Instance with ID:" + this.id + " is in Running state");
    }

}
