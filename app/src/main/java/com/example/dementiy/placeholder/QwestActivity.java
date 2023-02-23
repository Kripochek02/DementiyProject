package com.example.dementiy.placeholder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dementiy.R;

public class QwestActivity extends AppCompatActivity {

        LinearLayout buttons;
        TextView k,a,r,text,subject;
        Story story;
        Character character;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_quest2);
            k = findViewById(R.id.k);
            a = findViewById(R.id.a);
            r = findViewById(R.id.r);
            text = this.findViewById(R.id.text);
            subject = this.findViewById(R.id.subject);
            buttons = this.findViewById(R.id.Buttons);
            Situation start = Game.createStory();
            story = new Story(start);
            character = new Character("Da", 100, 100, 100);
            show(start);
        }
        public void show(Situation s) {
            text.setText((s.text));
            subject.setText(s.subject);
            character.a += s.dA;
            subject.setText(s.subject);
            character.r += s.dR;
            subject.setText(s.subject);
            character.k += s.dK;
            a.setText(character.a + "");
            r.setText(character.r + "");
            k.setText(character.k + "");
            int count = story.currentSituation.direction.length;
            for (int i = 0; i < count ; i++) {
                Button button = new Button(getBaseContext());
                int a = i + 1;
                button.setText("" + a);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        story.go(a);
                        buttons.removeAllViews();
                        show(story.currentSituation);
                    }
                });
                buttons.addView(button);
            }
        }
}