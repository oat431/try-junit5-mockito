package oat.tryaspectj.config;

import oat.tryaspectj.entity.Student;
import oat.tryaspectj.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        studentRepository.save(
                Student.builder()
                        .studentId("5006")
                        .firstname("Tar")
                        .lastname("SK-man")
                        .build()
        );
        studentRepository.save(
                Student.builder()
                        .studentId("5010")
                        .firstname("Tle")
                        .lastname("Vector")
                        .build()
        );
        studentRepository.save(
                Student.builder()
                        .studentId("5011")
                        .firstname("DJ")
                        .lastname("LnRabbit")
                        .build()
        );
        studentRepository.save(
                Student.builder()
                        .studentId("5017")
                        .firstname("Pun")
                        .lastname("Donut")
                        .build()
        );
        studentRepository.save(
                Student.builder()
                        .studentId("5018")
                        .firstname("Teem")
                        .lastname("Bonk")
                        .build()
        );
        studentRepository.save(
                Student.builder()
                        .studentId("5023")
                        .firstname("Plunk")
                        .lastname("Pisuo")
                        .build()
        );
        studentRepository.save(
                Student.builder()
                        .studentId("5026")
                        .firstname("Fax")
                        .lastname("Domdae")
                        .build()
        );
        studentRepository.save(
                Student.builder()
                        .studentId("5028")
                        .firstname("Kong")
                        .lastname("Pazum")
                        .build()
        );
        studentRepository.save(
                Student.builder()
                        .studentId("5039")
                        .firstname("Oat")
                        .lastname("Oralita")
                        .build()
        );
    }
}
