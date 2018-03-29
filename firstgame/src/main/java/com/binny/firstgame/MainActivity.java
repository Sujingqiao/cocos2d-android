package com.binny.firstgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCGLSurfaceView;

public class MainActivity extends AppCompatActivity {
    /* 1
    * Cocos2d 框架引擎将会把图形绘制在改view上
    * */
    private CCGLSurfaceView mSurfaceView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSurfaceView = new CCGLSurfaceView(this);
        setContentView(mSurfaceView);

        /* 2
        * 得到一个CCDirector对象,一个 Cocos2d 应用中只有一个该对象
        * */
        CCDirector director = CCDirector.sharedDirector();
        /*
        * 设置当前Cocos2d App中使用的view
        * */
        director.attachInView(mSurfaceView);
        /*
        * 设置游戏是否显示 fps值 < 30 时，流畅
        * */
        director.setDisplayFPS(true);
        /*
        * 设置游戏渲染一帧数据所需要的频率
        * */
        director.setAnimationInterval(1/30.0);
        /*
        * 生成一个 场景对象
        * */
        CCScene scene = CCScene.node();
        /*
        * 生成图层对象
        * */
        GameLayer gameLayer = new GameLayer();
        /*
        * 讲布景层对象添加游戏场景中
        * */
        scene.addChild(gameLayer);
        /*
        * 运行游戏场景
        * */
        director.runWithScene(scene);
    }
}
