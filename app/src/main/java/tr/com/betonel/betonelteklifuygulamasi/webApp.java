package tr.com.betonel.betonelteklifuygulamasi;


import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class webApp extends Fragment {

    public ViewGroup rootView;

    public webApp() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_web_app, container, false);

        WebView wv = (WebView) rootView.findViewById(R.id.webview);
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);

        ConnectivityManager connectivityManager
                = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();

        if (activeNetworkInfo != null) {

            wv.setWebViewClient(new WebViewClient() {

                public boolean shouldOverrideUrlLoading(WebView view, String url) {

                    String url2 = "http://ahmetkilinc.net/holymoly/create-form.php";

                    if (url != null && url.startsWith(url2)) {

                        view.getContext().startActivity(

                                new Intent(Intent.ACTION_VIEW, Uri.parse(url)));

                        return true;

                    } else {

                        return false;
                    }
                }
            });

            wv.loadUrl("http://ahmetkilinc.net/holymoly/index.html");
        } else {

            for (int i = 0; i < 3; i++) {

                Toast.makeText(getActivity(), "Uygulama internet bağlantısı gerektirmektedir, internetle alakalı sorunlarınızı giderdikten sonra tekrar deneyiniz.", Toast.LENGTH_LONG).show();
            }
        }
        return rootView;
    }
}
