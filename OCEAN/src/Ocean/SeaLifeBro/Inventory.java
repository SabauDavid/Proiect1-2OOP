package Ocean.SeaLifeBro;

public class Inventory {
    public int _fish=0;
    public int _pearls=0;
    private int _maxsharkatk=3;
    public int get_fish() {
      return _fish;
    }
    public int get_pearls()
    {
        return _pearls;
    }
    public void set_fish(int fish)
    {
        this._fish=fish+1;
    }
    public void set_pearls(int _pearls)
    {
        this._pearls=_pearls+1;
    }
    public void set_sharkbite()
    {
        this._fish=this._fish-1;
        this._maxsharkatk--;
    }

    public static int main(){
        Water myodds= new Water();
        myodds._setodds();
        int luck = 0;
            if(myodds.get_odds()==1)
            luck=1;
            else
                if(myodds.get_odds()==2)
                   luck=2;
                else
                    if(myodds.get_odds()==3)
                        return 3;


        return luck;
    }

}
