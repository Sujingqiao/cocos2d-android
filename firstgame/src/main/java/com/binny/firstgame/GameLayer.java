package com.binny.firstgame;

import org.cocos2d.actions.interval.CCJumpTo;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CCPointSize;
import org.cocos2d.types.CGPoint;

/**
 * author  binny
 * date 2018/3/29
 * 布景层
 */
public class GameLayer extends CCLayer{
    private CCSprite mSprite;
    public GameLayer() {
        /*
        * 添加精灵对象
        * */
        mSprite = CCSprite.sprite("player.png");
        /*
        * 设置精灵对象的位置
        * */
        CGPoint point = CGPoint.ccp(100,100);
        mSprite.setPosition(point);

        /*
        * 将该对象 mSprite 添加到布景层
        * */
        this.addChild(mSprite);
        /*
        * 生成jumpTo对象
        * */
        CCJumpTo jumpTo = CCJumpTo.action(3,CGPoint.ccp(500,100),200,5);
        /*
        * 使用精灵对象执行该动作
        * */
        mSprite.runAction(jumpTo);
    }
}
