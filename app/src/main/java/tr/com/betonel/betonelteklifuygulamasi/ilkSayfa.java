package tr.com.betonel.betonelteklifuygulamasi;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.Toast;

import com.liuguangqiang.swipeback.SwipeBackLayout;

public class ilkSayfa extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_ilk_sayfa);

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

        iBLogo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(ilkSayfa.this, popUpSwipe.class);
                startActivity(intent);

/*
                LayoutInflater layoutInflater
                        = (LayoutInflater)getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.activity_pop_up_swipe, null);
                final PopupWindow popupWindow = new PopupWindow(

                        popupView,
                        DrawerLayout.LayoutParams.FILL_PARENT,
                        DrawerLayout.LayoutParams.FILL_PARENT);

                Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
                Button btnKapat = (Button) popupView.findViewById(R.id.button);

                btnKapat.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        popupWindow.dismiss();
                    }
                });

                btnDismiss.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v){

                        popupWindow.dismiss();
                    }});

                popupWindow.showAsDropDown(iBLogo, 50, 50);

                //Intent intent = new Intent(ilkSayfa.this, WebSiteAnasayfa.class);
                //startActivity(intent);*/
            }
        });

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

                Toast.makeText(getApplicationContext(), "Her zaman web sitemizi kullanarak tarayınız üzerinden teklif alabilirsiniz", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        btnAra.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                final Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+000000000000"));
                startActivity(callIntent);
            }
        });

        btnAra.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){

                Toast.makeText(getApplicationContext(), "Bu şekilde ulaşamadığınız taktirde, web sitemizde bize ulaşabilmeniz için numaramız mevcuttur", Toast.LENGTH_SHORT).show();
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

                Toast.makeText(getApplicationContext(), "Proje ofisimiz ve Fabrikalarımız ile alakalı iletişim bilgileri ve adreslerine de web sitemizden ulaşabilirsiniz", Toast.LENGTH_SHORT).show();
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
