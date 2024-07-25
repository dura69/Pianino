package com.example.pianino;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    // Суть крч в том, что на задний фон вставляется картинка, а поверх этой картинки накладываем
    // невидимые кнопки, которые вызывают воспроизведение звука
    // Не забыть перевернуть ориентацию на альбомную
    // Еще тут поменяна иконка, но это не обязательно, мы просто быстро закончили, решил им показать
    // В активити мейне могут быть у них ошибки связанные с тем, что ширина или высота слишком маленькие
    // Это фиксится изменением размера в пикселях
    // И еще может быть ошибка, что на кнопках нет текста, там просто точко в них или пустой символ
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    // при нажатии До
    public void playDo(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.do1); // Создаем объект медиаплеер с файлом ноты
        mediaPlayer.start(); // Воспроизводим его
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            } // Освобождение ресурсов
        });
    }
    // при нажатии Ре
    public void playRe(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.re);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    // при нажатии Ми
    public void playMi(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.mi);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    // при нажатии Фа
    public void playFa(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.fa);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    // при нажатии Соль
    public void playSol(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sol);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    // при нажатии Ля
    public void playLa(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.lya);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    // при нажатии Си
    public void playSi(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.si);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    // при нажатии До высокой
    public void playDoHigh(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.do2);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
}