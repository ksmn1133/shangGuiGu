package day_05;

public class Search {
    public static void main(String[] args) {
        String[] array = new String[]{"aa", "bb", "cc"};
        String str = "aa";

        search(array,str);
    }

    public static void search(String[] array, String string) {
        for(int i =0;i<array.length;i++){
            if(array[i].equals(string)){
                System.out.println("good! "+i);
                break;
            }
        }
    }
}
