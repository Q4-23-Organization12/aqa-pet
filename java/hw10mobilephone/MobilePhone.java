package hw10mobilephone;

abstract class MobilePhone implements Mobile {
    private String phoneNumber;
    public MobilePhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // Реализация методов интерфейса Mobile
    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + " from " + this.phoneNumber);
    }

    @Override
    public void sendMessage(String textMessage, String s) {
        System.out.println("Sending message from " + this.phoneNumber + ": " + textMessage);
    }

    @Override
    public void watchVideo(String videoName) {
        System.out.println("Watching video on " + this.phoneNumber + ": " + videoName);
    }

    @Override
    public void listenMusick(String songName) {
        System.out.println("Listening to music on " + this.phoneNumber + ": " + songName);
    }

    @Override
    public void makePhoto(String pictureName) {
        System.out.println("Taking a photo on " + this.phoneNumber + ": " + pictureName);
    }
}


