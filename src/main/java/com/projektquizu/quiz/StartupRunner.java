package com.projektquizu.quiz;

import com.projektquizu.quiz.database.entities.PlayerEntity;
import com.projektquizu.quiz.database.repositories.PlayerRepository;
import com.projektquizu.quiz.service.QuizDataService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import javax.transaction.Transactional;
import java.util.List;

@Component
@Log
public class StartupRunner implements CommandLineRunner {

    @Autowired
   private QuizDataService quizDataService;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        log.info("Executing startup actions...");
        quizDataService.getQuizCategories();

    }

}
