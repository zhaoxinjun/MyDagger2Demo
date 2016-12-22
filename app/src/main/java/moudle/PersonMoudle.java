package moudle;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 1.类的用途
 * 2.@author:zhaoxinjun
 * 3.@  2016/12/21.
 */
@Module
public class PersonMoudle {
    String name;
    int age;
    public PersonMoudle(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Provides
    String  providesName(){
        return this.name;
    }

    @Provides
    int  providesAge(){
        return this.age;
    }

    @Provides
    @Singleton
    Gson  providesGson(){
        return new Gson();
    }

   //----------------


}
