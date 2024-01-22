package hw10mobilephone;

public class Main {

    public static void main(String[] args) {

        Model myPhone = new Model("Samsung a22", "987-654-3210");

        myPhone.makeCall("987-654-5555");
        myPhone.sendMessage("Hello", "Hello!");
        myPhone.watchVideo("Home Work 10");
        myPhone.listenMusick("Pavlo_Zibrov - Maryna");
        myPhone.makePhoto("Picture_01");
        myPhone.showModelInfo();
    }
}
