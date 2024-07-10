package com.example.slidingscreen22;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class CustomBottomSheetDialogFragment extends BottomSheetDialogFragment {

    ImageView backBtn;
    LinearLayout main;
    WebView web;
    TextView website;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_sheet_dialog, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        backBtn = requireView().findViewById(R.id.backBtn);
        main = requireView().findViewById(R.id.main);
        web = requireView().findViewById(R.id.web);
        website = requireView().findViewById(R.id.tvWebsite);
        website.setText("timesofindia.indiatimes.com");
        web.loadUrl("https://timesofindia.indiatimes.com/");

        // this will enable the javascript.
        web.getSettings().setJavaScriptEnabled(true);

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        web.setWebViewClient(new WebViewClient());
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* if (getActivity() != null) {
                    getActivity().onBackPressed();
                }*/
                onStop();

            }
        });
    }


}
