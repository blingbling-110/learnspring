package com.qzj.learn;

import org.springframework.context.ApplicationEvent;

public class LogEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public LogEvent(Object source) {
        super(source);
    }
}
