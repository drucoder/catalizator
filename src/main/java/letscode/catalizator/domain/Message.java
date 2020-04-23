package letscode.catalizator.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class Message {
    @Id
    private Long id;
    private String data;

    public Message(String data) {
        this.data = data;
    }
}
