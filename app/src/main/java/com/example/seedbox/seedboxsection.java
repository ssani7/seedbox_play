package com.example.seedbox;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class seedboxsection extends Fragment implements View.OnClickListener {
    private AdView maddie;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_seedboxsection, container, false);
        maddie = v.findViewById(R.id.adView);
        MobileAds.initialize(getActivity(), "ca-app-pub-5024069063645891~5346190944");
        AdRequest adRequest = new AdRequest.Builder().build();
        maddie.loadAd(adRequest);

        Button button1 = v.findViewById(R.id.PKG1);
        Button button2 = v.findViewById(R.id.PKG2);
        Button button3 = v.findViewById(R.id.PKG3);
        Button button4 = v.findViewById(R.id.PKG4);
        Button button5 = v.findViewById(R.id.PKG5);
        Button button6 = v.findViewById(R.id.PKG6);
        Button button7 = v.findViewById(R.id.PKG7);
        Button button8 = v.findViewById(R.id.PKG8);



        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);


        return v;
    }

    @Override
    public void onClick(View v) {
        gmail gmail = new gmail();
        getFragmentManager().beginTransaction().replace(R.id.frag_home,
                new gmail()).setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right).addToBackStack(null).commit();
    }
}