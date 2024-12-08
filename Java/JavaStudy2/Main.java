import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("R");
        list.add("Y");
        list.add("O");
        list.add("T");
        list.add("A");
        for(String str : list){
            if ("R".equals(str)){
                list.remove(str);
            }
        }
        for(String str : list){
            System.out.println(str);
        }
    }
}