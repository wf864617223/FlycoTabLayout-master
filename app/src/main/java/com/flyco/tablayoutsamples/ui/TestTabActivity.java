package com.flyco.tablayoutsamples.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayoutsamples.R;
import com.flyco.tablayoutsamples.entity.TabEntity;

import java.util.ArrayList;

public class TestTabActivity extends AppCompatActivity {

    /**
     * 属性链接帮助地址：
     * http://blog.csdn.net/analyzesystem/article/details/51426473
     */
    private CommonTabLayout mTabLayout_8;
    private SubsamplingScaleImageView ivTest;
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    private String[] mTitles = {"首页", "消息", "联系人", "更多"};
    private int[] mIconUnselectIds = {
            R.mipmap.tab_home_unselect, R.mipmap.tab_speech_unselect,
            R.mipmap.tab_contact_unselect, R.mipmap.tab_more_unselect};
    private int[] mIconSelectIds = {
            R.mipmap.tab_home_select, R.mipmap.tab_speech_select,
            R.mipmap.tab_contact_select, R.mipmap.tab_more_select};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_tab);
        mTabLayout_8 = (CommonTabLayout) findViewById(R.id.tl_88);
        ivTest = (SubsamplingScaleImageView) findViewById(R.id.iv_test);
        ivTest.setImage(ImageSource.uri("/sdcard/nopicture.jpg"));
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }
        mTabLayout_8.setTabData(mTabEntities);
        //设置默认选中的item
        mTabLayout_8.setCurrentTab(0);
    }
}
