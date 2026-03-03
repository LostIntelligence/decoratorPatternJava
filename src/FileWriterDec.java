public class FileWriterDec extends Decoration{

    public FileWriterDec(Programm inPgr){
        super(inPgr);
    }

    @Override
    public String showPermissions() {
        return pgr.showPermissions() + ", File Writing";
    }
    @Override
    public Integer[] showResourceUsage() {
        // Format: CPU Cycles, RAM, VRAM, STORAGE Read/Write Combined
        Integer required[] = pgr.showResourceUsage();
        required[3] += 20;
        required[1] += 20;
        return required;
    }
}
