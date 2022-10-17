import java.util.Date;
public class CurrEmotion {
    String name;
    Date time;

    CurrEmotion(String name){
        this.name = name;
        DateTime tmp=new DateTime();
        this.time = tmp.getDate();
    }
    public String getName(){
        return this.name;
    }
}
