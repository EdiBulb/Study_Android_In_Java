package org.techtown.study_android_java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<RecyclerViewItem>mData = null;

    public RecyclerViewAdapter(ArrayList<RecyclerViewItem>data){
        mData = data;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.recycler_item,parent,false);
        RecyclerViewAdapter.ViewHolder vh = new RecyclerViewAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecyclerViewItem item = mData.get(position);

        holder.imageView.setBackground(item.getIconDrawable());
        holder.mainText.setText(item.getMainTitle());
        holder.subText.setText(item.getSubTitle());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView mainText;
        TextView subText;

        ViewHolder(View itemView){
            super(itemView);

            imageView = itemView.findViewById(R.id.item_image);
            mainText = itemView.findViewById(R.id.icon_main_text);
            subText = itemView.findViewById(R.id.icon_sub_text);
        }
    }
}
