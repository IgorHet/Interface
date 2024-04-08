import helper.Androids;
import helper.IPhones;
import service.LinuxOS;
import service.Smartphones;
import service.IOS;

public class Main {
    public static void main(String[] args) {
        // Створення екземплярів Androids, iPhones
        Smartphones androidPhone = new Androids();
        Smartphones iPhone = new IPhones();

        LinuxOS androidOS = new Androids();
        IOS iPhoneOS = new IPhones();

        // Виклик методів для Androids
        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();

        // Виклик методів для iPhones
        iPhone.call();
        iPhone.sms();
        iPhone.internet();

        // Виклик методів для LinuxOS
        androidOS.runLinuxApp();

        // Виклик методів для iOS
        iPhoneOS.runiOSApp();
    }
}