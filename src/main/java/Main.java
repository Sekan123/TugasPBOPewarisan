public class Main {
    public static void main(String[] args) {
        Xiaomi xiaomi = new Xiaomi();
        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();
        Oppo oppo = new Oppo();

        PhoneUser user = new PhoneUser(xiaomi);

        user.turnOnThePhone();
        System.out.println("Xiaomi is Power On: ");

        user.turnOffThePhone();
        System.out.println("Xiaomi is Power Off: ");

        user.makePhoneLouder();
        user.makePhoneLouder();

        System.out.println("Xiaomi Volume: " + user.getPhoneVolume());

        user.turnOffThePhone();

        user = new PhoneUser(iphone);

        user.turnOnThePhone();
        System.out.println("iPhone is Power On: ");

        user.makePhoneLouder();

        System.out.println("iPhone Volume: " + user.getPhoneVolume());
    }
}
