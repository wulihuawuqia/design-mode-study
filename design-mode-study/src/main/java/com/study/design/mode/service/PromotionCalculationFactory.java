package com.study.design.mode.service;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PromotionCalculationFactory {

	private Map<String, PromotionCalculation> maps;

	public PromotionCalculation getPromotionCalculation(String promotion) {
		PromotionCalculation prom = maps.get(promotion);
		if (prom == null) {
			// 从配置的地方加载
			prom = getFromDb(promotion);
			if(prom != null)
			maps.put(promotion,prom);
		}

		return prom;
	}

	PromotionCalculation
}
