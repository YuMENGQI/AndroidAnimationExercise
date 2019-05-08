package home.smart.fly.animations.recyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import home.smart.fly.animations.R;
import home.smart.fly.animations.recyclerview.VegaRecyclerViewActivity;
import home.smart.fly.animations.utils.V;

/**
 * Created by rookie on 2017/5/17.
 */


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<String> demos;


    public RecyclerViewAdapter(List<String> demos) {
        this.demos = demos;


    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.image_item, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {


        Glide.with(mContext)
                .load(demos.get(position))
                .apply(new RequestOptions().placeholder(R.drawable.a6))
                .into(holder.mImageView);


        holder.itemshell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, VegaRecyclerViewActivity.class));
            }
        });
    }


    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public int getItemCount() {
        return demos.size();
    }


    class MyHolder extends RecyclerView.ViewHolder {
        LinearLayout itemshell;
        ImageView mImageView;

        public MyHolder(View itemView) {
            super(itemView);
            mImageView = V.f(itemView, R.id.image);
            itemshell = V.f(itemView, R.id.itemshell);
        }
    }

}