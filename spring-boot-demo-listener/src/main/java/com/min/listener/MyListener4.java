package com.min.listener;

import com.min.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


public class MyListener4 implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        myEvent.printMessage("listened by MyListener4 with yml");
    }
}
