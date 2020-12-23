package com.next.volvoapp3.di.component;

import com.next.volvoapp3.DaggerActivity;
import com.next.volvoapp3.di.module.SharedPrefModule;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {SharedPrefModule.class})
public interface MyComponent {
    void inject(DaggerActivity activity);
}

