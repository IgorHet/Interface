package helper;

import service.Smartphones;
import service.IOS;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("iPhone calling...");
    }

    @Override
    public void sms() {
        System.out.println("iPhone sending iMessage...");
    }

    @Override
    public void internet() {
        System.out.println("iPhone browsing the internet...");
    }

    @Override
    public void runiOSApp() {
        System.out.println("Running iOS app on iPhone...");
    }
}
