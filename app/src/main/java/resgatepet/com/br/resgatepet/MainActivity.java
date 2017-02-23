package resgatepet.com.br.resgatepet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_loginemail;
    private Button btn_logingoogle;
    private Button btn_loginfacebook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVariaveis();

        btn_loginemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginemail = new Intent(MainActivity.this, LoginEmail.class);
                startActivity(loginemail);
            }
        });


    }

    private void inicializarVariaveis() {

        btn_loginemail = (Button) findViewById(R.id.btn_loginemail);
        btn_logingoogle = (Button) findViewById(R.id.btn_logingoogle);
        btn_loginfacebook = (Button) findViewById(R.id.btn_loginfacebook);
    }

}
