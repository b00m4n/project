package com.fcn.egsofdest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends Activity {
    private String[] answers;
            TextView Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout); //кидаем макет на экран
        answers = getResources().getStringArray(R.array.Answers); // Присвоили переменной массив из ресурсов
        Text=(TextView)findViewById(R.id.txtanser);//Нашли обьект на нашем макете
    }

    public void Begin(View view){
        int num = 0;
        Random rnd = new Random();//рандомим ответ
        num = rnd.nextInt(17);
        Text.setText(answers[num]);//кидаем результат в TextView

    }
}
