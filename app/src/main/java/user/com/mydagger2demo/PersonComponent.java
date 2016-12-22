package user.com.mydagger2demo;

import javax.inject.Singleton;

import dagger.Component;
import moudle.PersonMoudle;

/**
 * 1.类的用途
 * 2.@author:zhaoxinjun
 * 3.@  2016/12/21.(modules = {PersonModule.class})
 */
@Singleton
@Component(modules = PersonMoudle.class)
public interface PersonComponent {

    void inject(MainActivity mainActivity);
}
