package engtelecom.bcd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class ProjetoBcdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoBcdApplication.class, args);
        System.out.println("Operação Finalizada!");
    }
}
