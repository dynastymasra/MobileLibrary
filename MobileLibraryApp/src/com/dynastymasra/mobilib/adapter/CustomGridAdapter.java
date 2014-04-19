package com.dynastymasra.mobilib.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.dynastymasra.mobilib.R;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class CustomGridAdapter extends ArrayAdapter<String> {
    private Context context;
    private Integer[] images;
    private String[] text;

    public CustomGridAdapter(Context context, Integer[] images, String[] text) {
        super(context, R.layout.fragment_main, text);
        this.context = context;
        this.images = images;
        this.text = text;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_grid_layout, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.homeGridImage);
        TextView textView = (TextView) convertView.findViewById(R.id.homeGridText);

        imageView.setImageResource(images[position]);
        textView.setText(text[position]);

        return convertView;
    }
}
