import java.time.LocalDate;
import java.time.Month;

public class Driver extends Person implements PersonAble{
    public Driver(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }

    @Override
    public void favoriteSport() {
        System.out.println("Football");
    }

    @Override
    public String favoriteLanguage() {
        return "Only Kyrgyz language";
    }

    @Override
    public Month favoriteMouth() {
        return Month.MARCH;
    }

    @Override
    public String getLastName() {
        return "Baatyrbek uulu";
    }

    @Override
    public LocalDate getDateOfBrith() {
        return LocalDate.of(2007,3,26);
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return "+996 500 500 500 "+" bilal07@gmail.com";
    }

    @Override
    public byte[] getPeopleOfAllAges(Person[] people) {
        return new byte[]{getAge()};
    }
}
