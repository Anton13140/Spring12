package com.example.springHW.facade;

import com.example.springHW.domain.User;
import com.example.springHW.repository.UserRepository;
import com.example.springHW.services.DataProcessingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProcessingFacade {

    private final DataProcessingService service;

    public UserRepository getRepository(){
        return service.getRepository();
    }

    public List<User> sortUsersByAge(List<User> users){
        return service.sortUsersByAge(users);
    }

    public List<User> filterUsersByAge(List<User> users, int age){
        return service.filterUsersByAge(users, age);
    }

    public double calculateAverageAge(List<User> users){
        return service.calculateAverageAge(users);
    }

    public void addUserToList(User user){
        service.addUserToList(user);
    }


}
