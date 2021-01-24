package day_15;

/**
 * @author xiaoxia
 * @create 2020/12/9 4:22 下午
 */
public enum Color implements Runnable{
    /**
     *
     */
    black{
        @Override
        public void run() {
            System.out.println("run black");
        }
    },

    white{
        @Override
        public void run() {
            System.out.println("run white");
        }
    },

    green{
        @Override
        public void run() {
            System.out.println("run green");
        }
    },

    red{
        @Override
        public void run() {
            System.out.println("run red");
        }
    };

    private Color() {

    }



}
