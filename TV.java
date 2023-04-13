package task1;

public class TV {

    public int[] chooseChannel = new int[50];
    public int[] putVolume = new int[30];

    public TV(int[] setChannel, int[] setVolume) {
        this.chooseChannel = chooseChannel;
        this.putVolume = putVolume;
    }

    public void setChooseChannel() {
        this.chooseChannel = chooseChannel;

    }

    public void setPutVolume() {
        this.putVolume = putVolume;

    }

    public void volumeUp() {
        for (int i = 0; i < putVolume.length; i++) {
            putVolume[i]++;
        }
    }

    public void channelup() {
        for (int i = 0 + 1; i < chooseChannel.length; i++) {
            chooseChannel[i]++;
        }
    }

    public void channelDown() {
        for (int i = 0; i < chooseChannel.length; i++) {
            chooseChannel[i]--;
        }
    }

    public boolean turnOn(boolean tvIsOn) {

        if (tvIsOn == true) {
            setChooseChannel();
            channelup();
            channelDown();
            setPutVolume();
            volumeUp();
            return tvIsOn;

        } else if (!tvIsOn) {
            System.out.println("nothing can be displayed");
        }
        return false;

    }

}
