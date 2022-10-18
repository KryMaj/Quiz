package com.projektquizu.quiz;

import com.projektquizu.quiz.database.entities.PlayerEntity;
import com.projektquizu.quiz.database.repositories.PlayerRepository;
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
    private PlayerRepository playerRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        log.info("Executing startup actions...");

        playerRepository.save(new PlayerEntity("Krystian"));
        playerRepository.save(new PlayerEntity("Karol"));
        playerRepository.save(new PlayerEntity("Majda"));


log.info("List of players from database: ");


        List<PlayerEntity> playerEntities = playerRepository.findAll();

        for (PlayerEntity players: playerEntities) {
            log.info("Player from DB: " + players);

        }

    }

}
