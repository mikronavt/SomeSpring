package firstspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayerNew = context.getBean("musicPlayer", MusicPlayer.class);
        Computer computer = context.getBean("computer", Computer.class);
        musicPlayer.playMusic(Genres.ROCK);
        musicPlayer.playMusic(Genres.CLASSICAL);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer + " " + musicPlayerNew + " " + (musicPlayer == musicPlayerNew));
        System.out.println(computer);
        context.close();
    }
}
