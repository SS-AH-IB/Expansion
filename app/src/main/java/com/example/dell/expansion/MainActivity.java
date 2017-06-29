package com.example.dell.expansion;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> wordlist;
    ArrayList<String> meaninglist;
    ArrayList<String> used_words;
    Boolean player_toggle=true;
    Boolean used_count=false;
    Dictionary_database db;
    Integer count_ply1=0,count_ply2=0;
    LinkedHashMap<String,String> namelist;
    TextView Q,W,E,R1,T,Y,U,I,O,P,A,S,D,F,G,H,J,K,L,Z,X,C,V,B,N,M;
    TextView expression,instructions,meaning_view,ply1,ply2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Q=(TextView) findViewById(R.id.Q);
        W=(TextView) findViewById(R.id.W);
        E=(TextView) findViewById(R.id.E);
        R1=(TextView) findViewById(R.id.R);
        T=(TextView) findViewById(R.id.T);
        Y=(TextView) findViewById(R.id.Y);
        U=(TextView) findViewById(R.id.U);
        I=(TextView) findViewById(R.id.I);
        O=(TextView) findViewById(R.id.O);
        P=(TextView) findViewById(R.id.P);
        A=(TextView) findViewById(R.id.A);
        S=(TextView) findViewById(R.id.S);
        D=(TextView) findViewById(R.id.D);
        F=(TextView) findViewById(R.id.F);
        G=(TextView) findViewById(R.id.G);
        H=(TextView) findViewById(R.id.H);
        J=(TextView) findViewById(R.id.J);
        K=(TextView) findViewById(R.id.K);
        L=(TextView) findViewById(R.id.L);
        Z=(TextView) findViewById(R.id.Z);
        X=(TextView) findViewById(R.id.X);
        C=(TextView) findViewById(R.id.C);
        V=(TextView) findViewById(R.id.V);
        B=(TextView) findViewById(R.id.B);
        N=(TextView) findViewById(R.id.N);
        M=(TextView) findViewById(R.id.M);
        expression=(TextView)findViewById(R.id.expression);
        ply1=(TextView)findViewById(R.id.ply1);
        ply2=(TextView)findViewById(R.id.ply2);
        instructions=(TextView)findViewById(R.id.instructions);
        meaning_view=(TextView)findViewById(R.id.meaning_view);

        Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("q");
                check();
            }
        });
        W.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("w");
                check();
            }
        });
        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("e");
                check();
            }
        });
        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("r");
                check();
            }
        });
        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("t");
                check();
            }
        });
        Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("y");
                check();
            }
        });
        U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("u");
                check();
            }
        });
        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("i");
                check();
            }
        });
        O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("o");
                check();
            }
        });
        P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("p");
                check();
            }
        });
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("a");
                check();
            }
        });
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("s");
                check();
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("d");
                check();
            }
        });
        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("f");
                check();
            }
        });
        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("g");
                check();
            }
        });
        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("h");
                check();
            }
        });
        J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("j");
                check();
            }
        });
        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("k");
                check();
            }
        });
        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("l");
                check();
            }
        });
        Z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("z");
                check();
            }
        });
        X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("x");
                check();
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("c");
                check();
            }
        });
        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("v");
                check();
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("b");
                check();
            }
        });
        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("n");
                check();
            }
        });
        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression.append("m");
                check();
            }
        });

        db=new Dictionary_database(this);
        loaddata();
        player_select(player_toggle);
    }

    public void loaddata(){
        db =new Dictionary_database(this);
        try {

            db.createDataBase();
            db.openDataBase();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        namelist=new LinkedHashMap<>();
        int pos;
        SQLiteDatabase sd = db.getReadableDatabase();
        Cursor cursor = sd.query("Dictionary1" ,null, null, null, null, null, null);
        pos=cursor.getColumnIndex("word");
        wordlist=new ArrayList<String>();
        meaninglist= new ArrayList<String>();
        used_words= new ArrayList<String>();
        while (cursor.moveToNext()){
            namelist.put(cursor.getString(pos), cursor.getString(cursor.getColumnIndex("definition")));
        }
        Iterator entries = namelist.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry thisEntry = (Map.Entry) entries.next();
            wordlist.add(String.valueOf(thisEntry.getKey()));
            meaninglist.add("- "+String.valueOf(thisEntry.getValue()));
        }
    }

    public void check(){
        String input_expression=expression.getText().toString();
        for (int p0=0;p0<used_words.size();p0++){
            if (input_expression.equals(used_words.get(p0))){
                used_count=true;
                break;
            }
            else {
                used_count=false;
            }
        }
        if (input_expression.length()>2 && !input_expression.equals("and") && used_count!=true){
            for (int p=0;p < wordlist.size(); p++){
                if (wordlist.get(p).equals(input_expression)){
                    used_words.add(input_expression);
                    expression.setText("");
                    meaning_view.setText(wordlist.get(p)+"\n"+meaninglist.get(p));
                    if (player_toggle==true){
                        count_ply2++;
                        count_ply1--;
                        ply1.setText(count_ply1.toString());
                        ply2.setText(count_ply2.toString());
                    }
                    else if (player_toggle==false){
                        count_ply2--;
                        count_ply1++;
                        ply1.setText(count_ply1.toString());
                        ply2.setText(count_ply2.toString());
                    }
                    used_count=false;
                    break;
                }
            }
        }
        if (player_toggle==true){
            player_toggle=false;
            player_select(player_toggle);
        }
        int a=0;
    }

    public void player_select(Boolean player){
        if (player==true){
            instructions.setText("Player 1 take your turn");
        }
        else {
            instructions.setText("Player 2 take your turn");
        }
    }
}
