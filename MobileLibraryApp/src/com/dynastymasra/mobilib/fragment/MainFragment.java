package com.dynastymasra.mobilib.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.dynastymasra.mobilib.R;
import com.dynastymasra.mobilib.adapter.CustomGridAdapter;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class MainFragment extends Fragment {
    public static final String ITEM_NAME = "itemName";
    private GridView gridLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        gridLayout = (GridView) view.findViewById(R.id.girdViewHome);
        if (getArguments().getString(ITEM_NAME).equals("2")) {
            Integer[] images = {R.drawable.jsp, R.drawable.edition, R.drawable.java, R.drawable.javatwo};
            String[] text = {"", "", "", ""};
            CustomGridAdapter customGridAdapter = new CustomGridAdapter(getActivity(), images, text);
            gridLayout.setAdapter(customGridAdapter);
        } else if (getArguments().getString(ITEM_NAME).equals("3")) {
            Integer[] images = {R.drawable.jsp};
            String[] text = {""};
            CustomGridAdapter customGridAdapter = new CustomGridAdapter(getActivity(), images, text);
            gridLayout.setAdapter(customGridAdapter);
        } else if (getArguments().getString(ITEM_NAME).equals("4")) {
            Integer[] images = {R.drawable.jsp, R.drawable.edition};
            String[] text = {"", ""};
            CustomGridAdapter customGridAdapter = new CustomGridAdapter(getActivity(), images, text);
            gridLayout.setAdapter(customGridAdapter);
        } else if (getArguments().getString(ITEM_NAME).equals("5")) {
            Integer[] images = {R.drawable.jsp, R.drawable.edition, R.drawable.javatwo};
            String[] text = {"", "", ""};
            CustomGridAdapter customGridAdapter = new CustomGridAdapter(getActivity(), images, text);
            gridLayout.setAdapter(customGridAdapter);
        }

        return view;
    }
}
