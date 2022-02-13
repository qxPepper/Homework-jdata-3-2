package ru.netology.homeworkjdata32.service;

import org.springframework.stereotype.Service;
import ru.netology.homeworkjdata32.repository.MyRepository;

@Service
public class MyService {
    MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public String getProductName(String name) {
        return myRepository.getProductName(name);
    }
}
