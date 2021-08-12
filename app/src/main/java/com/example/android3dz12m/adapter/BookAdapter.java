package com.example.android3dz12m.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android3dz12m.OnClick;
import com.example.android3dz12m.databinding.BookItemBinding;
import com.example.android3dz12m.models.BookModel;

import java.util.ArrayList;
import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private List<BookModel> list =  new ArrayList<>();
    private BookItemBinding itemBinding;
    private OnClick onClick;

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    public void setIn(List<BookModel> lif){
        list = lif;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemBinding = BookItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new BookViewHolder(itemBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        holder.onBind(list.get(position));

        itemBinding.itemIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder{

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void onBind(BookModel bookModel) {
            itemBinding.itemTitleTxt.setText(bookModel.getTitle());
            itemBinding.itemIcon.setImageResource(bookModel.getIcon());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClick.getSmt(bookModel, v);
                }
            });
        }
    }
}
