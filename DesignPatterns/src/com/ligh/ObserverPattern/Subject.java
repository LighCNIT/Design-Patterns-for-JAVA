package com.ligh.ObserverPattern;

/**
 * 抽象主题角色
 * 三个功能：1.增加观察者，减少观察者，通知观察者
 * @author gh
 *
 */
public interface Subject {

	void addWacher(Wacher wacher);
	void removeWacher(Wacher wacher);
	void notifyWacher(String str);
}
