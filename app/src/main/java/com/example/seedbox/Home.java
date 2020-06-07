package com.example.seedbox;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Home extends Fragment {
    Button button;
    private AdView maddie;
    View v;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_home, container, false);
        button = v.findViewById(R.id.sdpk1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seedboxsection seedboxsection = new seedboxsection();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frag_home, new seedboxsection()).commit();
            }
        });

        maddie = v.findViewById(R.id.adView);
        MobileAds.initialize(getActivity(), "ca-app-pub-3940256099942544~3347511713");
        AdRequest adRequest = new AdRequest.Builder().build();
        maddie.loadAd(adRequest);
        return v;
    }
}
