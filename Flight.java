import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Flight {
    private Planes airPlane;
    private String pointA;
    private String pointB;
    private String time;
}
