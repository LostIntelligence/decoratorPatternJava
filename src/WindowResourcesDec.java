public class WindowResourcesDec extends Decoration {

    public WindowResourcesDec(Programm inPgr) {
        super(inPgr);
    }

    @Override
    public String showPermissions() {
        return pgr.showPermissions() + ", Display Window";
    }

    @Override
    public Integer[] showResourceUsage() {
        // Format: CPU Cycles, RAM, VRAM, STORAGE Read/Write Combined
        Integer required[] = pgr.showResourceUsage();
        required[2] += 150;
        return required;
    }
}
