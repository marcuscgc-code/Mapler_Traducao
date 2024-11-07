package mapler.repositories;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import mapler.model.Entities.*;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Repository
public class QuizRepository {
    public List<Quiz> findAll(String nomeArquivo) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Carregar o arquivo JSON do classpath
            ClassPathResource resource = new ClassPathResource(nomeArquivo);
            File file = resource.getFile();

            // Ler o arquivo JSON e mapeá-lo para a classe Pessoa
           return objectMapper.readValue(file,
                    new TypeReference<>() {
                    }
            );

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
