public abstract class Decoration implements Programm{
    Programm pgr;

    public Decoration(Programm inPgr){
        pgr = inPgr;
    }

    @Override
    public String showPermissions() {
        return pgr.showPermissions();
    }
    @Override
    public Integer[] showResourceUsage() {
        return pgr.showResourceUsage();
    }
}