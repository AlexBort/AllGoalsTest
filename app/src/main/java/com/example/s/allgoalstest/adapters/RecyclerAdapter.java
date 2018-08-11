package com.example.s.allgoalstest.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.s.allgoalstest.R;
import com.example.s.allgoalstest.pojo.League;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    // TODO: 08.08.2018 потом уберем пустой конструктор
    public RecyclerAdapter() {
    }

    public RecyclerAdapter(Context context, List<League> listUsers) {
//        this.listUsers = listUsers;
//        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_league, null);
        view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        holder.textView.setText("sasha");
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        //        private TextView firstName;
//        private ImageView smallAva;
        private View view;


        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            //   ButterKnife.bind(this, view);
            textView = itemView.findViewById(R.id.text_view);
//            firstName = itemView.findViewById(R.id.first_name);

        }

    }
}