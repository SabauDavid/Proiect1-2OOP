package Ocean;

public class Submarin {
public int _currentDepth=0;
public int _maxDepth=11;

    public void _deeper(int _currentDepth)
    {
        this._currentDepth=_currentDepth-1;
    }
    public void _undeeper(int _currentDepth)
    {
        this._currentDepth=_currentDepth+1;
    }
    public void _revealDepth(int _currentDepth)
    {
        if(_currentDepth!=0)
        System.out.println("\nTe afli la "+_currentDepth+"000 mii de metri adancime");
        else
            System.out.println("\nLa suprafata, e caldut si bine");
    }


}
