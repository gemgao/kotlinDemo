package com.ruicheng.myapplication

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import kotlinx.android.synthetic.main.activity_scrolling.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        app_bar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
            if (verticalOffset == 0){
                toolbar_layout.title = "测试"
            }else if (Math.abs(verticalOffset) >= appBarLayout.totalScrollRange){
                toolbar_layout.title = "测试变化"
            }
        })
        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "确定开始kotlin吗？", Snackbar.LENGTH_LONG)
                    .setAction("kotlin确定", View.OnClickListener {
                        toast("点击成功")
                        startActivity<KontlinActivity>()
                    }).setActionTextColor(Color.YELLOW).show()

        }
    }
}
