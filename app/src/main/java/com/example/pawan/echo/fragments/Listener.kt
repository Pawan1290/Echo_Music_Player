package com.example.pawan.echo.fragments

import android.widget.SeekBar
import com.example.pawan.echo.fragments.SongPlayingFragment.Statified.mediaPlayer
import android.view.animation.DecelerateInterpolator
import com.example.pawan.echo.R.id.seekBar
import android.animation.ObjectAnimator
import com.example.pawan.echo.fragments.SongPlayingFragment.Statified.currentPosition


class Listener : SeekBar.OnSeekBarChangeListener {
    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        if(fromUser){
            mediaPlayer?.seekTo(progress)
            if (currentPosition > 0) {
                val animation = ObjectAnimator.ofInt(seekBar, "progress", currentPosition)
                animation.duration = 10
                animation.interpolator = DecelerateInterpolator()
                animation.start()
            }
        }
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {

    }

}
