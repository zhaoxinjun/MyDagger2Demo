package user.com.mydagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import moudle.PersonMoudle;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Person person;
    @Inject
    public Person person1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  DaggerPersonComponent.create().inject(this);
        DaggerPersonComponent.builder()
                .personMoudle(new PersonMoudle("张三",11))
                .build()
                .inject(this);

        Log.e("-----",person.toString());
        Log.e("-----",person1.toString());
        Log.e("11111", person.gson.equals(person1.gson)+"" );
    }

}
