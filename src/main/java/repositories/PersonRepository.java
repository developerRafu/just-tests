package repositories;

import models.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import static utils.NamesBuilder.*;

public class PersonRepository {

    public static Optional<Person> findById(Long id) {
        return Optional.of(getPerson());
    }

    public static List<Person> findAll() {
        return List.of(getPeople());
    }

    private static Person getPerson() {
        Person person = new Person();
        person.setId(1L);
        person.setAge(22);
        person.setName("Rafu Henri");
        person.setBirthday(LocalDate.of(2000, 1, 14));
        return person;
    }

    private static Person[] getPeople() {
        int anyNames = names.length;
        Person[] people = new Person[anyNames];
        Random random = new Random();
        for (int i = 0; i < anyNames; i++) {
            Person person = new Person();
            person.setName(names[i]);
            person.setId(Long.valueOf(i));
            person.setAge(random.nextInt(150));
            person.setBirthday(getBirthDayFromAge(person.getAge()));
            people[i] = person;
        }
        return people;
    }

    private static LocalDate getBirthDayFromAge(Integer age) {
        return LocalDate.now().minusYears(age);
    }
}
