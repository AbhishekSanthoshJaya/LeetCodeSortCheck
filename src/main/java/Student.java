import java.time.LocalDate;

enum Gender {
    MALE,
    FEMALE,
    OTHER
}
public class Student {
    int studentId;
    String firstName;
    String lastName;
    LocalDate birthDate;
    Gender gender;
    float total;

    public void setData(int studentId,
            String firstName,
            String lastName,
            LocalDate birthDate,
            Gender gender,
            float total){
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName =  lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.total= total;
    }

    public void getData(){
        System.out.println("Student id: " + studentId);
        System.out.println("First Name " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birthdate: " + birthDate);
        System.out.println("Gender: " + gender);
        System.out.println("Total Marks: " + total);
    }

}
