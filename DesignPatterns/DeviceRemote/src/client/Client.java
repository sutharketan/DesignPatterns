package client;

import device.Radio;
import device.Tv;
import remote.AdvancedRemote;
import remote.Remote;

public class Client
{
    public static void main(String[] args) {
        var tv = new Tv();
        var remote = new Remote(tv);
        remote.togglePower();

        var radio = new Radio();
        remote = new AdvancedRemote(radio);
        remote.channelUp();
        remote.channelUp();
    }
}
