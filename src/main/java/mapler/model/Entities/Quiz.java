package mapler.model.Entities;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Quiz {
    private Integer id;
    private String question;
    private List<String> answers;
    private String correct;
    private String link;
    private String image;
}
