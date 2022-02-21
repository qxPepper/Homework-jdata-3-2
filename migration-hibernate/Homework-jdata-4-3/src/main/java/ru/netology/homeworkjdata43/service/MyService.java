package ru.netology.homeworkjdata43.service;

import org.springframework.stereotype.Service;
import ru.netology.homeworkjdata43.repository.MyRepository;

import java.util.List;

@Service
public class MyService {
    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public List<String> getPersonsByCity(String city) {
        return myRepository.getPersonsByCity(city);
    }
}
