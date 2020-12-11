    package com.example.companyapp;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.ImageView;
    import android.widget.Toast;

    import androidx.appcompat.app.AppCompatActivity;

    public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText et_test;
    private String str;
    ImageView test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_test = findViewById(R.id.et_test);



        btn_move = findViewById((R.id.btn_move));
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et_test.getText().toString();
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra( "str", str);
                startActivity(intent);

            }
        });

        test = (ImageView)findViewById((R.id.test));
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "홍드로이드 못생김", Toast.LENGTH_LONG).show();
            }
        });



    }
}