package com.mobile.recyclerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NewsDetailActivity extends AppCompatActivity {

    TextView tvDate;
    TextView tvTitle;
    TextView tvAuthor;
    TextView tvTheme;
    TextView tvRatingCount;
    TextView tvViews;
    TextView tvComments;
    ImageButton Avatars;
    ImageView Views;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        //tvNewsDetail = findViewById(R.id.tvNewsDetail);

        News news = (News) getIntent().getParcelableExtra("news");
        tvDate = findViewById(R.id.tvDate);
        tvTitle = findViewById(R.id.tvTitle);
        tvAuthor = findViewById(R.id.tvAuthor);
        tvTheme = findViewById(R.id.tvTheme);
        tvRatingCount =findViewById(R.id.tvRating);
        tvViews = findViewById(R.id.tvViews);
        tvComments = findViewById(R.id.tvComments);
        Avatars =  findViewById(R.id.imgwgg);
        tvDate.setText(news.getDate());
        tvAuthor.setText(news.getAuthor());
        tvTitle.setText(news.getTitle());
        tvTheme.setText(news.getTheme());
       tvRatingCount.setText(String.valueOf(news.getRatingCount()));
       tvComments.setText(String.valueOf(news.getCommentsCount()));
        tvViews.setText(String.valueOf(news.getViewsCount()));

        Views =  findViewById(R.id.imageView);
        switch (news.getPicPath()) {
            case "1":
                Avatars.setBackgroundResource(R.drawable.suns);
                break;
            case "2":
                Avatars.setBackgroundResource(R.drawable.zakat);
                break;
            case "3":
                Avatars.setBackgroundResource(R.drawable.s333);
                break;
            case "4":
                Avatars.setBackgroundResource(R.drawable.s444);
                break;
            case "5":
                Avatars.setBackgroundResource(R.drawable.s555);
                break;
            case "6":
                Avatars.setBackgroundResource(R.drawable.s666);
                break;
            case "7":
                Avatars.setBackgroundResource(R.drawable.s777);
                break;
            case "8":
                Avatars.setBackgroundResource(R.drawable.s888);
                break;
            case "9":
                Avatars.setBackgroundResource(R.drawable.s999);
                break;
            case "10":
                Avatars.setBackgroundResource(R.drawable.s100);
                break;
            default:
                Avatars.setBackgroundResource(R.drawable.kkb);
        }
        switch (news.getPicPath()) {
            case "1":
               Views.setBackgroundResource(R.drawable.s111);
                break;
            case "2":
               Views.setBackgroundResource(R.drawable.s333);
                break;
            case "3":
                Views.setBackgroundResource(R.drawable.s555);
                break;
            case "4":
                Views.setBackgroundResource(R.drawable.s888);
                break;
            case "5":
                Views.setBackgroundResource(R.drawable.s111);
                break;
            case "6":
                Views.setBackgroundResource(R.drawable.s999);
                break;
            case "7":
                Views.setBackgroundResource(R.drawable.suns);
                break;
            case "8":
                Views.setBackgroundResource(R.drawable.zakat);
                break;
            case "9":
                Views.setBackgroundResource(R.drawable.s100);
                break;
            case "10":
                Views.setBackgroundResource(R.drawable.s222);
                break;
            default:
                Views.setBackgroundResource(R.drawable.slavesgog);
        }

    }
    public void showToast(View view) {
        //создаём и отображаем текстовое уведомление
        Toast toast = Toast.makeText(this, "you liked",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0,160);
        toast.show();

    }
}
