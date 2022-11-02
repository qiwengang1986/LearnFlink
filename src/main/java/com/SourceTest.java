package com;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import javax.sql.DataSource;
import java.util.ArrayList;

public class SourceTest {

    public static void main(String[] args) throws  Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStreamSource<String> stream1 = env.readTextFile("input/Click.txt");
        stream1.print();
        env.execute();


    }
}
