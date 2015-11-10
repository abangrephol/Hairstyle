package fragments;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.user.hairstyle.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FullImageFragment extends Fragment {

    public static final String IMAGE_ARGS = "FullImageFragment.IMAGE_ARGS";

    public FullImageFragment() {
        // Required empty public constructor
    }


    public static FullImageFragment newInstance(int imageArgs){
        FullImageFragment fragment = new FullImageFragment();
        Bundle args = new Bundle();
        args.putInt(IMAGE_ARGS, imageArgs);
        fragment.setArguments(args);

        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout root = (LinearLayout) inflater.inflate(R.layout.fragment_image,container,false);
        ImageView imageView = (ImageView) root.findViewById(R.id.imageView);

        int imageId = getArguments().getInt(IMAGE_ARGS);
        imageView.setImageResource(imageId);
        return root;
    }


}
