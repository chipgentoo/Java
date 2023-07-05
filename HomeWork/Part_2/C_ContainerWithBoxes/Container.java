package Part_2.C_ContainerWithBoxes;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class Container implements Iterable<Box> {
    private final List<Box> boxList;

    public Container() {
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
}
