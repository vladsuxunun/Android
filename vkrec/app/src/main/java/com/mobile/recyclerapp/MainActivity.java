package com.mobile.recyclerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private NewsListAdapter adapter;

    private NewsListAdapter.ItemClickListener listener = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listener = new NewsListAdapter.ItemClickListener() {
            @Override

            public void itemClick(int position, News item) {
                Intent intent = new Intent(MainActivity.this, NewsDetailActivity.class);
                intent.putExtra("news", item);
                startActivity(intent);

            }
        };

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new NewsListAdapter(newsGenerator(), listener);
        recyclerView.setAdapter(adapter);
    }
    public void showToast(View view) {
        //создаём и отображаем текстовое уведомление
        Toast toast = Toast.makeText(this, "you liked",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0,160);
        toast.show();

    }

    private List<News> newsGenerator() {
        String loremIpsum = "Fuck U";
        List<News> items = new ArrayList<>();

            News news = new News(
                    "Бекырыс Исаев",
                    "17 янв 17:51",
                    loremIpsum,
                    "5K" ,
                    67,
                    69,
                    0,"1");

            items.add(news);


            News news1 = new News(
                    "Адильжан Ануар",
                    "18 февраля 21:00",
                    "",
                    "23" ,
                    67,
                    34,
                    34,"2"
            );
            items.add(news1);
        News news2 = new News(
                "Байшоланов Алихан",
                "19 февраля 14:00",
                "",
                "26" ,
                39,
                41,
                34,
                "3"
        );
        items.add(news2);
        News news3 = new News(
                "Усюкин Никита",
                "23 февраля 14:00",
                "",
                "29" ,
                32,
                12,
                39,"4"
        );
        items.add(news3);
        News news4 = new News(
                "Омарова Дана",
                "18 января 6:00",
                "",
                "29" ,
                3867,
                12,
                39,"5"
        );
        items.add(news4);
        News news5 = new News(
                "Сафаров Руслан",
                "1 февраля 19:00",
                "",
                "29" ,
                32,
                12,
                39,"6"
        );
        items.add(news5);
        News news6 = new News(
                "Павел Дуров",
                "1 февраля 19:00",
                "",
                "29" ,
                32,
                12,
                39,"7"
        );
        items.add(news6);
        News news7 = new News(
                "Пабло Пикассо",
                "1 февраля 19:00",
                "",
                "29" ,
                32,
                12,
                39,"8"
        );
        items.add(news7);
        News news8 = new News(
                "Askar Akshabayev",
                "23 февраля 19:00",
                "",
                "29" ,
                32,
                12,
                39,"9"
        );
        items.add(news8);
        News news9 = new News(
                "Steve Jobs",
                "1 февраля 19:00",
                "",
                "29" ,
                32,
                12,
                39,"10"
        );
        items.add(news9);
        News news10 = new News(
                "Евгений Култышев",
                "15февраля 19:00",
                "",
                "29" ,
                32,
                12,
                39,"fdfd"
        );
        items.add(news10);
        return items;
    }
}
