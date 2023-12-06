// Абстракция
abstract class MusicDeviceControl {
    protected MusicDevice device;

    public MusicDeviceControl(MusicDevice device) {
        this.device = device;
    }

    abstract void play();

    abstract void stop();
}
