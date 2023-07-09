package HomeWork.Part_2.C_ContainerWithBoxes;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Container container1 = new Container("Контейнер 1");
        container1.addBox(new Box(4L,24,"box 4"));
        container1.addBox(new Box(2L,11,"box 2"));
        container1.addBox(new Box(5L,52,"box 5"));
        container1.addBox(new Box(3L,37,"box 3"));
        container1.addBox(new Box(1L,49,"box 1"));

        var boxes1 = container1.getBoxList();

        Container container2 = new Container("Контейнер 2");
        container2.addBox(new Box(9L,33,"box 9"));
        container2.addBox(new Box(6L,25,"box 6"));
        container2.addBox(new Box(8L,12,"box 8"));
        container2.addBox(new Box(7L,71,"box 7"));
        container2.addBox(new Box(0L,93,"box 0"));

        var boxes2 = container2.getBoxList();


        //boxes1.sort(Comparator.naturalOrder());
        System.out.println(boxes1);
        //boxes2.sort(Comparator.naturalOrder());
        System.out.println(boxes2);

        for (Box box : boxes1) {
            System.out.println(box);
        }
        System.out.printf("Общий вес контейнера: %s%n", container1.getWeight());

        Iterator<Box> boxIterator = container1.iterator();
        while (boxIterator.hasNext()){
            Box box = boxIterator.next();
            //System.out.printf("ID:%s\tWeigh:%s\tName:%s%n", box.getId(),box.getWeight(),box.getBoxName());
            if(box.getBoxName().equals("box 2")) {
                boxIterator.remove();
                System.out.println("Удалили box 2");
            }
        }
        for (Box box : boxes1) {
            System.out.println(box);
        }
        System.out.printf("Общий вес контейнера 1: %s%n", container1.getWeight());
        System.out.printf("Общий вес контейнера 2: %s%n", container2.getWeight());

        // Сравнение контейнеров
        //System.out.println(container1.compareTo(container2));
        switch (container1.compareTo(container2)) {
            case -1 -> System.out.println(container1.containerName + " весит меньше чем " + container2.getContainerName());
            case 0 ->  System.out.println("Вес контейнеров одинаковый");
            case 1 ->  System.out.println(container1.containerName + " весит больше чем " + container2.getContainerName());
        }

    }
}
