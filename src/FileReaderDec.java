public class FileReaderDec extends Decoration{

    public FileReaderDec(Programm inPgr){
        super(inPgr);
    }

    @Override
    public String showPermissions() {
        return pgr.showPermissions() + ", File Reading";
    }
    @Override
    public Integer[] showResourceUsage() {
        // Format: CPU Cycles, RAM, VRAM, STORAGE Read/Write Combined
        Integer required[] = pgr.showResourceUsage();
        required[3] += 20;
        return required;
    }
}
