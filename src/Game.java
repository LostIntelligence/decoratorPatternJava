public class Game implements Programm {

    @Override
    public String showPermissions() {
        return "Use NVENC";

    }

    @Override
    public Integer[] showResourceUsage() {
        // Format: CPU Cycles, RAM, VRAM, STORAGE Read/Write Combined
        Integer required[] = { 20, 500, 100, 20 };
        return required;
    }

}
