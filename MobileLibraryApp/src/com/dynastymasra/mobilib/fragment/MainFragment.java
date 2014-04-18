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
    private GridView gridLayout;
    private Integer[] images = {R.drawable.ic_booked, R.drawable.ic_cd};
    private String[] text = {"Text 1", "Text 2"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        gridLayout = (GridView) view.findViewById(R.id.girdViewHome);
        CustomGridAdapter customGridAdapter = new CustomGridAdapter(getActivity(), images, text);
        gridLayout.setAdapter(customGridAdapter);

        return view;
    }
}
