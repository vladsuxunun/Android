package com.mobile.recyclerapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.NewsViewHolder> {

    private List<News> newsList;
   public ImageButton imgwgg;
    @Nullable
    private ItemClickListener listener;

    public NewsListAdapter(List<News> newsList) {

        this.newsList = newsList;
    }

    public NewsListAdapter(List<News> newsList, @Nullable ItemClickListener listener) {
        this.newsList = newsList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, null, false);
        RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        view.setLayoutParams(params);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, final int position) {
        final News news = newsList.get(position);
        holder.tvDate.setText(news.getDate());
        holder.tvAuthor.setText(news.getAuthor());
        holder.tvTitle.setText(news.getTitle());
        holder.tvTheme.setText(news.getTheme());
        holder.tvRatingCount.setText(String.valueOf(news.getRatingCount()));
        holder.tvComments.setText(String.valueOf(news.getCommentsCount()));
        holder.tvViews.setText(String.valueOf(news.getViewsCount()));
        //if(news.getPicPath().equals("1"))
        //{

        //}
        switch (news.getPicPath()) {
            case "1":
                holder.Avatars.setBackgroundResource(R.drawable.suns);
                break;
            case "2":
                holder.Avatars.setBackgroundResource(R.drawable.zakat);
                break;
            case "3":
                holder.Avatars.setBackgroundResource(R.drawable.s333);
                break;
            case "4":
                holder.Avatars.setBackgroundResource(R.drawable.s444);
                break;
            case "5":
                holder.Avatars.setBackgroundResource(R.drawable.s555);
                break;
            case "6":
                holder.Avatars.setBackgroundResource(R.drawable.s666);
                break;
            case "7":
                holder.Avatars.setBackgroundResource(R.drawable.s777);
                break;
            case "8":
                holder.Avatars.setBackgroundResource(R.drawable.s888);
                break;
            case "9":
                holder.Avatars.setBackgroundResource(R.drawable.s999);
                break;
            case "10":
                holder.Avatars.setBackgroundResource(R.drawable.s100);
                break;
            default:
                holder.Avatars.setBackgroundResource(R.drawable.kkb);
        }
        switch (news.getPicPath()) {
            case "1":
                holder.Views.setBackgroundResource(R.drawable.s111);
                break;
            case "2":
                holder.Views.setBackgroundResource(R.drawable.s333);
                break;
            case "3":
                holder.Views.setBackgroundResource(R.drawable.s555);
                break;
            case "4":
                holder.Views.setBackgroundResource(R.drawable.s888);
                break;
            case "5":
                holder.Views.setBackgroundResource(R.drawable.s111);
                break;
            case "6":
                holder.Views.setBackgroundResource(R.drawable.s999);
                break;
            case "7":
                holder.Views.setBackgroundResource(R.drawable.suns);
                break;
            case "8":
                holder.Views.setBackgroundResource(R.drawable.zakat);
                break;
            case "9":
                holder.Views.setBackgroundResource(R.drawable.s100);
                break;
            case "10":
                holder.Views.setBackgroundResource(R.drawable.s222);
                break;
            default:
                holder.Views.setBackgroundResource(R.drawable.slavesgog);
        }

       // else if(news.getAvatarPath().equals("1"))
       // {
         // holder.Avatars.setBackgroundResource(R.drawable.suns);
        //}
       /// if(news.getPicPath().equals("3"))
      //  {
       //    holder.Avatars.setBackgroundResource(R.drawable.zakat);
       //}
       // else
      //  {
          //  holder.Avatars.setBackgroundResource(R.drawable.kkb);
       // }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.itemClick(position, news);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {

        TextView tvDate;
        TextView tvTitle;
        TextView tvAuthor;
        TextView tvTheme;
        TextView tvRatingCount;
        TextView tvViews;
        TextView tvComments;
        ImageButton Avatars;
        ImageView Views;
        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvAuthor = itemView.findViewById(R.id.tvAuthor);
            tvTheme = itemView.findViewById(R.id.tvTheme);
            tvRatingCount = itemView.findViewById(R.id.tvRating);
            tvViews = itemView.findViewById(R.id.tvViews);
            tvComments = itemView.findViewById(R.id.tvComments);
            Avatars =  itemView.findViewById(R.id.imgwgg);
            Views = itemView.findViewById(R.id.imageView);
        }
    }

    interface ItemClickListener {
        void itemClick(int position, News item);
    }
}
mmmm