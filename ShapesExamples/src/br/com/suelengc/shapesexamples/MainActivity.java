package br.com.suelengc.shapesexamples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	private final String LOGIN = "admin";
	private final String SENHA = "123";
	
	private String loginClick = null;
	private String senhaClick = null;
	
    private EditText tLogin;
	private EditText tSenha;
	private Button btLogin;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        tLogin = (EditText) findViewById(R.id.tLogin);
        tSenha = (EditText) findViewById(R.id.tSenha);
        btLogin = (Button) findViewById(R.id.btLogin);

        btLogin.setOnClickListener(this);
        
        if(savedInstanceState != null){
        	loginClick = savedInstanceState.getString("login_key");
        }
        
        Toast.makeText(this, "Login: " + loginClick, Toast.LENGTH_LONG).show();
    }


	public void onClick(View view) {
		
		if(view == btLogin){
			
			loginClick = "xxxx";
			senhaClick = "123456";
			
			String login = tLogin.getText().toString();
			String senha = tSenha.getText().toString();
			
			if(LOGIN.equals(login) && SENHA.equals(senha)){

				Toast.makeText(this, "Login realizado com sucesso!", Toast.LENGTH_LONG).show();
				
				Intent intent = new Intent(this, ListaShapeActivity.class);
				startActivity(intent);

			}else{
				Toast.makeText(this, "Login ou senha invalidos!", Toast.LENGTH_LONG).show();
			}			
			
		}else {
			
		}
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putString("login_key", loginClick);
	}
	
}