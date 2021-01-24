package day_11.dailimoshi;

/**
 * @author xiaoxia
 * @create 2020/11/25 3:10 下午
 */
public class NetworkTest {
    public static void main(String[] args) {
        ProxyServer proxyServer = new ProxyServer(new Server());
        proxyServer.browse();
    }
}
