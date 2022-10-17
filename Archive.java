import java.util.Vector;
public class Archive {
    Vector <CurrEmotion> emotions= new Vector<CurrEmotion>();

    public void add(CurrEmotion currEmotion) {
        this.emotions.add(currEmotion);
    }
    public void remove_back(){
        this.emotions.remove(emotions.size());
    }
    public String getEmotion(int index){
        return this.emotions.elementAt(index).getName();
    }

}
