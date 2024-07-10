package com.example.slidingscreen22;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class CustomBottomSheetDialogFragment2 extends BottomSheetDialogFragment {

    ImageView backBtn2;
    private View view;
    WebView web;
    LinearLayout main;
    TextView website;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_sheet_dialog_2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        backBtn2 = requireView().findViewById(R.id.backBtn2);
        main = requireView().findViewById(R.id.main);
        web = requireView().findViewById(R.id.web);
        website = requireView().findViewById(R.id.tvWebsite2);
        website.setText("www.geeksforgeeks.org");
        web.loadUrl("https://www.geeksforgeeks.org/how-to-upload-project-on-github-from-android-studio/");

        // this will enable the javascript.
        web.getSettings().setJavaScriptEnabled(true);

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        web.setWebViewClient(new WebViewClient());
        backBtn2.setOnClickListener(new View.OnClickListener() {
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