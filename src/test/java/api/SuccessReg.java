package api;

public class SuccessReg extends Register {

    public SuccessReg() {

    }

    private Integer id;
    public String token;

    public SuccessReg(int id, String token) {
        super();
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
