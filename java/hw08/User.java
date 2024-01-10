package hw08;

public class User {
    private String userName;
    private int age;
    private String email;
    private String password;
    private boolean isActive;
    private double amountSpentMoney;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName != null && !userName.isEmpty()) {
            this.userName = userName;
        } else {
            System.out.println("Некоректне ім'я користувача");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Некоректний вік");
        }
    }

    private String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        // Валідація, наприклад, чи пароль має мінімальну довжину
        if (password != null && password.length() >= 6) {
            this.password = password;
        } else {
            System.out.println("Некоректний пароль");
        }
    }

    public void makePurchase(double purchasePrice) {
        System.out.println("Покупка на суму " + purchasePrice + " здійснена.");
        amountSpentMoney += purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Загальна сума витрачених грошей: " + amountSpentMoney);
    }
}

