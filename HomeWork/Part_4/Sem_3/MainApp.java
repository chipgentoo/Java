package HomeWork.Part_4.Sem_3;

import HomeWork.Part_4.Sem_3.controller.HumanController;
import HomeWork.Part_4.Sem_3.model.Human;
import HomeWork.Part_4.Sem_3.repository.HumanRepository;
import HomeWork.Part_4.Sem_3.service.HumanService;
import HomeWork.Part_4.Sem_3.view.HumanView;

import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    protected static HumanRepository humanRepository;
    protected static HumanService humanService;
    protected static HumanController humanController;

    private static HumanView getHumanController(){
        humanRepository = new HumanRepository();
        humanService = new HumanService(humanRepository);
        humanController = new HumanController(humanService);
        return new HumanView(humanController);
    }

    public void start(){
        HumanView humanView = getHumanController();
        System.out.println("Введите параметры человека");
        System.out.print("(Фамилия Имя Отчество ДатаРождения Телефон Пол)\n=->");
        Scanner scanner = new Scanner(System.in);
        String strHuman = scanner.nextLine();
        if(humanView.checkNumberParams(strHuman)){
            System.out.println("Params is Good");
            try {
                Human human = humanView.validationHumanString(strHuman.split(" "));
                humanView.create(human);
                humanView.save();
            } catch (IOException e) {
                System.out.println("Ошибка записи: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Не верное указание пола: " + e.getMessage());
            }
        } else {
            System.out.println("Кол-во параметров не соответствует");
        }
    }
}
