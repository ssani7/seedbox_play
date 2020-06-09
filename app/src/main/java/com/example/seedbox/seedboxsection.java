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
        MobileAds.initialize(getActivity(), "ca-app-pub-3940256099942544~3347511713");
        AdRequest adRequest = new AdRequest.Builder().build();
        maddie.loadAd(adRequest);

        Button button1 = v.findViewById(R.id.PKG1);
        Button button2 = v.findViewById(R.id.PKG2);
        Button button3 = v.findViewById(R.id.PKG3);
        Button button4 = v.findViewById(R.id.PKG4);
        Button button5 = v.findViewById(R.id.PKG5);
        Button button6 = v.findViewById(R.id.PKG6);
        Button button7 = v.findViewById(R.id.PKG7);
        Button button1t = v.findViewById(R.id.PKG1BD);
        Button button2t = v.findViewById(R.id.PKG2BD);
        Button button3t = v.findViewById(R.id.PKG3BD);
        Button button4t = v.findViewById(R.id.PKG4BD);
        Button button5t = v.findViewById(R.id.PKG5BD);
        Button button6t = v.findViewById(R.id.PKG6BD);
        Button button7t = v.findViewById(R.id.PKG7BD);
        Button button1b = v.findViewById(R.id.PKG1BC);
        Button button2b = v.findViewById(R.id.PKG2BC);
        Button button3b = v.findViewById(R.id.PKG3BC);
        Button button4b = v.findViewById(R.id.PKG4BC);
        Button button5b = v.findViewById(R.id.PKG5BC);
        Button button6b = v.findViewById(R.id.PKG6BC);
        Button button7b = v.findViewById(R.id.PKG7BC);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button1t.setOnClickListener(this);
        button2t.setOnClickListener(this);
        button3t.setOnClickListener(this);
        button4t.setOnClickListener(this);
        button5t.setOnClickListener(this);
        button6t.setOnClickListener(this);
        button7t.setOnClickListener(this);
        button1b.setOnClickListener(this);
        button2b.setOnClickListener(this);
        button3b.setOnClickListener(this);
        button4b.setOnClickListener(this);
        button5b.setOnClickListener(this);
        button6b.setOnClickListener(this);
        button7b.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        gmail gmail = new gmail();
        getFragmentManager().beginTransaction().replace(R.id.frag_home,
                new gmail()).setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right).addToBackStack(null).commit();
    }
}