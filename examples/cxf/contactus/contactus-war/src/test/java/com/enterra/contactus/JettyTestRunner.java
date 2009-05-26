package com.enterra.contactus;

import org.junit.*;
import org.mortbay.jetty.*;
import org.mortbay.jetty.bio.SocketConnector;
import org.mortbay.jetty.webapp.WebAppContext;

import static org.junit.Assert.*;

@Ignore
public class JettyTestRunner {
    static Server server;

    @BeforeClass
    public static void startJetty() throws Exception {
        server = new Server();
        SocketConnector connector = new SocketConnector();

        // Set some timeout options to make debugging easier.
        connector.setMaxIdleTime(1000 * 60 * 60);
        connector.setSoLingerTime(-1);
        connector.setPort(8282);
        server.setConnectors(new Connector[] { connector });

        WebAppContext bb = new WebAppContext();
        bb.setServer(server);
        bb.setContextPath("/");
        bb.setWar("src/main/webapp");
        server.addHandler(bb);

        System.out.println(">>> STARTING EMBEDDED JETTY SERVER");
        server.start();
    }

    @Test
    public void testname() throws Exception {
        assertTrue(true);
    }
    
    @AfterClass
    public static void stopJetty() throws Exception {
        System.out.println(">>> STOPPING EMBEDDED JETTY SERVER");
        server.stop();
        server.join();

    }
}
