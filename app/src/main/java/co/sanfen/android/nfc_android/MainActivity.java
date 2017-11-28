package co.sanfen.android.nfc_android;

import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.os.Bundle;

public class MainActivity extends BaseNfcActivity implements NfcAdapter.CreateNdefMessageCallback {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mNfcAdapter.setNdefPushMessageCallback(this, this);
    }

    @Override
    public NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        return null;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
