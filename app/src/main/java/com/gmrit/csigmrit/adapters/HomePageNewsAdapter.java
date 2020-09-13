package com.gmrit.csigmrit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gmrit.csigmrit.R;
import com.gmrit.csigmrit.modals.HomePageNewsData;

import java.util.List;

public class HomePageNewsAdapter extends RecyclerView.Adapter<HomePageNewsAdapter.ViewHolder> {

    Context context;
    List<HomePageNewsData> homePageNewsDataList;

    public HomePageNewsAdapter(Context context, List<HomePageNewsData> homePageNewsDataList) {
        this.context = context;
        this.homePageNewsDataList = homePageNewsDataList;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.homepage_news_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.relativeLayoutImage.setBackgroundResource(homePageNewsDataList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return homePageNewsDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout relativeLayoutImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            relativeLayoutImage = itemView.findViewById(R.id.relativeLayoutImage);
        }
    }
}
