// Уточненная абстракция
class MusicControl extends MusicDeviceControl {
    public MusicControl(MusicDevice device) {
        super(device);
    }

    public void play() {
        device.playMusic();
    }

    public void stop() {
        device.stopMusic();
    }
}
