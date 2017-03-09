package com.recyclerviewexample.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.recyclerviewexample.R;
import com.recyclerviewexample.models.RecipieModel;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ZeeZee
 */

public class RecipieRecyclerViewAdapter extends RecyclerView.Adapter<RecipieRecyclerViewAdapter.RecipieViewHolder>
{
    ArrayList<RecipieModel> recipieModels = new ArrayList<>();
    Context context;

    public RecipieRecyclerViewAdapter(ArrayList<RecipieModel> recipieModels, Context context)
    {
        this.recipieModels = recipieModels;
        this.context = context;
    }

    @Override
    public RecipieViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null, false);
        return new RecipieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecipieViewHolder holder, int position)
    {
        holder.bindView(position);
    }

    @Override
    public int getItemCount()
    {
        return recipieModels.size();
    }

    public class RecipieViewHolder extends RecyclerView.ViewHolder
    {

        TextView tvTitle, tvDescription, tvDate;
        ImageView ivImage;
        ProgressBar pbImage;
        public RecipieViewHolder(View itemView)
        {
            super(itemView);

            initViews(itemView);
        }

        private void initViews(View itemView)
        {
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
           /* tvDescription = (TextView) itemView.findViewById(R.id.tvDescription);
            tvDate = (TextView) itemView.findViewById(R.id.tvDate);
            ivImage = (ImageView) itemView.findViewById(R.id.ivImage);
            pbImage = (ProgressBar) itemView.findViewById(R.id.pbImage);*/
        }

        public void bindView(int position)
        {
            RecipieModel recipieModel = recipieModels.get(position);

            tvTitle.setText(recipieModel.getTitle());
           /* tvDescription.setText(recipieModel.getDescription());
            tvDate.setText(recipieModel.getDate());

            Picasso.with(context).load(recipieModel.getImage()).into(ivImage, new Callback() {
                @Override
                public void onSuccess()
                {
                    pbImage.setVisibility(View.GONE);
                }

                @Override
                public void onError()
                {
                    pbImage.setVisibility(View.GONE);
                }
            });*/

        }

    }
}
