package patrones_estructurales.composite.composite_laboratory;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    private String name;
    private List<FileComponent> files = new ArrayList<>();

    public Folder (String name){
        this.name = name;
    }

    public void addFile(File file){
        files.add(file);
    }

    public void removeFile(File file){
        files.remove(file);
    }


    public void addFolder(Folder folder){
        files.add(folder);
    }
    public void removeFolder(Folder folder){
        files.remove(folder);
    }

    /* Este método imprimirá el nombre de la carpeta y luego recorrerá todos los FileComponent en la lista files, llamando
     a showDetails en cada uno. Si un FileComponent es una carpeta, su método showDetails también se llamará, lo que permitirá
      mostrar recursivamente todos los archivos y carpetas contenidos. Tambièn utiliza recursividad */
    @Override
    public void showDetails() {
        System.out.println("Folder name: " + name);
        for(FileComponent fil : files){
            fil.showDetails();
        }
    }
}
