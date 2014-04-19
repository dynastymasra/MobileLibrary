package com.dynastymasra.mobilib.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dynastymasra.mobilib.R;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class UserFragment extends Fragment {
    public static final String ITEM_NAME = "itemName";
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        textView = (TextView) view.findViewById(R.id.exampleText);

        if (getArguments().getString(ITEM_NAME).equals("0")) {
            textView.setText("Profile Example");
        } else if (getArguments().getString(ITEM_NAME).equals("7")) {
            textView.setText("Mockup Mobile Library");
        }

        return view;
    }
}
