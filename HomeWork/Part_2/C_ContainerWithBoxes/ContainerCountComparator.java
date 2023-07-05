package HomeWork.Part_2.C_ContainerWithBoxes;

import java.util.Comparator;

public class ContainerCountComparator implements Comparator<Container> {

    @Override
    public int compare(Container o1, Container o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}
