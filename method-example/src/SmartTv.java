public class SmartTv {
    boolean onState = false;
    int channel = 1;
    int volume = 25;

    public void turnOn() {
        onState = true;
    }

    public void turnOff() {
        onState = false;
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }

    public void increaseChannel() {
        channel++;
    }

    public void decreaseChannel() {
        channel--;
    }

    public void increaseVolume() {
        volume++;
    }

    public void decreaseVolume() {
        volume--;
    }
}
