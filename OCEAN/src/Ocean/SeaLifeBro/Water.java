package Ocean.SeaLifeBro;

import java.util.Random;
public class Water {
    protected int _odds;
    Random rnd=new Random();
    public void _odds(int _odds)
    {
        _odds=rnd.nextInt(3);
    }
    public int _returnodds(int _odds)
    {
        return _odds;
    }




}
