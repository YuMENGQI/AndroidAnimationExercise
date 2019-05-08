package home.smart.fly.animations.ui.activity.multifragments;


import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import home.smart.fly.animations.R;
import home.smart.fly.animations.customview.CustomImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {
    private static final String TAG = "OneFragment";

    public OneFragment() {
        // Required empty public constructor
    }

    private View rootView;
    private CustomImageView check;
    private boolean selected = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e(TAG, "onCreateView: ");

        if (null != rootView) {
            ViewGroup parent = (ViewGroup) rootView.getParent();
            if (null != parent) {
                parent.removeView(rootView);
            }
        } else {
            rootView = inflater.inflate(R.layout.fragment_one, container, false);


            loadData();
        }


        check = rootView.findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                selected = !selected;
                check.setChecked(selected);
            }
        });


        RecyclerView recyclerView = new RecyclerView(getContext());
        ViewPager viewPager = new ViewPager(getContext());
        viewPager.addView(recyclerView,new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));

        return rootView;
    }

    private void loadData() {
        Log.e(TAG, "loadData: ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: ");
    }
}
