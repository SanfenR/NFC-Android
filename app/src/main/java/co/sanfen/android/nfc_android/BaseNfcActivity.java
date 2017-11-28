package co.sanfen.android.nfc_android;

import android.app.PendingIntent;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.support.v7.app.AppCompatActivity;

/**
 * Created on 2017/11/28
 * Created by sanfen
 *
 * @version 1.0.0
 */

public class BaseNfcActivity extends AppCompatActivity {
    protected NfcAdapter mNfcAdapter;
    protected PendingIntent mPendingIntent;


    @Override
    protected void onStart() {
        super.onStart();
        mNfcAdapter = NfcAdapter.getDefaultAdapter(this);
        mPendingIntent = PendingIntent.getActivity(
                this,
                0,
                new Intent(this, getClass()), 0);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mNfcAdapter != null)
            mNfcAdapter.enableForegroundDispatch(this, mPendingIntent, null, null);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mNfcAdapter != null)
            mNfcAdapter.disableForegroundDispatch(this);
    }
}
