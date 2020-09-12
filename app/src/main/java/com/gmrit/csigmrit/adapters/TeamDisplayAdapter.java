package com.gmrit.csigmrit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.gmrit.csigmrit.R;
import com.gmrit.csigmrit.modals.TeamData;

import java.util.List;

public class TeamDisplayAdapter extends RecyclerView.Adapter<TeamDisplayAdapter.ViewHolder> {

    Context context;
    List<TeamData> teamDataList;

    public TeamDisplayAdapter(Context context, List<TeamData> teamDataList) {
        this.context = context;
        this.teamDataList = teamDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.team_display_card, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageLayout.setBackgroundResource(teamDataList.get(position).getTeamImage());
        holder.txtTeamName.setText(teamDataList.get(position).getTeamName());
        holder.txtTeamRole.setText(teamDataList.get(position).getTxtTeamRole());
    }

    @Override
    public int getItemCount() {
        return teamDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        LinearLayout imageLayout;
        CardView relativeLayout;
        TextView txtTeamName, txtTeamRole;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageLayout = itemView.findViewById(R.id.imageView);
            relativeLayout = itemView.findViewById(R.id.relativeLayout);
            txtTeamName = itemView.findViewById(R.id.teamName);
            txtTeamRole = itemView.findViewById(R.id.teamRole);

        }
    }
}
