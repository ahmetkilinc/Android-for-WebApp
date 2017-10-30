package tr.com.betonel.betonelteklifuygulamasi;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

public class Hakkinda extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_hakkinda);
        setDragEdge(SwipeBackLayout.DragEdge.LEFT);

        WebView wvHakkinda = (WebView) findViewById(R.id.wvHakkinda);

        WebSettings webSettings = wvHakkinda.getSettings();
        webSettings.setJavaScriptEnabled(true);

        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();

        if (activeNetworkInfo != null) {

            wvHakkinda.setWebViewClient(new WebViewClient() {

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

            wvHakkinda.loadUrl("http://www.betonel.com.tr/kurumsal");
        } else {

            for (int i = 0; i < 3; i++){

                Toast.makeText(getApplicationContext(), "Uygulama internet bağlantısı gerektirmektedir, bağlantınızı sağladıktan sonra tekrar deneyiniz.", Toast.LENGTH_LONG).show();
            }

            finish();
        }
    }
}
