package api;

public class UserTimeResponse extends UserTime {

    public UserTimeResponse(){
    }

    private String updatedAt;

    public UserTimeResponse(String name, String job,String updatedAt) {
        super(name,job);
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
