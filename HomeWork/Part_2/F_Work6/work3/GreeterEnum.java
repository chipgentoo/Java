package HomeWork.Part_2.F_Work6.work3;

public enum GreeterEnum {
    formal("Good evening, sir."),
    casual("Sup bro?"),
    intimate("Hello Darling!");

    private String formality;

    GreeterEnum(String formality) {
        this.formality = formality;
    }

    public String getFormality() {
        return formality;
    }
}
