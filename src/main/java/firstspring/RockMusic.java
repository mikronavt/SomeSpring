package firstspring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//@Component
public class RockMusic implements Music{
    private List<String> songs = Arrays.asList("Rock song1","Rock song2", "Rock song3");

    @Override
    public String getSong() {
        return "We will rock you!";
    }

    public List<String> getSongs(){
        return songs;
    }
}
