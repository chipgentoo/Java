package Part_4.Sem_3.view;

import Part_4.Sem_3.controller.PersonController;
import Part_4.Sem_3.model.Human;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HumanView implements PersonView<Human>{
    private final PersonController<Human> humanController;

    public HumanView(PersonController<Human> humanController) {
        this.humanController = humanController;
    }

    @Override
    public void create(Human human) {
        humanController.create(human);
    }

    @Override
    public void save() throws IOException {
        humanController.save();
    }

    @Override
    public boolean checkNumberParams(String strHuman) {
        String[] params = strHuman.split(" ");
        return params.length == 6;
    }

    @Override
    public Human validationHumanString(String[] params) throws Exception {

        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());

        String family = params[0];
        String name = params[1];
        String surname = params[2];
        Date birthdate = null;
        Character sex = null;
        try {
            birthdate = formatter.parse(params[3]);
        }catch (ParseException e){
            System.out.println("Ошибка формата даты:" + e.getMessage());
        }
        Long phone = Long.getLong(params[4]);
        if (params[5].length()==1 && (params[5].charAt(0)=='f' || params[5].charAt(0)=='m')){
            sex = params[5].charAt(0);
        } else {
            throw new Exception("Требуется f или m.");
        }

        return new Human( family, name, surname, birthdate, phone, sex);
    }
}
