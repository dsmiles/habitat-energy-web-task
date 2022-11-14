package datatypes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MapValue {
    private String dataCode;
    private String transform;
    private String price;
}
