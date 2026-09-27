package Oops.Abstraction;

interface Camera {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

public class MultipleInheritanceUsingInterface
        implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    public static void main(String[] args) {

        MultipleInheritanceUsingInterface phone =
                new MultipleInheritanceUsingInterface();

        phone.takePhoto();
        phone.playMusic();
    }
}