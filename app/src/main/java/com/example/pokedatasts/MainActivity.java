package com.example.pokedatasts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.TextView.BufferType;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShuzokuDataTable.ShuzokuDataTable();
        // ボタン
        Button button = findViewById(R.id.button1);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editText;
        SpannableStringBuilder sb;
        String string;
        // H表示
        TextView textViewH = findViewById(R.id.TEXT_VAL_H);
        // A表示
        TextView textViewA = findViewById(R.id.TEXT_VAL_A);
        // B表示
        TextView textViewB = findViewById(R.id.TEXT_VAL_B);
        // C表示
        TextView textViewC = findViewById(R.id.TEXT_VAL_C);
        // D表示
        TextView textViewD = findViewById(R.id.TEXT_VAL_D);
        // S表示
        TextView textViewS = findViewById(R.id.TEXT_VAL_S);


        //努力値
        Doryokuti doryokuti = new Doryokuti();
        doryokuti = InputDoryokuti();
        //個体値
        Kotaiti kotaiti = new Kotaiti();
        kotaiti = InputKotaiti();
        //ステータスを取得する
        //　入力ID
        EditText editTextID = findViewById(R.id.EDITTEXT_pokeID);
        sb = (SpannableStringBuilder)editTextID.getText();
        string = sb.toString();
        int iInputID = Integer.parseInt(string);
        //　入力Lv
        editText = findViewById(R.id.EDITTEXT_Lv);
        sb = (SpannableStringBuilder)editText.getText();
        string = sb.toString();
        int iInputLv = Integer.parseInt(string);
        //　入力名前
        EditText editTextName = findViewById(R.id.EDITTEXT_NAME);
        sb = (SpannableStringBuilder)editTextName.getText();
        String strPokeName = sb.toString();

        PokemonPara pokepara =new PokemonPara(iInputID,iInputLv,strPokeName,doryokuti,kotaiti);

        //ID
        editTextID.setText(String.valueOf(pokepara.iID), BufferType.NORMAL);
        //名前
        editTextName.setText(pokepara.strName, BufferType.NORMAL);
        //H
        textViewH.setText(String.valueOf(pokepara.iH));
        //A
        textViewA.setText(String.valueOf(pokepara.iA));
        //B
        textViewB.setText(String.valueOf(pokepara.iB));
        //C
        textViewC.setText(String.valueOf(pokepara.iC));
        //D
        textViewD.setText(String.valueOf(pokepara.iD));
        //S
        textViewS.setText(String.valueOf(pokepara.iS));
   }

    //入力値から個体値を取得
    private Kotaiti InputKotaiti(){
        Kotaiti kotaiti = new Kotaiti();
        EditText editText;
        SpannableStringBuilder sb;
        String string;
        //個体値の取得
        //H
        editText = findViewById(R.id.EDITTEXT_KOTAITI_H);
        sb = (SpannableStringBuilder)editText.getText();
        string = sb.toString();
        kotaiti.iH = Integer.parseInt(string);
        //A
        editText = findViewById(R.id.EDITTEXT_KOTAITI_A);
        sb = (SpannableStringBuilder)editText.getText();
        string = sb.toString();
        kotaiti.iA = Integer.parseInt(string);
        //B
        editText = findViewById(R.id.EDITTEXT_KOTAITI_B);
        sb = (SpannableStringBuilder)editText.getText();
        string = sb.toString();
        kotaiti.iB = Integer.parseInt(string);
        //C
        editText = findViewById(R.id.EDITTEXT_KOTAITI_C);
        sb = (SpannableStringBuilder)editText.getText();
        string = sb.toString();
        kotaiti.iC = Integer.parseInt(string);
        //D
        editText = findViewById(R.id.EDITTEXT_KOTAITI_D);
        sb = (SpannableStringBuilder)editText.getText();
        string = sb.toString();
        kotaiti.iD = Integer.parseInt(string);
        //S
        editText = findViewById(R.id.EDITTEXT_KOTAITI_S);
        sb = (SpannableStringBuilder)editText.getText();
        string = sb.toString();
        kotaiti.iS = Integer.parseInt(string);

        return kotaiti;
    }

    //入力値から個体値を取得
    private Doryokuti InputDoryokuti(){
        Doryokuti doryoku = new Doryokuti();
        EditText editText;
        SpannableStringBuilder sb;
        String string;
        //努力値の取得
        //H
        editText = findViewById(R.id.EDITTEXT_DORYOKUTI_H);
        sb = (SpannableStringBuilder)editText.getText();
        string = sb.toString();
        doryoku.iH = Integer.parseInt(string);
        //A
        editText = findViewById(R.id.EDITTEXT_DORYOKUTI_A);
        sb = (SpannableStringBuilder)editText.getText();
        string = sb.toString();
        doryoku.iA = Integer.parseInt(string);
        //B
        editText = findViewById(R.id.EDITTEXT_DORYOKUTI_B);
        sb = (SpannableStringBuilder)editText.getText();
        string = sb.toString();
        doryoku.iB = Integer.parseInt(string);
        //C
        editText = findViewById(R.id.EDITTEXT_DORYOKUTI_C);
        sb = (SpannableStringBuilder)editText.getText();
        string = sb.toString();
        doryoku.iC = Integer.parseInt(string);
        //D
        editText = findViewById(R.id.EDITTEXT_DORYOKUTI_D);
        sb = (SpannableStringBuilder)editText.getText();
        string = sb.toString();
        doryoku.iD = Integer.parseInt(string);
        //S
        editText = findViewById(R.id.EDITTEXT_DORYOKUTI_S);
        sb = (SpannableStringBuilder)editText.getText();
        string = sb.toString();
        doryoku.iS = Integer.parseInt(string);

        return doryoku;
    }

}