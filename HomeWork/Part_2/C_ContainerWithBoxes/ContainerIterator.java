package Part_2.C_ContainerWithBoxes;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ContainerIterator implements Iterator<Box> {
    private final List<Box> boxList;
    private int curPoint;
    private int lastPosition;

    public ContainerIterator(List<Box> boxList) {
        this.boxList = boxList;
    }

    @Override
    public boolean hasNext() {
        return curPoint < boxList.size();
    }

    @Override
    public Box next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        lastPosition = curPoint + 1;
        return boxList.get(curPoint++);
    }

    @Override
    public void remove() {
        if (curPoint <= 0 || lastPosition == -1){
            throw new IllegalStateException();
        }
        boxList.remove(--curPoint);
        lastPosition = -1;
    }
}
