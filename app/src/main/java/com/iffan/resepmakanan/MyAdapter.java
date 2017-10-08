package com.iffan.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC on 24/09/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    List<Listitem> ListItems;
    private Context context;

    public MyAdapter(List<Listitem> listItems, Context context) {
        ListItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View v= LayoutInflater.from(parent.getContext())
              .inflate(R.layout.list_view,parent,false);
        return new ViewHolder(v,context,ListItems);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Listitem listitem=ListItems.get(position);

        holder.textViewHead.setText(listitem.getHead());
        holder.textViewDesc.setText(listitem.getDesc());
        holder.imageView.setImageResource(listitem.getImage_id());
    /*    holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"You clicked" + listitem.getHead(), Toast.LENGTH_LONG).show();
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return ListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView textViewHead;
        public TextView textViewDesc;
        public ImageView imageView;
        public LinearLayout linearLayout;
        Context context;
        List<Listitem> listItems;
        public ViewHolder(View itemView, Context context, List<Listitem> listItems) {
            super(itemView);
            this.context=context;
            this.listItems=listItems;
            itemView.setOnClickListener(this);
            imageView=(ImageView) itemView.findViewById(R.id.imageView);
            textViewHead=(TextView) itemView.findViewById(R.id.textHead);
            textViewDesc=(TextView) itemView.findViewById(R.id.textDesc);
            linearLayout= (LinearLayout) itemView.findViewById(R.id.liniearLayout);
        }

        @Override
        public void onClick(View v) {
        int position=getAdapterPosition();
            Listitem listitem=this.listItems.get(position);
            Intent intent=new Intent(this.context,ResepDetail.class);
            intent.putExtra("img_id",listitem.getImage_id());
            intent.putExtra("judul",listitem.getHead());
            intent.putExtra("deskripsi",listitem.getDesc());
            this.context.startActivity(intent);

        }
    }

}
