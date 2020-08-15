package com.brother.support.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @Desc
 * @reason liguotao
 * 2020/7/21
 */
public class CreateSession implements Watcher{

    private static CountDownLatch countDownLatch = new CountDownLatch(1);


    public static void main(String[] args) throws IOException, InterruptedException {
        ZooKeeper zooKeeper = new ZooKeeper("81.70.22.245", 5000, new CreateSession());
        System.out.println(zooKeeper.getState());
        //可以使用计数工具类 CountDownLatch,目的：不让main线程结束到
        countDownLatch.await();
        System.out.println("客户端和服务端的交互真正完成了"+(zooKeeper.getState()));
    }

    /**
     * 回调方法，处理来自服务器端的时间通知（watcher通知）
     * @param watchedEvent
     */
    @Override
    public void process(WatchedEvent watchedEvent) {
        //SyncConnected
        if (watchedEvent.getState() == Event.KeeperState.SyncConnected) {
            //解除主程序countDownLatch的等待阻塞
            countDownLatch.countDown();
        }
    }
}
