package com.example.synthesizer;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonA;
    private Button buttonBb;
    private Button buttonB;
    private Button buttonScale;
    private Button buttonC;
    private Button buttonCc;
    private Button buttonD;
    private Button buttonDd;
    private Button buttonE;
    private Button buttonF;
    private Button buttonFf;
    private Button buttonG;
    private Button buttonGg;
    private Button buttonHighA;
    private Button buttonHighB;
    private Button buttonHighBb;
    private Button buttonHighC;
    private Button buttonHighCc;
    private Button buttonHighD;
    private Button buttonHighDd;
    private Button buttonHighE;
    private Button buttonHighF;
    private Button buttonHighFf;
    private Button buttonHighG;
    private Button buttonHighGg;
    private SoundPool soundPool;
    private int noteA;
    private int noteB;
    private int noteBb;
    private int noteC;
    private int noteCc;
    private int noteD;
    private int noteDd;
    private int noteE;
    private int noteF;
    private int noteFf;
    private int noteG;
    private int noteGg;
    private int noteHighA;
    private int noteHighB;
    private int noteHighBb;
    private int noteHighC;
    private int noteHighCc;
    private int noteHighD;
    private int noteHighDd;
    private int noteHighE;
    private int noteHighF;
    private int noteHighFf;
    private int noteHighG;
    private int noteHighGg;
    private Map<Integer, Integer> noteMap;
    public static final float DEFAULT_VOLUME = 1.0f;
    public static final int DEFAULT_PRORITY = 1;
    public static final int DEFAULT_RATE = 1;
    public static final int WHOLE_NOTE = 900; //IN MILLISECONDS

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        initializeSoundPool();
        initializeNoteMap();
    }

    private void initializeNoteMap() {
        noteMap = new HashMap<>();
        //in a map, you store a key:value pair
        //the key is the ButtonId, the value is the noteId
        noteMap.put(R.id.button_synth_a, noteA);
        noteMap.put(R.id.button_synth_b, noteB);
        noteMap.put(R.id.button_synth_bb, noteBb);
        noteMap.put(R.id.button_synth_c, noteC);
        noteMap.put(R.id.button_synth_cc, noteCc);
        noteMap.put(R.id.button_synth_d, noteD);
        noteMap.put(R.id.button_synth_dd, noteDd);
        noteMap.put(R.id.button_synth_e, noteE);
        noteMap.put(R.id.button_synth_f, noteF);
        noteMap.put(R.id.button_synth_ff, noteFf);
        noteMap.put(R.id.button_synth_g, noteG);
        noteMap.put(R.id.button_synth_gg, noteGg);
        noteMap.put(R.id.button_synth_higha, noteHighA);
        noteMap.put(R.id.button_synth_highb, noteHighB);
        noteMap.put(R.id.button_synth_highbb, noteHighBb);
        noteMap.put(R.id.button_synth_highc, noteHighC);
        noteMap.put(R.id.button_synth_highcc, noteHighCc);
        noteMap.put(R.id.button_synth_highd, noteHighD);
        noteMap.put(R.id.button_synth_highdd, noteHighDd);
        noteMap.put(R.id.button_synth_highe, noteHighE);
        noteMap.put(R.id.button_synth_highf, noteHighF);
        noteMap.put(R.id.button_synth_highff, noteHighFf);
        noteMap.put(R.id.button_synth_highg, noteHighG);
        noteMap.put(R.id.button_synth_highgg, noteHighGg);




    }

    private void initializeSoundPool() {
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 10);
        noteA = soundPool.load(this, R.raw.scalea, 1);
        noteB = soundPool.load(this, R.raw.scaleb, 1);
        noteBb = soundPool.load(this, R.raw.scalebb, 1);
        noteC = soundPool.load(this, R.raw.scalec, 1);
        noteCc = soundPool.load(this, R.raw.scalecs, 1);
        noteD = soundPool.load(this, R.raw.scaled, 1);
        noteDd = soundPool.load(this, R.raw.scaleds, 1);
        noteE = soundPool.load(this, R.raw.scalee, 1);
        noteF = soundPool.load(this, R.raw.scalef, 1);
        noteFf = soundPool.load(this, R.raw.scalefs, 1);
        noteG = soundPool.load(this, R.raw.scaleg, 1);
        noteGg = soundPool.load(this, R.raw.scalegs, 1);
        noteHighA = soundPool.load(this, R.raw.scalehigha, 1);
        noteHighB = soundPool.load(this, R.raw.scalehighb, 1);
        noteHighBb = soundPool.load(this, R.raw.scalehighbb, 1);
        noteHighC = soundPool.load(this, R.raw.scalehighc, 1);
        noteHighCc = soundPool.load(this, R.raw.scalehighcs, 1);
        noteHighD = soundPool.load(this, R.raw.scalehighd, 1);
        noteHighDd = soundPool.load(this, R.raw.scalehighds, 1);
        noteHighE = soundPool.load(this, R.raw.scalehighe, 1);
        noteHighF = soundPool.load(this, R.raw.scalehighf, 1);
        noteHighFf = soundPool.load(this, R.raw.scalehighfs, 1);
        noteHighG = soundPool.load(this, R.raw.scalehighg, 1);
        noteHighGg = soundPool.load(this, R.raw.scalehighgs, 1);

    }

    private void setListeners() {
        KeyboardNoteListener noteListener = new KeyboardNoteListener();
        buttonA.setOnClickListener(noteListener);
        buttonB.setOnClickListener(noteListener);
        buttonBb.setOnClickListener(noteListener);
        buttonC.setOnClickListener(noteListener);
        buttonCc.setOnClickListener(noteListener);
        buttonD.setOnClickListener(noteListener);
        buttonDd.setOnClickListener(noteListener);
        buttonE.setOnClickListener(noteListener);
        buttonF.setOnClickListener(noteListener);
        buttonFf.setOnClickListener(noteListener);
        buttonG.setOnClickListener(noteListener);
        buttonGg.setOnClickListener(noteListener);
        buttonHighA.setOnClickListener(noteListener);
        buttonHighB.setOnClickListener(noteListener);
        buttonHighC.setOnClickListener(noteListener);
        buttonHighCc.setOnClickListener(noteListener);
        buttonHighD.setOnClickListener(noteListener);
        buttonHighDd.setOnClickListener(noteListener);
        buttonHighE.setOnClickListener(noteListener);
        buttonHighF.setOnClickListener(noteListener);
        buttonHighFf.setOnClickListener(noteListener);
        buttonHighG.setOnClickListener(noteListener);
        buttonHighGg.setOnClickListener(noteListener);

        //challenge buttons still use the Activity's implementation
        buttonScale.setOnClickListener(this);
    }

    private void wireWidgets() {
        buttonA = findViewById(R.id.button_synth_a);
        buttonB = findViewById(R.id.button_synth_b);
        buttonBb = findViewById(R.id.button_synth_bb);
        buttonScale = findViewById(R.id.button_synth_nurseryrhyme);
        buttonC = findViewById(R.id.button_synth_c);
        buttonCc = findViewById(R.id.button_synth_cc);
        buttonD = findViewById(R.id.button_synth_d);
        buttonDd = findViewById(R.id.button_synth_dd);
        buttonE = findViewById(R.id.button_synth_e);
        buttonF = findViewById(R.id.button_synth_f);
        buttonFf = findViewById(R.id.button_synth_ff);
        buttonG = findViewById(R.id.button_synth_g);
        buttonGg = findViewById(R.id.button_synth_gg);
        buttonHighA = findViewById(R.id.button_synth_higha);
        buttonHighB = findViewById(R.id.button_synth_highb);
        buttonHighBb = findViewById(R.id.button_synth_highbb);
        buttonHighC = findViewById(R.id.button_synth_highc);
        buttonHighCc = findViewById(R.id.button_synth_highcc);
        buttonHighD = findViewById(R.id.button_synth_highd);
        buttonHighDd = findViewById(R.id.button_synth_highdd);
        buttonHighE = findViewById(R.id.button_synth_highe);
        buttonHighF = findViewById(R.id.button_synth_highf);
        buttonHighFf = findViewById(R.id.button_synth_highff);
        buttonHighG = findViewById(R.id.button_synth_highg);
        buttonHighGg = findViewById(R.id.button_synth_highgg);

        buttonScale = findViewById(R.id.button_synth_nurseryrhyme);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //   case R.id.button_synth_a:
            //       soundPool.play(noteA, 1.0f, 1.0f,1,0,1.0f);
            //   case R.id.button_synth_b:
            //       soundPool.play(noteB, 1.0f, 1.0f,1,0,1.0f);
            //   case R.id.button_synth_bb:
            //      soundPool.play(noteBb, 1.0f, 1.0f,1,0,1.0f);
            //       break;
            case R.id.button_synth_nurseryrhyme:
                try {
                    playscale();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
        }
    }


        private void playscale () throws InterruptedException {


            playNote(noteA);
            delay(WHOLE_NOTE);
            playNote(noteA);
            delay(WHOLE_NOTE/2);
            playNote(noteA);
            playNote(noteA);
            delay(WHOLE_NOTE);
            playNote(noteG);
            delay(WHOLE_NOTE);
            playNote(noteF);
            delay(WHOLE_NOTE);
            playNote(noteF);
            delay(WHOLE_NOTE/2);
            playNote(noteE);
            delay(WHOLE_NOTE );
            playNote(noteE);
            delay(WHOLE_NOTE);
            playNote(noteD);
            delay(WHOLE_NOTE);
            playNote(noteD);
            delay(WHOLE_NOTE/2);
            playNote(noteC);
            delay(WHOLE_NOTE);
            playNote(noteG);
            delay(WHOLE_NOTE);
            playNote(noteG);
            delay(WHOLE_NOTE/2);
            playNote(noteG);
            delay(WHOLE_NOTE);
            playNote(noteF);
            delay(WHOLE_NOTE/2);
            playNote(noteF);
            delay(WHOLE_NOTE);
            playNote(noteE);
            delay(WHOLE_NOTE/2);
            playNote(noteE);
            delay(WHOLE_NOTE / 2);
            playNote(noteE);
            delay(WHOLE_NOTE);
            playNote(noteD);
            delay(WHOLE_NOTE);
            playNote(noteC);
            delay(WHOLE_NOTE);
            playNote(noteG);
            delay(WHOLE_NOTE);
            playNote(noteG);
            delay(WHOLE_NOTE/2);
            playNote(noteG);
            delay(WHOLE_NOTE / 2);
            playNote(noteF);
            delay(WHOLE_NOTE / 3);
            playNote(noteF);
            delay(WHOLE_NOTE);
            playNote(noteF);
            delay(WHOLE_NOTE);
            playNote(noteE);
            delay(WHOLE_NOTE);
            playNote(noteE);
            delay(WHOLE_NOTE);
            playNote(noteE);
            delay(WHOLE_NOTE / 2);
            playNote(noteD);
            delay(WHOLE_NOTE);
            playNote(noteC);
            playNote(noteC);
            delay(WHOLE_NOTE);
            playNote(noteC);
            delay(WHOLE_NOTE);
            playNote(noteG);
            delay(WHOLE_NOTE);
            playNote(noteG);
            delay(WHOLE_NOTE);
            playNote(noteA);
            delay(WHOLE_NOTE);
            playNote(noteA);
            delay(WHOLE_NOTE/2);
            playNote(noteA);
            playNote(noteA);
            delay(WHOLE_NOTE);
            playNote(noteG);
            delay(WHOLE_NOTE);
            playNote(noteF);
            delay(WHOLE_NOTE);
            playNote(noteF);
            delay(WHOLE_NOTE/2);
            playNote(noteE);
            delay(WHOLE_NOTE );
            playNote(noteE);
            delay(WHOLE_NOTE);
            playNote(noteD);
            delay(WHOLE_NOTE);
            playNote(noteD);
            delay(WHOLE_NOTE/2);
            playNote(noteC);

        }

        private void playNurseryRhyme () throws InterruptedException {
            playscale();
        }
        private void delay ( int duration) throws InterruptedException {
            try {
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private void playSong (Song song){


        }
        private void playNote ( int note, int loop){
            soundPool.play(note, DEFAULT_VOLUME, DEFAULT_VOLUME, DEFAULT_PRORITY, loop, DEFAULT_RATE);
        }
        private void playNote ( int note){
            playNote(note, 0);
        }
        private void playNote (Note note){
            playNote(note.getNoteId());
        }
        private class KeyboardNoteListener implements View.OnClickListener {
            @Override
            public void onClick(View view) {
                int id = view.getId();
                int note = noteMap.get(id);
                playNote(note);
            }
        }

    }
