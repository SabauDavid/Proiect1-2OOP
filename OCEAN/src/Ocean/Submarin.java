package Ocean;

public class Submarin {

    public int _currentDepth=0;
    protected  int _maxDepth=0;
protected int get_currentDepth()
{
    return _currentDepth;
}
    protected int  _getmaxDepth() {
        return _maxDepth;
    }
    protected void set_maxDepth(int _maxDepth)
    {
        this._maxDepth=_maxDepth;
    }
    public void _deeper(int _currentDepth)
    {

         this._currentDepth=_currentDepth+1;
    }
    public void _undeeper(int _currentDepth)
    {
        this._currentDepth=_currentDepth-1;
    }

        public void _revealDepth (int get_currentDepth,int _maxDepth)
        {
            int flag = 1;
            while (flag != 0) {
                if (get_currentDepth == 0) {
                    System.out.println("\nLa suprafata, e caldut si bine");
                    flag = 0;
                    break;
                }
                else
                    if(get_currentDepth==_getmaxDepth())
                    {
                        System.out.println("Fundul oceanului");
                        flag=0;
                        break;
                    }
                if (get_currentDepth < _getmaxDepth()) {
                    System.out.println("Te aflii la "+Integer.toString(get_currentDepth)+"000 mii de metri adancime");
                    flag = 0;
                    break;
                }
                    break;
                }
            }


    }

