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
    private void set_sharkbite()
    {
        this._fish=this._fish-1;
    }

    public static int main(){
        Water myodds= new Water();
        Inventory myInv= new Inventory();
        int luck = 0;
            if(myodds._odds==1)
            luck=1;
            else
                if(myodds._odds==2)
                   luck=2;
                else
                    if(myodds._odds==3&&myInv._maxsharkatk!=0)
                    {luck=3;
                    myInv.set_sharkbite();
                    myInv._maxsharkatk--;}


        return luck;
    }

}
