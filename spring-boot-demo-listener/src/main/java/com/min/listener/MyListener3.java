package com.min.listener;

import com.min.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener3 {

    @EventListener
    public void onApplicationEvent(MyEvent myEvent) {
        myEvent.printMessage("listened by MyListener3's method");
    }
}
