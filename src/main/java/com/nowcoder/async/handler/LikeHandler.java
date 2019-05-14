package com.nowcoder.async.handler;

import com.nowcoder.async.EventHandle;
import com.nowcoder.async.EventModel;
import com.nowcoder.async.EventType;

import java.util.Arrays;
import java.util.List;

public class LikeHandler implements EventHandle {

    @Override
    public void doHandle(EventModel eventModel) {
        System.out.println("LIKE");
    }

    @Override
    public List<EventType> getSupportEventTypes() {
        return Arrays.asList(EventType.LIKE);
    }
}
