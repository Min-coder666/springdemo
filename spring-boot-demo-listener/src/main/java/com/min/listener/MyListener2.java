package com.min.listener;

import com.min.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class MyListener2 implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        myEvent.printMessage("listened by MyListener2");
    }
}
