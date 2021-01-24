package day_11.dailimoshi;

/**
 * @author xiaoxia
 * @create 2020/11/25 3:12 下午
 * 被代理人Server类
 */
public class Server implements Network{
    @Override
    public void browse() {
        System.out.println("server is browsing the internet");
    }
}
