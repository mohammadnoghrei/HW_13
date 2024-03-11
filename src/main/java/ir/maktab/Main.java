package ir.maktab;


import ir.maktab.mockdata.MockData;
import ir.maktab.model.Person;
import ir.maktab.model.PersonSummary;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = MockData.getPeople();

        //p1
//        System.out.println("age >50");
//        List<Person> personListold = personList.stream()
//                .filter(a -> a.getAge() < 50)
//                .toList();
//        personListold.stream().forEach(System.out::println);
//
//        //p2
//        System.out.println("sort user name");
//        List<Person> sortUsername = personList.stream()
//                .sorted((p1, p2) -> p1.getUsername().compareTo(p2.getUsername()))
//                .toList();


        //p3
//        List<Person> sortByAge_Lastname = personList.stream()
//                .sorted((p1, p2) -> p1.getAge().compareTo(p2.getAge()))
//                .sorted((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()))
//                .toList();
//        System.out.println(sortByAge_Lastname.toString());


        //p4
//        List<String> ipv4List = personList.stream()
//                .map(a->a.getIpv4())
//                .toList();
//        System.out.println(ipv4List.toString());


        //p5
//        Map<String,Person> p5= new HashMap<>();
//        personList.stream()
//                .sorted((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()))
//                .filter(a->a.getGender().equals("Female"))
//                .dropWhile(a->a.getFirstName().startsWith("A")) ///////////////************
//                .skip(5)
//                .limit(100)
//                .forEach(a->p5.put(a.getFirstName()+"_"+a.getLastName() ,a));
//
//        System.out.println(p5.toString());


        //p6


//        SimpleDateFormat sdf = new SimpleDateFormat ( "dd/MM/yyyy" );
//
//        List<PersonSummary> personSummaries = personList.stream ()
//                .map ( person -> {
//                    try {
//                        return new PersonSummary (
//                                person.getId (),
//                                person.getFirstName (),
//                                person.getLastName (),
//                                calculateAge ( parseStringToDate ( person.getBirthDate () ) ),
//                                parseStringToDate ( person.getBirthDate () ) );
//                    } catch (Exception e) {
//                        throw new RuntimeException ( e );
//                    }
//                } )
//                .toList ();
//
//
//        List<Person> maleCounter = personList.stream ()
//                .filter ( person -> person.getGender ().equals ( "Male" ) )
//                .toList ();
//
//        int counter = 0;
//        for (PersonSummary person:personSummaries)
//        {
//            counter+=person.getAge ();
//        }
//
//        System.out.println ("The average for male age is :"+(counter/maleCounter.size ()));
//
//        List<Integer> ages = new ArrayList<>();
//
//        for (Person person1 : maleCounter) {
//            ages.add ( person1.getAge () );
//        }
//    }
//
//
//    private static Date parseStringToDate(String dateStr) {
//        Format formatter = new SimpleDateFormat( "dd/MM/yyyy" );
//        Date date = null;
//        try {
//            date = ((SimpleDateFormat) formatter).parse ( dateStr );
//        } catch (ParseException e) {
//            e.printStackTrace ();
//        }
//        return date;
//    }
//
//    public static int calculateAge(Date birthDate) {
//        LocalDate currentDate = LocalDate.now ();
//        LocalDate dateOfBirth = birthDate.toInstant ().atZone ( ZoneId.systemDefault () ).toLocalDate ();
//        Period period = Period.between ( dateOfBirth, currentDate );
//        return period.getYears ();
    }
}
