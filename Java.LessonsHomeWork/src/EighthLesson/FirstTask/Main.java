package EighthLesson.FirstTask;

public class Main {
    public static void main(String[] args) {
        Human client = new Client("Uliana", "Tsverkovich", "Raiffeisen");
        client.output();

        Human bankOfficer = new Bank("Boris", "Romanov", "Alfa");
        bankOfficer.output();
    }
}
