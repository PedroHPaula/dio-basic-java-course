public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Is TV On? " + smartTv.onState);
        System.out.println("Current Channel: " + smartTv.channel);
        System.out.println("Current Volume: " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("Is TV On Now? " + smartTv.onState);

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        System.out.println("The current Volume is " + smartTv.volume);

        smartTv.changeChannel(16);
        System.out.println("The current Channel is " + smartTv.channel);

        smartTv.increaseChannel();
        smartTv.increaseChannel();
        System.out.println("The current Channel is " + smartTv.channel);
    }
}
