package HomeWork.Part_2.C_ContainerWithBoxes;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ContainerIterator implements Iterator<Box> {
    private final List<Box> boxList;
    private int curPosition;
    private int lastPosition;

    public ContainerIterator(List<Box> boxList) {
        this.boxList = boxList;
    }

    @Override
    public boolean hasNext() {
        return curPosition < boxList.size();
    }

    @Override
    public Box next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        lastPosition = curPosition + 1;
        return boxList.get(curPosition++);
    }

    @Override
    public void remove() {
        if (curPosition <= 0 || lastPosition == -1){
            throw new IllegalStateException();
        }
        boxList.remove(--curPosition);
        lastPosition = -1;
    }
}
