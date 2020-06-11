package com.example.seedbox;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BDT extends Fragment implements View.OnClickListener {
    private AdView maddie;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_seedboxsectionbdt, container, false);
        maddie = v.findViewById(R.id.adView);
        MobileAds.initialize(getActivity(), "ca-app-pub-5024069063645891~5346190944");
        AdRequest adRequest = new AdRequest.Builder().build();
        maddie.loadAd(adRequest);


        Button button1t = v.findViewById(R.id.PKG1BD);
        Button button2t = v.findViewById(R.id.PKG2BD);
        Button button3t = v.findViewById(R.id.PKG3BD);
        Button button4t = v.findViewById(R.id.PKG4BD);
        Button button5t = v.findViewById(R.id.PKG5BD);
        Button button6t = v.findViewById(R.id.PKG6BD);
        Button button7t = v.findViewById(R.id.PKG7BD);
        Button button8t = v.findViewById(R.id.PKG8BD);

        button1t.setOnClickListener(this);
        button2t.setOnClickListener(this);
        button3t.setOnClickListener(this);
        button4t.setOnClickListener(this);
        button5t.setOnClickListener(this);
        button6t.setOnClickListener(this);
        button7t.setOnClickListener(this);
        button8t.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        gmail gmail = new gmail();
        getFragmentManager().beginTransaction().replace(R.id.frag_home,
                new gmail()).setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right).addToBackStack(null).commit();
    }
}