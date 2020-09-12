package com.gmrit.csigmrit.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gmrit.csigmrit.R;
import com.gmrit.csigmrit.activities.news.IndividualNewsActivity;
import com.gmrit.csigmrit.modals.NewsData;

import java.util.List;

public class NewsDisplayAdapter extends RecyclerView.Adapter<NewsDisplayAdapter.ViewHolder> {

    Context context;
    List<NewsData> newsDataList;

    public NewsDisplayAdapter(Context context, List<NewsData> newsDataList) {
        this.context = context;
        this.newsDataList = newsDataList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.news_display_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.relativeLayoutImage.setBackgroundResource(newsDataList.get(position).getNewsImage());
        holder.txtAchivementName.setText(newsDataList.get(position).getNewsName());
        holder.txtMonth.setText(newsDataList.get(position).getMonth());
        holder.txtDate.setText(newsDataList.get(position).getDate());
        holder.txtYear.setText(newsDataList.get(position).getYear());

        holder.relativeLayoutImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, IndividualNewsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("achievementName", newsDataList.get(position).getNewsName());
                bundle.putString("achievementDate", newsDataList.get(position).getDate());
                bundle.putString("achievementMonth", newsDataList.get(position).getMonth());
                bundle.putString("achievementYear", newsDataList.get(position).getYear());
                bundle.putInt("achievementImage", newsDataList.get(position).getNewsImage());
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return newsDataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout relativeLayoutImage;
        TextView txtAchivementName, txtDate, txtMonth, txtYear;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            relativeLayoutImage = itemView.findViewById(R.id.relativeLayoutImage);
            txtAchivementName = itemView.findViewById(R.id.txtAchievementName);
            txtMonth = itemView.findViewById(R.id.txtMonth);
            txtDate = itemView.findViewById(R.id.txtDate);
            txtYear = itemView.findViewById(R.id.txtYear);
        }
    }

}
