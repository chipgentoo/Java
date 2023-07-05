package HomeWork.Part_2.C_ContainerWithBoxes;

import java.util.Comparator;

public class BoxComparator implements Comparator<Box>{
    @Override
    public int compare(Box o1, Box o2) {
        String boxName1 = o1.getBoxName().split("\\s+")[1];
        String boxName2 = o2.getBoxName().split("\\s+")[1];
        return  boxName1.compareTo(boxName2);
    }
}
