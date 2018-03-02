package com.example.hasanzian.myshowcase;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hasanZian on 02-03-2018.
 */

public class Adaptor extends ArrayAdapter<ListModel> {

    public Adaptor(Context context, ArrayList<ListModel> listModels) {
        super(context, 0, listModels);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ListModel currentListItemPostion = getItem(position);
        RelativeLayout relativeLayout = (RelativeLayout)listItemView.findViewById(R.id.background);
        if(position == 1){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                relativeLayout.setBackground(getContext().getDrawable(R.drawable.gradient_two));
            }
        }

        TextView projectTitle = (TextView)listItemView.findViewById(R.id.project_title);
        TextView projectInfo = (TextView)listItemView.findViewById(R.id.project_info);
        ImageView image = (ImageView)listItemView.findViewById(R.id.project_thumbnail);
        projectTitle.setText(currentListItemPostion.getmProjectTitle());
        projectInfo.setText(currentListItemPostion.getmProjectInfo());
        image.setImageResource(currentListItemPostion.getmImageResourcesID());



        return listItemView;
    }
}
