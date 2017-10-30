package tr.com.betonel.betonelteklifuygulamasi;

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

public class WebSiteAnasayfa extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_web_site_anasayfa);
        setDragEdge(SwipeBackLayout.DragEdge.LEFT);

        WebView wvWebSite = (WebView) findViewById(R.id.wbWebSite);

        WebSettings webSettings = wvWebSite.getSettings();
        webSettings.setJavaScriptEnabled(true);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();

        if (activeNetworkInfo != null){

            wvWebSite.setWebViewClient(new WebViewClient(){

                public boolean shouldOverrideUrlLoading(WebView view, String url){

                    String url2 = "http://ahmetkilinc.net/holymoly/create-form.php";

                    if(url != null && url.startsWith(url2)){

                        view.getContext().startActivity(
                                new Intent(Intent.ACTION_VIEW, Uri.parse(url.toString())));

                        return true;
                    }
                    else{

                        return false;
                    }
                }
            });

            wvWebSite.loadUrl("http://www.betonel.com.tr");
        }
        else{
            for (int i = 0; i < 3; i++){

                Toast.makeText(getApplicationContext(), "Uygulama internet bağlantısı gerektirmektedir, bağlantınızı sağladıktan sonra tekrar deneyiniz.", Toast.LENGTH_SHORT).show();
            }

            finish();
        }
    }
}
