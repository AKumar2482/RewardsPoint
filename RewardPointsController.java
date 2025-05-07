package com.reward.points.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reward.points.service.RewardInterface;

@RestController
@RequestMapping("/rewards")
public class RewardPointsController {
	@Autowired
	private RewardInterface ri;

	@GetMapping("/{cutomerId}")
	public Map<String, Object> getRewardsPoint(@PathVariable int cutomerId) {
		Map<String, Object> calculateRewards = ri.calculateRewards(cutomerId);

		return calculateRewards;

	}

}
