package Part_2.C_ContainerWithBoxes;

import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addBox(new Box(4L,24,"box 4"));
        container.addBox(new Box(2L,11,"box 2"));
        container.addBox(new Box(5L,52,"box 5"));
        container.addBox(new Box(3L,37,"box 3"));
        container.addBox(new Box(1L,49,"box 1"));

        var boxes = container.getBoxList();

        //boxes.sort(Comparator.reverseOrder());
        //System.out.println(boxes);

//        for (Box box : container) {
//            System.out.println(box);
//        }

        Iterator<Box> boxIterator = container.iterator();
        while (boxIterator.hasNext()){
            Box box = boxIterator.next();
            System.out.printf("ID:%s\tWeigth:%s\tName:%s%n", box.getId(),box.getWeight(),box.getBoxName());
            if(box.getBoxName().equals("box 2")) {
                boxIterator.remove();
            }
        }
        for (Box box : container) {
            System.out.println(box);
        }
    }
}