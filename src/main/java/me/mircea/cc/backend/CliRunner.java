package me.mircea.cc.backend;

import lombok.RequiredArgsConstructor;
import me.mircea.cc.backend.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("disabled")
@Component
@RequiredArgsConstructor
public class CliRunner implements CommandLineRunner {
    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
//        userRepository.deleteAll();
    }
}
