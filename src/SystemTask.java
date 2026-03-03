public class SystemTask implements Programm{

    @Override
    public String showPermissions() {
        return "Gain Sudo";
    }

     @Override
    public Integer[] showResourceUsage() {
        // Format: CPU Cycles, RAM, VRAM, STORAGE Read/Write Combined
        Integer required[] = { 50, 10, 0, 50 };
        return required;
    }
}
