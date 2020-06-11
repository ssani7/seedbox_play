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

public class BTC extends Fragment implements View.OnClickListener {
    private AdView maddie;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_seedboxsectionbtc, container, false);
        maddie = v.findViewById(R.id.adView);
        MobileAds.initialize(getActivity(), "ca-app-pub-5024069063645891~5346190944");
        AdRequest adRequest = new AdRequest.Builder().build();
        maddie.loadAd(adRequest);


        Button button1b = v.findViewById(R.id.PKG1BC);
        Button button2b = v.findViewById(R.id.PKG2BC);
        Button button3b = v.findViewById(R.id.PKG3BC);
        Button button4b = v.findViewById(R.id.PKG4BC);
        Button button5b = v.findViewById(R.id.PKG5BC);
        Button button6b = v.findViewById(R.id.PKG6BC);
        Button button7b = v.findViewById(R.id.PKG7BC);
        Button button8b = v.findViewById(R.id.PKG8BC);



        button1b.setOnClickListener(this);
        button2b.setOnClickListener(this);
        button3b.setOnClickListener(this);
        button4b.setOnClickListener(this);
        button5b.setOnClickListener(this);
        button6b.setOnClickListener(this);
        button7b.setOnClickListener(this);
        button8b.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        gmail gmail = new gmail();
        getFragmentManager().beginTransaction().replace(R.id.frag_home,
                new gmail()).setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right).addToBackStack(null).commit();
    }
}