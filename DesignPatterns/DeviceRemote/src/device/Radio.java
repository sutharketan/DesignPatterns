package device;

public class Radio implements Device
{
    boolean enabled;
    int volume;
    int channel;

    public Radio(){
        this.enabled = false;
        this.volume = 5;
        this.channel = 1;
    }
    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
        System.out.println("volume: " + this.volume);
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("channel: " + this.channel);
    }
}
