package hw10mobilephone;

class Model extends MobilePhone {
    private String modelName;

    public Model(String modelName, String phoneNumber) {
        super(phoneNumber);
        this.modelName = modelName;
    }

    public void showModelInfo() {
        System.out.println("Model: " + modelName);
    }
}