package org.palm.hazelcast.config;

import com.hazelcast.config.Config;

public class HazelcastConfigTest2 {

    public static void main(String[] args) {
        HazelcastConfigTest2 test = new HazelcastConfigTest2();
        test.run();
    }

    private void run() {
        Config config = new Config();
        config.setInstanceName("cluster-1");
        config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(true);
        config.getNetworkConfig().getJoin().getMulticastConfig().setMulticastGroup("224.2.2.3")
                .setMulticastPort(54327).setMulticastTimeToLive(32).setMulticastTimeoutSeconds(10);
        config.getNetworkConfig().getInterfaces().setEnabled(true).addInterface("192.168.1.23");
        config.getNetworkConfig().getJoin().getTcpIpConfig().setEnabled(false);
        config.getNetworkConfig().setPort(5900);

        System.out.println("result = " + config);
    }

}
