package Part_2.C_ContainerWithBoxes;

import java.util.Comparator;
import java.util.List;

public class BoxCompatator implements Comparator<Box>{
    @Override
    public int compare(Box o1, Box o2) {
        String boxName1 = o1.getBoxName().split("\\s+")[1];
        String boxName2 = o2.getBoxName().split("\\s+")[1];
        return  boxName1.compareTo(boxName2);
    }
}
