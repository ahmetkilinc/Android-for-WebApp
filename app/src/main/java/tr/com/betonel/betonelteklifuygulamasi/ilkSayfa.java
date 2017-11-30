package tr.com.betonel.betonelteklifuygulamasi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

public class ilkSayfa extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_ilk_sayfa);

        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.custom_titlebar);

        Button btnkapat = (Button) findViewById(R.id.buttonBetonel);

        btnkapat.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                finish();
            }
        });

        final ImageButton iBLogo = (ImageButton) findViewById(R.id.iBLogo);
        Button btnTeklifAl = (Button) findViewById(R.id.btnETeklifAl);
        Button btnAra = (Button) findViewById(R.id.btnAra);
        Button btnHakkinda = (Button) findViewById(R.id.btnHakkinda);
        Button btnIletisim = (Button) findViewById(R.id.btnIletisim);
        Button btnCikis = (Button) findViewById(R.id.btnCikis);

        iBLogo.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){

                Toast.makeText(getApplicationContext(), "01100001 01101000 01101101 01100101 01110100 01101011 01101001 01101100 01101001 01101110 01100011 00101110 01101110 01100101 01110100", Toast.LENGTH_SHORT).show();
                return false;
                }
            });
/*
        iBLogo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(ilkSayfa.this, ScreenSlidePagerActivity.class);
                startActivity(intent);
            }
        });*/

        btnTeklifAl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(ilkSayfa.this, AsilSayfa.class);
                startActivity(intent);
            }
        });

        btnTeklifAl.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){

                Toast.makeText(getApplicationContext(), "Her zaman web sitemizi kullanarak tarayıcınız üzerinden teklif alabilirsiniz", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        btnAra.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                final Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+903123958125"));

                startActivity(callIntent);
            }
        });

        btnAra.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){

                Toast.makeText(getApplicationContext(), "Bu şekilde ulaşamadığınız taktirde, web sitemizde bize ulaşabilmeniz için telefon ve faks numaralarımız mevcuttur", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        btnHakkinda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(ilkSayfa.this, Hakkinda.class);
                startActivity(intent);
            }
        });

        btnHakkinda.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){

                Toast.makeText(getApplicationContext(), "Hakkımızda bilgi alabilmeniz için, web sitemize girebilir başarılarımızı ve şirket politikamızı inceleyebilirsiniz.", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        btnIletisim.setOnClickListener(new View.OnClickListener(){
              @Override
            public void onClick(View v){

                Intent intent = new Intent(ilkSayfa.this, Iletisim.class);
                startActivity(intent);
            }
        });

        btnIletisim.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){

                Toast.makeText(getApplicationContext(), "Proje ofisimiz ve Fabrikalarımız ile alakalı iletişim bilgileri ve adreslerine web sitemizden ulaşabilirsiniz", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        btnCikis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                finish();
            }
        });
    }
}
