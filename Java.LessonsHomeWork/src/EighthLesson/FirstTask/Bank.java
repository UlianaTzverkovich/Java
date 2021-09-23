package EighthLesson.FirstTask;

public class Bank extends Human {
    private final String bankName;

    public Bank(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "First Name='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                '}';
    }

    public String getBankName() {
        return bankName;
    }
}

