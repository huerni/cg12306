package org.huerni.cg12306.framework.starter.bases.init;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

import java.util.concurrent.atomic.AtomicBoolean;

@RequiredArgsConstructor
public class ApplicationContentPostProcessor implements ApplicationListener<ApplicationReadyEvent> {

    private final ApplicationContext applicationContext;

    private final AtomicBoolean executeOnlyOnce = new AtomicBoolean(false);

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        if(!executeOnlyOnce.compareAndSet(false, true)) {
            return ;
        }

        applicationContext.publishEvent(new ApplicationInitializingEvent(this));
    }
}
