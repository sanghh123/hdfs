package com.atguigu.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
    public class HdfsClient {

        @Test
        public void testMkdirs() throws IOException, URISyntaxException, InterruptedException {

            // 1 获取文件系统
            Configuration configuration = new Configuration();
// FileSystem fs = FileSystem.get(new URI("hdfs://hadoop102:8020"), configuration);
//            FileSystem fs = FileSystem.get(new URI("hdfs://115.236.153.177:36966"), configuration,"youbiyu");
            FileSystem fs = FileSystem.get(new URI("hdfs://172.24.116.140:8020/"), configuration,"youbiyu");
            // 2 创建目录
            fs.mkdirs(new Path("/xiyou/huaguoshan/"));

            // 3 关闭资源
            fs.close();
        }
    }

