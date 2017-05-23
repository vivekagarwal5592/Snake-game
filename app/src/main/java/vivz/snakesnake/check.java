package vivz.snakesnake;

/**
 * Created by user on 15-09-2016.
 */
public class check {

    private Check_for_win listener;
    //Check_for_win listener = new Check_for_win();

    private int value;

    public void setOnIntegerChangeListener(Check_for_win listener) {
        this.listener = listener;
    }

    public int get() {
        return value;
    }



    public void set(int value) {
        this.value = value;

        if (listener != null)
       {
            listener.check(value);
          }
    }


}
