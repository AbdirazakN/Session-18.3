import java.time.LocalDate;
import java.time.Month;

public class Programmer extends Person implements PersonAble{
    public Programmer(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }

    @Override
    public void favoriteSport() {
        System.out.println("Taekwondo");
    }

    @Override
    public String favoriteLanguage() {
        return "Kyrgyz, Arabic";
    }

    @Override
    public Month favoriteMouth() {
        return Month.JANUARY;
    }

    @Override
    public String getLastName() {
        return "Nooruzbai uulu";
    }

    @Override
    public LocalDate getDateOfBrith() {
        return LocalDate.of(2001,1,9);
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return "+996 700 162 592 "+" Jolchueva.0@gmail.com";
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        for (int i = 0; i < people.length; i++){
            return new long[i];
        }
        return new long[people.length];
    }
}
