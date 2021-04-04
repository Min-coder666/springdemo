package com.min.event;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }

    public void printMessage(String meg){
        System.out.println("该事件被触发,meg:"+meg);
    }
}
