package firstspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

//@Component
//@Scope("prototype")
public class MusicPlayer {
    private List<Music> musicList;
    //@Autowired
   // @Qualifier("rockMusic")
//    private Music rockMusic;

   // @Autowired
   // @Qualifier("classicalMusic")
//    private Music classicalMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

//    public MusicPlayer(Music music1, Music music2) {
//        this.rockMusic = music1;
//        this.classicalMusic = music2;
//    }
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
//
    public List<Music> getMusicList() {
        return musicList;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playMusic(Genres g){
        musicList.forEach(m -> System.out.println("Playing: " + m.getSong()));
//        List<String> songs = null;
//        switch (g) {
//            case ROCK:
//                songs = rockMusic.getSongs();
//                break;
//            case CLASSICAL:
//                songs = classicalMusic.getSongs();
//                break;
//        }
//        System.out.println("Playing: " + songs.get(new Random().nextInt(songs.size())));
    }
    @PostConstruct
    public void playerInit(){
        System.out.println("Init player");
    }

    @PreDestroy
    public void playerDestroy(){
        System.out.println("Destroy player");
    }

}
