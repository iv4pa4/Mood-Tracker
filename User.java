public class User {
    private String name;
    private String password;
    private Archive emotion_archive=new Archive();

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return this.name;
    }
    public String getPassword() {
        return this.password;
    }

    public Archive getArchive(){
        return this.emotion_archive;
    }
}
