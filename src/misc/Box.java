package misc;

/**
 * Created by Jack on 09.11.2014.
 */
public class Box {
    int i, j, k;
    public Box(){
        i = j = k = 1;
    }

    @Override
    public String toString() {
        return "i=" + i + ", j=" + j + ", k=" + k;
    }
}
