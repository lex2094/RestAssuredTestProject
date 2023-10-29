package in.regres.api.registration;

public class UnSuccessReg  {

    public UnSuccessReg() {
        // Конструктор по умолчанию
    }


    private String error;

    public UnSuccessReg(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
