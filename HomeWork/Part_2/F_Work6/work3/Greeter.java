package HomeWork.Part_2.F_Work6.work3;

public class Greeter {
    private String formality;

    public String greet() {
        return GreeterEnum.valueOf(formality).getFormality();
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}

