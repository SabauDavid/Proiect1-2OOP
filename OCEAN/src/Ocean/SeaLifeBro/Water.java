package Ocean.SeaLifeBro;

import java.util.Random;
public class Water {
    protected int _odds;
    Random rnd=new Random();
    public void _setodds()
    {
        _odds=1+rnd.nextInt(2);
    }
    public int _returnodds(int _odds)
    {
        return _odds;
    }

    protected int get_odds() {
        return _odds;
    }
}
