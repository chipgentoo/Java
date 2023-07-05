package HomeWork.Part_2.C_ContainerWithBoxes;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class Container implements Iterable<Box>, Comparable<Container> {
    private final List<Box> boxList;

    public String containerName;
    public Container(String contName) {
        this.containerName = contName;
        boxList = new ArrayList<>();
    }
    public int getWeight(){
        int contWeight = 0;
        if (boxList.size() == 0) return contWeight; // на <= ругается.
        for (Box box : boxList) {
            contWeight += box.getWeight();
        }
        return contWeight;
    }

    public void addBox(Box box){
        boxList.add(box);
    }

    @Override
    public Iterator<Box> iterator() {
        return new ContainerIterator(boxList);
    }

    @Override
    public int compareTo(Container o) {
        return Integer.compare(this.getWeight(), o.getWeight());
    }
}
