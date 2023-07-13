public class Quiz{
    public static void main(String[] args) {
        student S1 = new student(65025929, "p", 2022, 2.6);
        S1.showDetails();
    }
}

class student {
    private int ID;
    private String Name;
    private int admissionYear;
    private double GPA;

    public student(int ID, String Name, int admissionYear, double GPA) {
        this.ID = ID;
        this.Name = Name;
        this.admissionYear = admissionYear;
        this.GPA = GPA;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public double getGPA() {
        return GPA;
    }

    public void showDetails() {
        System.out.println("ID : " + this.ID);
        System.out.println("Name : " + this.Name);
        System.out.println("admissionYear : " + this.admissionYear);
        System.out.println("GPA : " + this.GPA);
    }
}