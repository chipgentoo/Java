package HomeWork.Part_2.C_ContainerWithBoxes;

import lombok.Value;

@Value
public class Box implements Comparable<Box> {

    private final Long id;
    private Integer weight;
    private String boxName;

    @Override
    public int compareTo(Box o) {
        return (int) (id - o.id);
        //return Integer.compare(this.weight,o.weight);
    }
}
