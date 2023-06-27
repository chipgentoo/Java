package lesson1.practic;

import lombok.*;

import java.util.Objects;

/*@Getter
@Setter
@EqualsAndHashCode
@ToString
*/
@Data
@AllArgsConstructor
public abstract class Fruit {
    private Long id;
    protected int cost;
    protected String color;
}