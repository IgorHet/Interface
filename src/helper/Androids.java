package helper;

import service.LinuxOS;
import service.Smartphones;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Android phone calling...");
    }

    @Override
    public void sms() {
        System.out.println("Android phone sending SMS...");
    }

    @Override
    public void internet() {
        System.out.println("Android phone browsing the internet...");
    }

    @Override
    public void runLinuxApp() {
        System.out.println("Running Linux app on Android phone...");
    }
}