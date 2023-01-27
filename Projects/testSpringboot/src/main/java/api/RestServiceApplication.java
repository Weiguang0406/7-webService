package api;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@AllArgsConstructor
public class RestServiceApplication {
    public void main(String[] args){
        SpringApplication.run(RestServiceApplication.class, args);
    }
}
