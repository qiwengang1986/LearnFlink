package com;

import java.sql.Timestamp;

public class Event {
    public String user;
    public String url1;
    public long timestamp;

    public Event(){

    }

    public Event(String user, String url1, long timestamp) {
        this.user = user;
        this.url1 = url1;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Event{" +
                "user='" + user + '\'' +
                ", url1='" + url1 + '\'' +
                ", timestamp='" + new Timestamp(timestamp) + '\'' +
                '}';
    }
}
