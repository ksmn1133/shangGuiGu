package day_13.LazyThread;

/**
 * @author xiaoxia
 * @create 2020/12/1 10:42 上午
 */
public class LazyMan {
    private static LazyMan lazyman = null;

    private LazyMan() {

    }

    public static LazyMan getInstance() {

        show();
        return lazyman;




//        if (lazyman == null) {
//            synchronized (LazyMan.class) {
//                if (lazyman == null) {
//                    lazyman = new LazyMan();
//                }
//            }
//        }
//        return lazyman;
    }
    private synchronized static void show(){
        if(lazyman == null){
            lazyman = new LazyMan();
        }
    }

}
