package firstspring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Component
public class ClassicalMusic implements Music{
    private List<String> songs = Arrays.asList("Classical song1","Classical song2", "Classical song3");
   // private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public List<String> getSongs(){
        return songs;
    }
}
