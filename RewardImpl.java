package com.reward.points.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.reward.points.model.Customer;

@Service
public class RewardImpl implements RewardInterface {
	private List<Customer> list = List.of(new Customer(11, "John", 120, LocalDate.of(2025, 1, 10)),
			new Customer(12, "Rahul", 110, LocalDate.of(2025, 1, 25)),
			new Customer(13, "Tina", 75, LocalDate.of(2025, 2, 14)));

	@Override
	public Map<String, Object> calculateRewards(int cutomerId) {
		// TODO Auto-generated method stub
		Map<String, Integer> monthly = new HashMap<>();
		int totalPoints = 0;
		String cname = null;
		for (Customer cus : list) {
			if (cus.getCutomerId() == cutomerId) {
				cname = cus.getName();
				String month = cus.getDate().getMonth().toString();
				double amount = cus.getAmout();
				int points = calculatePoints(amount);
				monthly.put(month, monthly.getOrDefault(month, 0) + points);
				totalPoints += points;
			}

		}
		return Map.of("cutomerId", cutomerId, "cname", cname, "monthly", monthly, "totalPoints", totalPoints);
	}

	private int calculatePoints(double amount) {
		int points = 0;
		if (amount > 100) {
			points += (amount - 100) * 2 + (Math.min(amount, 100) - 50) * 1;

		} else if (amount > 50) {
			points += (Math.min(amount, 100) - 50) * 1;
		} else {
			return 0;
		}
		return points;
	}

}
