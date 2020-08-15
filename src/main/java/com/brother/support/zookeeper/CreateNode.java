package com.brother.support.zookeeper;

import org.apache.zookeeper.*;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @Desc
 * @reason liguotao
 * 2020/7/21
 */
public class CreateNode implements Watcher {
    private static CountDownLatch countDownLatch = new CountDownLatch(1);
    private static ZooKeeper zooKeeper = null;
    public static void main(String[] args) throws InterruptedException, IOException, KeeperException {
         zooKeeper = new ZooKeeper("81.70.22.245", 5000, new CreateNode());
        System.out.println(zooKeeper.getState());
        //可以使用计数工具类 CountDownLatch,目的：不让main线程结束到
        countDownLatch.await();
        System.out.println("客户端和服务端的交互真正完成了" + (zooKeeper.getState()));
        createNoteSync();
    }

    /**
     * 创建节点
     */

    private static void createNoteSync() throws KeeperException, InterruptedException {
        /**
         * path ：节点创建的路径
         * data[] ：节点创建要保存的数据，是个byte类型的
         * acl ：节点创建的权限信息(4种类型)
         * ANYONE_ID_UNSAFE : 表示任何⼈
         * AUTH_IDS ：此ID仅可⽤于设置ACL。它将被客户机验证的ID替换
         * OPEN_ACL_UNSAFE ：这是⼀个完全开放的ACL(常⽤)-->
         world:anyone
         * CREATOR_ALL_ACL ：此ACL授予创建者身份验证ID的所有权限
         * createMode ：创建节点的类型(4种类型)
         * PERSISTENT：持久节点
         * PERSISTENT_SEQUENTIAL：持久顺序节点
         * EPHEMERAL：临时节点
         * EPHEMERAL_SEQUENTIAL：临时顺序节点
         String node = zookeeper.create(path,data,acl,createMode);
         */
        //持久节点
        String currNodePath_persite = zooKeeper.create("/big-persistent-02", "big brother persistent".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        //临时节点
        String currNodePath_temp = zooKeeper.create("/big-temp-02", "big brother temp ".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
        //持久顺序节点
        String currNodePath_persite_seq = zooKeeper.create("/big-persistent-seq-02", "big brother persistent seq".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
        System.out.println("创建持久节点"+currNodePath_persite);
        System.out.println("创建临时节点"+currNodePath_temp);
        System.out.println("创建持久顺序节点"+currNodePath_persite_seq);
    }

    @Override
    public void process(WatchedEvent watchedEvent) {
        //SyncConnected
        if (watchedEvent.getState() == Event.KeeperState.SyncConnected) {
            System.out.println("服务器时间回调。。。。");
            //解除主程序countDownLatch的等待阻塞
            countDownLatch.countDown();
        }
    }
}
