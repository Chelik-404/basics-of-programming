public class Main {
    public static void main(String[] args) {
        MusicDeviceControl control = new MusicControl(new Player());
        control.play();
        control.stop();

        control = new MusicControl(new Speaker());
        control.play();
        control.stop();

        control = new MusicControl(new Headphones());
        control.play();
        control.stop();
    }
}
