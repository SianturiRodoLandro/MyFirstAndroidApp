package com.blacksabathhandsome.myrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewAlkesAdapter extends RecyclerView.Adapter<CardViewAlkesAdapter.CardViewViewHolder> {

    private ArrayList<Alkes> listAlkes;
    Context context;

    public CardViewAlkesAdapter(ArrayList<Alkes> listAlkes, Context context) {
        this.listAlkes = listAlkes;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewAlkesAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_alkes, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        Alkes alkes = listAlkes.get(position);

        Glide.with(holder.itemView.getContext())
                .load(alkes.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(alkes.getName());
        holder.tvFrom.setText(alkes.getFrom());

        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Favorite " +
                        listAlkes.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Share " +
                        listAlkes.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listAlkes.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (context,DetailsActivity.class);
                intent.putExtra("photo", listAlkes.get(holder.getAdapterPosition()).getPhoto());
                intent.putExtra("name", listAlkes.get(holder.getAdapterPosition()).getName());
                intent.putExtra("description", listAlkes.get(holder.getAdapterPosition()).getFrom());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAlkes.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        @NonNull
        private final View itemView;
        ImageView imgPhoto;
        TextView tvName, tvFrom;
        Button btnFavorite, btnShare;

        CardViewViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFrom = itemView.findViewById(R.id.tv_item_from);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}