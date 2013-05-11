package net.sinclairstudios.android.tutorialone;

import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.input_message_activity)
public class InputMessageActivity extends Activity {
    public final static String EXTRA_MESSAGE = InputMessageActivity.class.getCanonicalName() + ".message";

    @ViewById
    EditText editText;

    @Click
    public void sendButton() {
        Intent intent = new Intent(this, DisplayMessageActivity_.class);
        intent.putExtra(EXTRA_MESSAGE, editText.getText().toString());
        startActivity(intent);
    }
}
