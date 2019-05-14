package com.nowcoder.async;

import java.util.List;

public interface EventHandle {
    void doHandle(EventModel eventModel);
    List<EventType> getSupportEventTypes();
}
