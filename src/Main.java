import helper.Androids;
import helper.iPhones;

public class Main {
    public static void main(String[] args) {
        // Створення екземпляра Androids
        Androids androidPhone = new Androids();
        // Виклик методів для Androids
        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        androidPhone.runLinuxApp();

        // Створення екземпляра iPhones
        iPhones iPhone = new iPhones();
        // Виклик методів для iPhones
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.runiOSApp();
    }
}