import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1.Person деген абстрактный класс тузунуз.
        //Анын полялары :
        //   private int id;
        //   private String fullName;
        //   private byte age;
        //   private char gender;
        //   private String email;
        //   private String phoneNumber;
        //   private double governmentsSalary;
        //2.Person классын мурастаган 3 класс тузунуз.
        //Алар:
        //"Programmer Driver жана Doctor"
        //ар бирине озунчо уникальный поле кошунуздар.
        //3.PersonAble деген интерфейс ачып анын ичине
        //    void favoriteSport();
        //
        //    String favoriteLanguage();
        //
        //    Month favoriteMouth();
        //
        //    String getLastName();
        //
        //    LocalDate getDateOfBrith();
        //
        //    String getPhoneNumberAndEmail();
        //
        //    long[] getPeopleOfAllAges(Person[] people);
        //деген методдорду тузунуз.Жана алардын реализацияларын кылуу учун
        //"Programmer Driver жана Doctor" класстары impiliment кылсын.
        //4.Main класста алардын ар бирине 3 тон обеъкт тузуп жазган логиканыз
        //туура иштедиби текшериниз.

        Person[] people = {
                new Doctor(0033,"Aisha Junusova", (byte) 18,'f',"junusova11@gmail.com","+996 222 02 02 02",55000),
                new Driver(0022,"Bilal Baatyrbek uulu", (byte) 15,'m',"bilal25@gmail.com","+996 700 70 70 70",45000),
                new Programmer(0011,"Azak Nooruzbai uulu", (byte) 20,'m',"jolchuev.00@gmail.com","+996 700 16 45 92",50000)
        };
        System.out.println(Arrays.toString(people));

        for (Person person:people) {
            System.out.println(person);
            System.out.println("Favorite language:  "+person.favoriteLanguage());
            System.out.print("Favorite sport:  ");
            person.favoriteSport();
            System.out.println("Phone number and month:  "+person.getPhoneNumberAndEmail());
            System.out.println("Favorite month:  "+person.favoriteMouth());
            System.out.println("All ages:  "+Arrays.toString(person.getPeopleOfAllAges(people)));
            System.out.println("Last name:  "+person.getLastName());
            System.out.println("Date of birth:  "+person.getDateOfBrith());
        }

    }
}