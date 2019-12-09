package com.DSI31G4.testconcoure.ui.send;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.DSI31G4.testconcoure.R;
import com.DSI31G4.testconcoure.ui.send.SendViewModel;

public class SendFragment extends Fragment {

    private SendViewModel sendViewModel;
    public WebView mWebView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


                //Corps du Fragment Actualité
                View root=inflater.inflate(R.layout.fragment_send, container, false);
                mWebView =(WebView)root.findViewById(R.id.webview);
                mWebView.loadUrl("https://www.google.com");

                mWebView.setWebViewClient(new WebViewClient());

        return root;
    }

}