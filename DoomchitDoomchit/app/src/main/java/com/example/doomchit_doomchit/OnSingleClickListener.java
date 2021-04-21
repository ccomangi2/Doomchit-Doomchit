package com.example.doomchit_doomchit;

import android.os.SystemClock;
import android.view.View;

public abstract class OnSingleClickListener implements View.OnClickListener{
    //중복 클릭 방지 시간 설정 ( 해당 시간 이후에 다시 클릭 가능 )
    private static final long MIN_CLICK_INTERVAL = 600;
    // 이전에 클릭한 시간 변수
    private long mLastClickTime = 0;

    public abstract void onSingleClick(View v);

    @Override
    public final void onClick(View v) {
        // 현재 클릭한 시간 변수
        long currentClickTime = SystemClock.uptimeMillis();
        long elapsedTime = currentClickTime - mLastClickTime;
        mLastClickTime = currentClickTime;

        // 중복클릭 아닌 경우 (이전클리과 현재클릭의 시간차가 MIN_CLICK_INTERVAL 보다 큰 경우)
        if (elapsedTime > MIN_CLICK_INTERVAL) {
            onSingleClick(v);
        }
    }
}
