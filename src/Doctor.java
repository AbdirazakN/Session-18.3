import java.time.LocalDate;
import java.time.Month;

public class Doctor extends Person implements PersonAble{
    public Doctor(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }

    @Override
    public void favoriteSport() {
        System.out.println("Tennis");
    }

    @Override
    public String favoriteLanguage() {
        return "Turkish, English";
    }

    @Override
    public Month favoriteMouth() {
        return Month.NOVEMBER;
    }

    @Override
    public String getLastName() {
        return "Junusova";
    }

    @Override
    public LocalDate getDateOfBrith() {
        return LocalDate.of(2004,11,20);
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return "+996 222 02 02 02 "+" junusova11@gmail.com";
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        return new long[0];
    }
}
