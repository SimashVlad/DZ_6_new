import java.util.ArrayList;
import java.util.List;

public class NotebookService {

    public List<NoteBook> methodFindAndWriteFilteringValue(List<NoteBook> list, String field, String value) { // данный метод выводит отфильтрованные строки
        List<NoteBook> fList = new ArrayList<>();
        for (NoteBook notebook : list) {
            switch (field) {
                case "id":
                    if (notebook.getId().equals(value)) {
                        fList.add(notebook);
                    }
                    break;

                case "model":
                    if (notebook.getModel().equals(value)) {
                        fList.add(notebook);
                    }
                    break;

                case "memory":
                    if (notebook.getMemory().equals(Memory.valueOf(value))) {
                        fList.add(notebook);
                    }
                    break;


                case "ssd":
                    if (notebook.getSsd().equals(value)) {
                        fList.add(notebook);
                    }
                    break;
            }
        }

        return fList;
    }





    public List<NoteBook> getAsusNotebooks(List<NoteBook> list){
        List<NoteBook> fList = new ArrayList<>();
        for (NoteBook notebook : list) {
            if(notebook.getModel().equals("Asus")){
                fList.add(notebook);
            }
        }
        return fList;
    }
}
