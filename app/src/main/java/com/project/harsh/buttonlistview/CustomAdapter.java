package com.project.harsh.buttonlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by harsh on 7/3/17.
 */

class CustomAdapter extends BaseAdapter{

    Context context;
    int layoutResourceId;
    ArrayList<Post> posts;

    public CustomAdapter(Context context, int layoutResourceId, ArrayList<Post> posts) {
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.posts = posts;
    }
    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int position) {
        return posts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder{
        TextView listname;
        Button addbtn;
        Button deletebtn;
        Button sharebtn;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        CustomAdapter.ViewHolder holder = new CustomAdapter.ViewHolder();
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.single_list, parent, false);
            holder.listname = (TextView) convertView.findViewById(R.id.txt);
            holder.addbtn = (Button)convertView.findViewById(R.id.btn1);
            holder.deletebtn = (Button)convertView.findViewById(R.id.btn2);
            holder.sharebtn = (Button)convertView.findViewById(R.id.btn3);
            convertView.setTag(holder);
        }else

        {
            holder = (CustomAdapter.ViewHolder) convertView.getTag();
        }
        holder.listname.setText(posts.get(position).getListitem());
        holder.addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Edit button Clicked" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
        holder.deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Delete button Clicked" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
        holder.sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Share button Clicked" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
