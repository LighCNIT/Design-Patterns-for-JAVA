package com.ligh.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现主题角色
 * @author gh
 *
 */
public class ConcreteSubject implements Subject {

	private List<Wacher> list = new ArrayList<Wacher>();

	@Override
	public void addWacher(Wacher wacher) {
		// TODO Auto-generated method stub
		list.add(wacher);
	}

	@Override
	public void removeWacher(Wacher wacher) {
		// TODO Auto-generated method stub
		list.remove(wacher);
	}

	@Override
	public void notifyWacher(String str) {
		// TODO 自动调用实际上是自动调用
		for (Wacher wacher : list) {

			wacher.update(str);

		}
	}

}
