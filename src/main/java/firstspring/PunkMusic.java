package firstspring;

import java.util.List;

public class PunkMusic implements Music{
    @Override
    public String getSong() {
        return "God save the Queen";
    }

    public List<String> getSongs(){return null;}
}
