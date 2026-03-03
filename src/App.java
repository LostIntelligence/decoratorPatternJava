public class App {
    public static void main(String[] args) throws Exception {



        Programm systemTask = new SystemTask();
        System.out.println(systemTask.showPermissions());
        systemTask = new FileReaderDec(systemTask);
        System.out.println(systemTask.showPermissions());
        
        Programm game = new Game();
        System.out.println(game.showPermissions());
        game = new FileReaderDec(game);
        game = new FileWriterDec(game);
        System.out.println(game.showPermissions());
        game = new WindowResourcesDec(game);
        System.out.printf(formatUsage(game.showResourceUsage()));

    }
    public static String formatUsage(Integer[] usage){
        return  "\n\nResource usage:\n"
                + "CPU Cycles: " + usage[0] + "\n"
                + "RAM: " + usage[1] + " MB\n"
                + "VRAM: " + usage[2] + " MB\n"
                + "Storage I/O: " + usage[3] + " MB/s";
    }
}
