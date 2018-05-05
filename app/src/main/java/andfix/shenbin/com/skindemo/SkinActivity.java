package andfix.shenbin.com.skindemo;

import android.os.Bundle;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;

public class SkinActivity extends AppCompatActivity {

    private SkinFactory factory = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        factory = new SkinFactory();
        LayoutInflaterCompat.setFactory(getLayoutInflater(),factory);
        SkinManager.getInstance().init(this);

        super.onCreate(savedInstanceState);
    }

    public void updateSkin(){
        factory.apply();
    }

}


