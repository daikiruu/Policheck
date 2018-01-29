package se.my.daik.policheck.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import se.my.daik.policheck.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteFragment extends Fragment {




    private GoToNextFromFavorite goToNextFromFavorite;
    public interface GoToNextFromFavorite {
        void goToNextFragmentFromFavorite();
    }

    public FavoriteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        goToNextFromFavorite = (GoToNextFromFavorite) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();

        goToNextFromFavorite = null;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /*Button button = view.findViewById(R.id.to_main_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNextFromFavorite.goToNextFragmentFromFavorite();
            }
        }); */
    }
}