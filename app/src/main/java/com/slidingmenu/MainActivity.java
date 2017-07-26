 package com.slidingmenu;

 import android.os.Bundle;
 import android.support.v7.app.AppCompatActivity;
 import android.view.Menu;
 import android.view.View;
 import android.view.Window;

 import com.slidingmenu.view.SlidingMenu;

 public class MainActivity extends AppCompatActivity {
    private SlidingMenu mLeftMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题栏
        setContentView(R.layout.activity_main);
        mLeftMenu = (SlidingMenu)findViewById(R.id.id_menu);
    }

    public void toggleMenu(View view)
    {
    mLeftMenu.toggle();

    }

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.main,menu);
         return super.onCreateOptionsMenu(menu);
     }

 }
