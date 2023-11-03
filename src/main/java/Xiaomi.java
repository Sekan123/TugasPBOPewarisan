class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    @Override
    public void powerOn() {
        isPowerOn = true;
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < max_volume) {
            volume++;
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > min_volume) {
            volume--;
        }
    }

    public int getVolume() {
        return volume;
    }
}