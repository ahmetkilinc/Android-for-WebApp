package tr.com.betonel.betonelteklifuygulamasi;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class test extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Button btnGeri = (Button) findViewById(R.id.btnGeri);
        Button btnIleri = (Button) findViewById(R.id.btnIleri);

        btnGeri.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                final Snackbar snackbar = Snackbar.make(v, "Geri Yönlendirileceksiniz.", Snackbar.LENGTH_INDEFINITE);

                        snackbar.setAction("ok", new View.OnClickListener(){
                            @Override
                            public void onClick(View v){

                                snackbar.dismiss();
                                /*
                                Intent intent = new Intent(test.this, MainActivity.class);
                                startActivity(intent);*/
                            }
                        });
                snackbar.show();
            }
        });

        btnIleri.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(test.this, ilkSayfa.class);
                startActivity(intent);
            }
        });
    }
}
