package info.slidingmenu.model.my.button_exercises.app;

import android.view.View;

/**
 * Created by Benjiw on 5/12/2014.
 */
public class ColorSetter implements View.OnClickListener {
    private int mRegionColor;
    private MainActivity mMainActivity;
    public ColorSetter(int regionColor, MainActivity mainActivity) {
        this.mRegionColor = regionColor;
        this.mMainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mMainActivity.setRegionColor(mRegionColor);
    }
}
