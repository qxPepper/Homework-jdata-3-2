package ru.netology.homeworkjdata43;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.homeworkjdata43.entity.Contact;
import ru.netology.homeworkjdata43.entity.Persons;
import ru.netology.homeworkjdata43.repository.MyRepository;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootApplication
public class HomeworkJdata43Application implements CommandLineRunner {
    @Autowired
    private MyRepository myRepository;

    public static void main(String[] args) {
        SpringApplication.run(HomeworkJdata43Application.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        var names = List.of("Ivan", "Vasiliy", "Sidor", "Alexey");
        var surnames = List.of("Ivanov", "Pupkin", "Kuzmin", "Yagudin");
        var ages = List.of(24, 31, 16, 42);
        var phoneNumbers = List.of("495-1234567", "49-1234567", "495-7778899", "777-7777777");
        var cityOfLivings = List.of("Moscow", "Colonge", "Moscow", "NewVasyuki");

        IntStream.range(0, names.size())
                .forEach(i -> {
                    var person = Persons.builder()
                            .contact(Contact.builder()
                                    .age(ages.get(i))
                                    .name(names.get(i))
                                    .surname(surnames.get(i))
                                    .build())
                            .cityOfLiving(cityOfLivings.get(i))
                            .phoneNumber(phoneNumbers.get(i))
                            .build();

                    myRepository.getEntityManager().persist(person);
                });
    }
}
