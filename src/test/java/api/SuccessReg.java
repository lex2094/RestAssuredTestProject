package api;

public class SuccessReg {

    public SuccessReg() {
        // Конструктор по умолчанию
    }

    private Integer id;
    public String token;

    public SuccessReg(int id, String token) {
        this.id = id;
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public String getToken() {
        return token;
    }
}
