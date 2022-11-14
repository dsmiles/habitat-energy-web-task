package datatypes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MapPolygon {
    private Boolean hasValue;
    private String dataCode;
    private String points;
}
