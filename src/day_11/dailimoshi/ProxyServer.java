package day_11.dailimoshi;

/**
 * @author xiaoxia
 * @create 2020/11/25 3:14 下午
 */
public class ProxyServer implements Network {

    Network network;

    @Override
    public void browse() {
        check();
        network.browse();
        System.out.println("done!");
    }

    public void check() {
        System.out.println("security check is done!");
    }

    public ProxyServer(Network network) {
        this.network = network;
    }

}
