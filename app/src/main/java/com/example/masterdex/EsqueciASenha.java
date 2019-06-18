package com.example.masterdex;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EsqueciASenha extends AppCompatActivity {

    TextInputEditText emailDigitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_asenha);

        emailDigitado = findViewById(R.id.email_textinput);

        Button buttonEnviar = findViewById(R.id.enviar_button);
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarClicado(view);
            }
        });
    }






    public void enviarClicado (View view){

        android.view.inputmethod.InputMethodManager teclado = (android.view.inputmethod.InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);

        if (teclado.isAcceptingText()){
            teclado.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);}
        //Em caso de teclado visível, este método esconde ele



        if (emailDigitado.getText().toString().equals("")){
            //Se não houver texto no campo do email, ele irá exibir o erro abaixo

            emailDigitado.setError("Digite um email");

        } else {
            //Caso o campo de email tenha algo, aparecerá um snackbar dizendo que o usuário foi cadastrado

            Snackbar.make(view, "Email enviado", Snackbar.LENGTH_INDEFINITE)
                    .setAction("OK", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    }).setActionTextColor(getResources().getColor(R.color.branco)).show();

        }




    }
}
