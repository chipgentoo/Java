package Part_4.Sem_3.repository;

import Part_4.Sem_3.model.Human;

import java.io.FileWriter;
import java.io.IOException;

public class HumanRepository implements PersonRepository<Human>{
    Human human = null;

    @Override
    public void create(Human human) {
        this.human = human;
    }

    @Override
    public void save() throws IOException {

        if (this.human == null) throw new RuntimeException("Нечего сохранять! Human == null");
        String pathFile = this.human.getFamily()+".txt";
        System.out.println("Пишем в файл: " + pathFile);
        String strHuman =
                "<" + this.human.getFamily() + ">" +
                "<" + this.human.getName() + ">" +
                "<" + this.human.getSurname() + ">" +
                "<" + this.human.getBirthdate().toString() + ">" +
                "<" + this.human.getPhone() + ">" +
                "<" + this.human.getSex() + ">\n";

        try(FileWriter humanFW = new FileWriter(pathFile,true); ){
            humanFW.write(strHuman);
            humanFW.flush();
        }
    }
}
