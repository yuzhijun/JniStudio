package com.lenovohit.jnistudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mTextView = (TextView)findViewById(R.id.tvText);
        JniUtil jniUtil = new JniUtil();
        mTextView.setText(jniUtil.append("aaa","dddd"));
    }
}
