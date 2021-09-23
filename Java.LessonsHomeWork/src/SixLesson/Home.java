package SixLesson;
import java.util.Calendar;

public class Home {
    private static int Floors;
    private int yearConstruction;
    private String Name;

    public static void main(String[] args) {
        Home Alfa = new Home();
        Alfa.setName("Alfa");
        Alfa.setFloors(2);
        Alfa.setYearConstruction(2010);

        Home Beta = new Home();
        Beta.setName("Beta");
        Beta.setFloors(5);
        Beta.setYearConstruction(2021);

        System.out.println(Alfa);
        System.out.println(Beta);
    }

    public int getFloors () {
        return Floors;
    }

    public void setFloors ( int Floors){
        this.Floors = Floors;
    }

    public int getYearConstruction () {
        return yearConstruction;
    }

    public void setYearConstruction ( int yearConstruction){
        this.yearConstruction = yearConstruction;
    }


    public int getYearsOld () {
        return Calendar.getInstance().get(Calendar.YEAR) - yearConstruction;
    }

    public String getName () {
        return Name;
    }

    public void setName (String name){
        this.Name = name;
    }

    @Override
    public String toString () {
        return "House{" +
                "Floors=" + Floors +
                ", Year of construction=" + yearConstruction +
                ", Age of the house='" + getYearsOld() + '\'' +
                ", Name of the house='" + Name + '\'' +
                '}';
    }
}

