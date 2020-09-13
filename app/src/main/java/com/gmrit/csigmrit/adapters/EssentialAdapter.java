package com.gmrit.csigmrit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gmrit.csigmrit.R;
import com.gmrit.csigmrit.modals.EssentialData;

import java.util.List;

public class EssentialAdapter extends RecyclerView.Adapter<EssentialAdapter.ViewHolder> {

    Context context;
    List<EssentialData> essentialDataList;

    public EssentialAdapter(Context context, List<EssentialData> essentialDataList) {
        this.context = context;
        this.essentialDataList = essentialDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.essential_card, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txtEssentialName.setText(essentialDataList.get(position).getEssentialName());
        holder.txtEssentialDescription.setText(essentialDataList.get(position).getEssentialDescription());
        holder.backgroundImage.setImageResource(essentialDataList.get(position).getBackgroundImage());
    }

    @Override
    public int getItemCount() {
        return essentialDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtEssentialName, txtEssentialDescription;
        ImageView backgroundImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtEssentialName = itemView.findViewById(R.id.txtEssentialName);
            txtEssentialDescription = itemView.findViewById(R.id.essentialDescription);
            backgroundImage = itemView.findViewById(R.id.backgroundImage);
        }
    }
}
