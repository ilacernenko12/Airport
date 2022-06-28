import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Planes {
    private String model;
    private String number;
    private int seets;
}
