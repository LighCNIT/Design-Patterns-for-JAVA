package com.ligh.StrategyPattern;

/**
 * 策略类用于调用相应实现策略
 * 1.当在不同的时间有不同的业务规则时，便可使用策略模式
 * @author gh
 *
 */
public class CashContext {
	
	CashSuper cs = null;
	
	public CashContext(String type){
		switch (type) {
		case "正常收费":
			CashNormal cs0 = new CashNormal();
			cs = cs0;
			break;
		case "打8折":
			CashRebate cs1 = new CashRebate("0.8");
			cs = cs1;
			break;
		case "满300减100":
			CashReturn cs2 = new CashReturn("300", "100");
			cs = cs2;
			break;

		default:
			break;
		}
		
	}
	
	public double getResult(double money){
		
		return cs.acceptCash(money);
	}
	

}
