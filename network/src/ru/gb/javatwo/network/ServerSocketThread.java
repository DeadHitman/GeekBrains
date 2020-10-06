package ru.gb.javatwo.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 2. На серверной стороне сетевого чата реализовать управление потоками через ExecutorService.
 */
public class ServerSocketThread extends Thread {

    private final int port;
    private final int timeout;

    private final ServerSocketThreadListener listener;

    private ExecutorService executorService = Executors.newCachedThreadPool();

    public ServerSocketThread(ServerSocketThreadListener listener, String name, int port, int timeout) {
        super(name);
        this.port = port;
        this.timeout = timeout;
        this.listener = listener;
        start();

        ServerSocketThread sst = this;
        executorService.execute(new Runnable() {

            @Override
            public void run() {
                listener.onServerStart(sst);
                try (ServerSocket server = new ServerSocket(port)) {
                    server.setSoTimeout(timeout);
                    listener.onServerSocketCreated(sst, server);
                    while (!isInterrupted()) {
                        Socket client;
                        try {
                            client = server.accept(); // while (!clientConnected || !timeout) {}
                        } catch (SocketTimeoutException e) {
                            listener.onServerTimeout(sst, server);
                            continue;
                        }
                        listener.onSocketAccepted(sst, server, client);
                    }
                } catch (IOException e) {
                    listener.onServerException(sst, e);
                } finally {
                    listener.onServerStop(sst);
                }
            }
        });
    }
}

